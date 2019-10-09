package com.rest.boot.services;

import java.util.List;
import java.util.Optional;

import com.rest.boot.exceptions.UserNotFoundException;
import com.rest.boot.models.User;

public interface UserService {
	
	List<User> findAllUsers();
	String saveUser(User user);
	String updateUser(User user);
	User findById(Integer id) throws UserNotFoundException;
	String deleteUser(Integer id);
	User findByFirstname(String firstname)throws UserNotFoundException;	
}
