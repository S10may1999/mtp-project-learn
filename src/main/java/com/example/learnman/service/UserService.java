package com.example.learnman.service;

import com.example.learnman.entity.UsersLogin;

public interface UserService {
	public UsersLogin saveData(UsersLogin userlogin);
	public UsersLogin getUsersLogin();
}
