package com.javaCurso.cursoJava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaCurso.cursoJava.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
     
	@GetMapping
	public ResponseEntity<User> findAll(){
		User us = new User(1L, "henrique", "henriqueemail@gmail.com", "974848586", "1234");
		return ResponseEntity.ok().body(us);
	}
}
