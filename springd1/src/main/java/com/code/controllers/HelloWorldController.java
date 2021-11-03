package com.code.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class HelloWorldController {

	@GetMapping("list")
	public String index() {
		return "For test api";
	}
}
