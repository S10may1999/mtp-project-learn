package com.example.learnman.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learnman.entity.UsersLogin;

public interface UserRepository extends JpaRepository<UsersLogin,Integer> {
	Optional<UsersLogin> getUserByEmailId(String email);
}
