package com.ritmodev.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritmodev.userdept.entities.User;
import com.ritmodev.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	public UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}
}
