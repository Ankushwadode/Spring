package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
//	first way 
//	@RequestMapping("/one")
//	public String one(){
//		System.out.println("this handler one.");
//		return "redirect:/two";
//	}

//	second way
	@RequestMapping("/one")
	public RedirectView one(){
		System.out.println("this is handler one");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two(){
		System.out.println("this is handler two");
		return "Info";
	}
}
