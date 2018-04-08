package com.basicsecurity.springboot.contorller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.basicsecurity.springboot.domain.UserDomain;


@Controller
public class PersonController {
	
	@GetMapping("/")
	public String showIndexPage() {	
		return "index";  
	}
	
	@GetMapping("/login") 
	public String showLoginForm() {
		
		return "loginForm";  
	}
	
	@GetMapping("/register")
	public String registerForm(Model model) {

		model.addAttribute("user", new UserDomain());
		return "registerForm";
	}
	
	@GetMapping("/userdetails")
	public String detailsForm(Model model) {

		model.addAttribute("user", new UserDomain());
		return "viewpage";
	}
	

}
