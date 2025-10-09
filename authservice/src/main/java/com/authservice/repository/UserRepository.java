package com.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	User findByUsername(String username);//same as a call second call using FeignClient method 
	User findByEmail(String email);
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);
}
