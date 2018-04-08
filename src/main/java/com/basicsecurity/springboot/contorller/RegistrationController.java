package com.basicsecurity.springboot.contorller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.basicsecurity.springboot.domain.UserDomain;
import com.basicsecurity.springboot.service.UserService;



@Controller
public class RegistrationController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
    public String registerUser(@Valid UserDomain user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "registerForm";
		}
		if(userService.isUserPresent(user.getEmail())) {
			model.addAttribute("exist",true);
			return "registerForm";
		}
		userService.createUser(user);
		
		return "loginForm";

	}
	
}
