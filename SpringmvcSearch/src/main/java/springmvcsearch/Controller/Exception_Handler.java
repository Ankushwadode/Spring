//package springmvcsearch.Controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ControllerAdvice
//public class Exception_Handler {
//	// null pointer exception handler
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NullPointerException.class)
//	public String nullexceptionHandler(Model m) {
//		m.addAttribute("msg", "Null Pointer Exception Has Occured.");
//		return "null_page";
//	}
//
//	// number format exception handler
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NumberFormatException.class)
//	public String numberformatexceptionHandler(Model m) {
//		m.addAttribute("msg", "Number Format Exception Has Occured.");
//		return "null_page";
//	}
//
//	// generic exception handler
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String genericexceptionHandler(Model m) {
//		m.addAttribute("msg", " Exception Has Occured.");
//		return "null_page";
//	}
//}
