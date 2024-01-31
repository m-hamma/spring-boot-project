package org.example.controller;

import org.example.service.ProductService;
import org.example.service.UserService;
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
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/authentificate")
	public User trouverListUserst(@RequestBody User user) {
		return userService.authentificate(user);
	}

}