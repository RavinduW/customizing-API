package com.rest.boot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.boot.models.User;
import com.rest.boot.repositories.UserRepository;
import com.rest.boot.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAllUsers() {
		List<User> listOfUsers = userRepository.findAll();
		return listOfUsers;
	}

	@Override
	public String saveUser(User user) {
		userRepository.save(user);
		return "User added";
	}

	@Override
	public String updateUser(User user) {
		String msg = null;
		if(user.getId() != null) {
			userRepository.save(user);
			msg = "User updated";
		}else {
			msg = "Update failed !";
		}
		return msg;
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}
	
}
