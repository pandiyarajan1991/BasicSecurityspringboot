package com.basicsecurity.springboot.contorller;


import java.awt.PageAttributes.MediaType;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basicsecurity.springboot.domain.UserDomain;
import com.basicsecurity.springboot.repository.PersonReposity;
import com.basicsecurity.springboot.service.UserService;



@RestController
public class ViewController {
	
	@Autowired
	PersonReposity PersonReposity;
	
	@Autowired
	UserService userService;
	
	@GetMapping(path ="/profile")
	public ResponseEntity<List<UserDomain>> listUsers(Model model){
		 List<UserDomain> user = userService.getAllUsersByList();
		 if (user.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
		 model.addAllAttributes(user);
	        return new ResponseEntity<List<UserDomain>>(user, HttpStatus.OK);
	}
	


}
