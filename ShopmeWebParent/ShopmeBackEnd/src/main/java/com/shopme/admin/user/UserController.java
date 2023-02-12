package com.shopme.admin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	/*
	 * @Autowired private User
	 */	
	
	@GetMapping("/users")
	public String listAll() {
		return  "users";
	}
}
