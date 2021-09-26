package com.bridgelabz.differentrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestApiController {

	@RequestMapping(value = {"/",""})
	public String hello() {
		return "Hello From Bridgelabz";
	}
}