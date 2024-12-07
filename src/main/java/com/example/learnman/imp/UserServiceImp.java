package com.example.learnman.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learnman.entity.UsersLogin;
import com.example.learnman.repository.UserRepository;
import com.example.learnman.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public UsersLogin saveData(UsersLogin userlogin) {
		return userRepo.save(userlogin);
	}

	@Override
	public UsersLogin getUsersLogin() {
		// TODO Auto-generated method stub
		return null;
	}

}
