package org.example.controller;

import org.example.model.Command;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CommandController {

	@GetMapping(value = "/commands")
	public List<Command> trouverListCommands() {
		return null;
	}

}
