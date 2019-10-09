package com.rest.boot.services;

import java.util.List;
import java.util.Optional;

import com.rest.boot.models.User;

public interface UserService {
	
	List<User> findAllUsers();
	String saveUser(User user);
	String updateUser(User user);
	Optional<User> findById(Integer id);
	String deleteUser(Integer id);	
}
