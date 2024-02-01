package org.example.controller;

import org.example.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.example.model.Product;
import org.example.model.User;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public Set<User> trouverListUsers() {
		return userService.findAll();
	}

	@GetMapping(value = "/authentificate")
	public User login(@RequestBody User user) {
		return userService.authentificate(user);
	}

}