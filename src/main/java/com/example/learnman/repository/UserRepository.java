package com.example.learnman.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learnman.entity.UsersLogin;

@Repository
public interface UserRepository extends JpaRepository<UsersLogin,Integer> {
	Optional<UsersLogin> getUserByEmailId(String email);
}
