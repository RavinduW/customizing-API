package com.rest.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.boot.models.User;
import com.rest.boot.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/all-users")
	public List<User> allUsers() {
		return userService.findAllUsers();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/find/{id}")
	public Optional<User> getUserById(@PathVariable Integer id){
		return userService.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		return userService.deleteUser(id);
	}
}
