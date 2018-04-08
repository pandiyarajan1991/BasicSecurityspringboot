package com.basicsecurity.springboot.service;




import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.basicsecurity.springboot.domain.UserDomain;
import com.basicsecurity.springboot.repository.PersonReposity;



@Service
public class UserService {
	
	@Autowired
	PersonReposity personReposity;
	
	
	
	public void createUser(UserDomain user) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword())); 
		personReposity.save(user);
	}
	
	public boolean isUserPresent(String email) {
		// TODO Auto-generated method stub
		UserDomain u = personReposity.findOne(email);
		if(u!=null)
			return true;
		
		return false;
	}
	
	public UserDomain findOne(String email) {
		
		  return personReposity.findOne(email);
		}
	
	public List<UserDomain>getAllUsersByList(){
		List<UserDomain> users = new ArrayList<>();
		for(UserDomain user : personReposity.findAll()) {
			users.add(user);		
		}
		return users;
	}

}
