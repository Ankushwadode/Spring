package springmvcsearch.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import springmvcsearch.Controller.Student;


@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home(){
		System.out.println("This is home view");
//		processing...
//		String s=null;
//		System.out.println(s.length());
		return "home";
	}
	
//	complex form url side work
	@RequestMapping("/cforms")
	public String form(){
		System.out.println("This is complex form");
		return "cforms";
	}
	
//	complex form handler
	@RequestMapping(path="/handleform" , method=RequestMethod.POST)
	public String formhandler(@ModelAttribute("student") Student student,BindingResult result){
		if (result.hasErrors()) {
			return "cforms";
		}
		System.out.println(student);
		return "success";
	}

//search page handler
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query") String query){
		RedirectView rv=new RedirectView();
		String url="https://www.google.com/search?q="+query;
		if(query.isEmpty()){
		rv.setUrl("home");
		}else{
			rv.setUrl(url);
		}
		return rv;
	}

//upload file handler
	@RequestMapping("/fileupload")
	public String showUploadForm(){
//		String str=null;
//		System.out.println(str.charAt(0));
		return "fileupload";
	}
	
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("file")CommonsMultipartFile file,HttpSession s,Model m){
		System.out.println("file upload handler");
//		System.out.println(file.getName());
//		System.out.println(file.getContentType());
//		System.out.println(file.getSize());
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getStorageDescription());
//		getting file data...
		byte[] b=file.getBytes();
//		saving...
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator
				+file.getOriginalFilename();
		System.out.println(path);
		try{
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(b);
		fos.close();
		System.out.println("file uploaded...");
		m.addAttribute("msg", "Uploaded successfully...");
		m.addAttribute("filename", file.getOriginalFilename());
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("uploading error.....");
			m.addAttribute("msg", "something went wrong...");
		}
		return"filesuccess";
	}
	
//	path variable
	@RequestMapping("/book/{bookid}/{username}")
	public String book(@PathVariable("bookid") int uid,@PathVariable("username") String uname){
		System.out.println(uid);
		System.out.println(uname);
//		Integer.parseInt(uname);
		return "home";
	}

//	handling welcome request
	@RequestMapping("/welcome")
	public String we(){
		return "welcome";
	}
//	form action handler
	@RequestMapping("come")
	public String welcome(@RequestParam(name="user")String user,Model m){
		System.out.println(user);
		m.addAttribute("user", user);
		return "result";
	}
	
////	null pointer exception handler
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String nullexceptionHandler(Model m){
//		m.addAttribute("msg", "Null Pointer Exception Has Occured.");
//		return "null_page";
//	}
//	
////	number format exception handler
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String numberformatexceptionHandler(Model m){
//		m.addAttribute("msg", "Number Format Exception Has Occured.");
//		return "null_page";
//	}
//	
////	generic exception handler
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String genericexceptionHandler(Model m){
//		m.addAttribute("msg", " Exception Has Occured.");
//		return "null_page";
//	}	
}
