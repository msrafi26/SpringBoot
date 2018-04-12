package com.example.service;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Role;
import com.example.bean.User;
import com.example.repo.RoleRepository;
import com.example.repo.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
    
	@Override
	public void saveUser(User user) {
		user.setPassword("rafeek");
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
	
	public boolean validateUser(User user) {
		User user1 = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

		return user1 != null ? true : false;

	}

}