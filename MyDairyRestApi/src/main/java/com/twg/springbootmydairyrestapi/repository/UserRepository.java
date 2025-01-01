package com.twg.springbootmydairyrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springbootmydairyrestapi.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
}
