package com.springcrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springcrud.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
//	creating product....
	@Transactional
	public void createProduct(Product product){
		this.hibernatetemplate.saveOrUpdate(product);
	}
	
//	getting all products....
	public List<Product> getProduct(){
		List<Product> Products = this.hibernatetemplate.loadAll(Product.class);
		return Products;
	}
	
//	deleting the product
	@Transactional
	public void deleteProduct(int pid){
		Product u = this.hibernatetemplate.load(Product.class, pid);
		this.hibernatetemplate.delete(u);
	}
//	get the single product
	public Product getProduct(int pid){
		return this.hibernatetemplate.get(Product.class, pid);
	}
}
