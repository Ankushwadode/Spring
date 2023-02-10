package com.springcrud.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.springcrud.dao.ProductDao;
import com.springcrud.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m){
		List<Product> product = productDao.getProduct();
		m.addAttribute("products", product);
		return "index";
	}
	
//	add product form
	@RequestMapping("/addProduct")
	public String addProduct(Model m){
		m.addAttribute("title", "AddProduct");
		return "addProduct_form";
	}
	
//	edit product
	@RequestMapping("/update-product/{productid}")
	public String updateform(@PathVariable("productid") int productid,Model m){
		Product product = this.productDao.getProduct(productid);
		m.addAttribute("product", product);
		return "update-product";
	}
	
//	delete product
	@RequestMapping("/delete-product/{productid}")
	public RedirectView deleteProduct(@PathVariable("productid") int productid,HttpServletRequest req){
		this.productDao.deleteProduct(productid);
		RedirectView rd=new RedirectView();
		rd.setUrl(req.getContextPath()+"/");
		return rd;
	}
	
//	handling product form
	@RequestMapping(value="/handle-product", method=RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product,HttpServletRequest req){
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView rd=new RedirectView();
		rd.setUrl(req.getContextPath()+"/");
		return rd;
	}
}
