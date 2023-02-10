package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home" ,method=RequestMethod.GET)
	public String home(Model model){
		System.out.println("index url");
		
		model.addAttribute("name", "Ankush wadode");
		model.addAttribute("id",123);
		
		List<String> friends= new ArrayList<String>();
		friends.add("rohit");
		friends.add("ram");
		friends.add("sham");
		friends.add("sita");
		friends.add("ankush");
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping(value="/about")
	public String about(){
		System.out.println("about controller");
		return "about";
	}
	
	@RequestMapping(value="/help")
	public ModelAndView help(){
		System.out.println("home controller");
		
//		created model and view object
		ModelAndView modelAndView=new ModelAndView();
		
//		setting the data
		modelAndView.addObject("name", "Ankush J Wadode");
		modelAndView.addObject("id", 139);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
//		marks list
		List<Integer> list=new ArrayList<Integer>();
		list.add(01);
		list.add(02);
		list.add(03);
		list.add(04);
		list.add(05);
		list.add(06);
		modelAndView.addObject("mark", list);
		
//		setting view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
