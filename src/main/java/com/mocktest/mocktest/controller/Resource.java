package com.mocktest.mocktest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mocktest.mocktest.entity.User;
import com.mocktest.mocktest.repository.UserRepository;

@RestController
@RequestMapping("/all")
public class Resource {

	private UserRepository userRepository;

	public Resource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/")
	public List<User> all(){
		return userRepository.findAll();
	}
}
