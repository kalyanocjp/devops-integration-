package com.kalyan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MySayHello {
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hi how are you",HttpStatus.ACCEPTED);
	}

}
