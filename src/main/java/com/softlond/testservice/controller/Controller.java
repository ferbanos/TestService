package com.softlond.testservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softlond.testservice.model.entities.UserDto;

@RestController
public class Controller {
	@GetMapping("/{path}")
	public ResponseEntity<String> get(
			@PathVariable String path, 
			@RequestParam String request) {

		return ResponseEntity.ok("Path: " + path + " Request: " + request);
	}
	
	@GetMapping
	public ResponseEntity<UserDto> get() {
		
		return ResponseEntity.ok(new UserDto("Fernando", "Baños"));
	}
	
	@PostMapping
	public ResponseEntity<UserDto> create(@RequestBody UserDto user) {
	
		return ResponseEntity.ok(user);
	}
	
	@PutMapping
	@ResponseBody
	public UserDto update() {
	
		return new UserDto("New Fernando", "Baños");
	}
	
	@DeleteMapping
	public String delete() {
	
		return "Servicio DELETE";
	}
	
}
