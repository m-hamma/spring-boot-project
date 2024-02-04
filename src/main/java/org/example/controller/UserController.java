package org.example.controller;

import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import org.example.model.Product;
import org.example.model.User;

import java.util.List;
import java.util.Set;

@RestController
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "api/users")
	public Set<User> trouverListUsers() {
		return userService.findAll();
	}

	@PostMapping(value = "api/authenticate")
	public User login(@RequestBody User user) {
		return userService.authentificate(user);
	}

}