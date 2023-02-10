package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class InfoController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/Info")
//	handler
	public String showForm(Model m){
		m.addAttribute("Header", "Registration Form.");
		m.addAttribute("Desc", "Gerneral informaton collection form");
		return "Info";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String HandleForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		if(user.getEmail().isEmpty()){
			return "redirect:/Info";
		}
		int u=this.userService.createUser(user);
		model.addAttribute("msg", "User Created Successfully with id: "+u);
		return "success";
	}
}





//first way
/*
 	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String HandleForm(@RequestParam("email")String useremail,@RequestParam("name")String username,
			@RequestParam("password")String userpassword,Model model)
	{
		
//		System.out.println("user email: "+useremail);
//		System.out.println("user name: "+username);
//		System.out.println("user password: "+userpassword);
		
		User user=new User();
		user.setEmail(useremail);
		user.setName(username);
		user.setPassword(userpassword);
		
		System.out.println(user);
		
//		process can be like putting data in database
		
//		model.addAttribute("name", username);
//		model.addAttribute("email", useremail);
//		model.addAttribute("password",userpassword);
		
		model.addAttribute("user", user);
		return "success";
	}
 */
