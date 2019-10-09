package com.rest.boot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rest.boot.models.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	@Query("SELECT u FROM User u WHERE u.firstname = :firstname")
	Optional<User> findByFirstname(@Param("firstname") String firstname);

}
