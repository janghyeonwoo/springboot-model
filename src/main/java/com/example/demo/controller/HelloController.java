package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;

@RestController
public class HelloController {
	
	@PostMapping("/hi")
	public User hello(@RequestBody User body) {
		System.out.println("boody" +body);
		User user = new User();
		user.setAge(3);
		user.setName("ghooo");
		return user;
	}
	


}
