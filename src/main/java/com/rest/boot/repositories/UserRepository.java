package com.rest.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.boot.models.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
