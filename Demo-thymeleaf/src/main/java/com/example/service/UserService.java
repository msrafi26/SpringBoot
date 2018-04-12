package com.example.service;


import com.example.bean.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public boolean validateUser(User user);
}