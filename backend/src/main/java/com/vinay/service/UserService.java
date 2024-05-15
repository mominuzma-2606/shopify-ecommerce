package com.vinay.service;

import java.util.List;

import com.vinay.exception.UserException;
import com.vinay.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
