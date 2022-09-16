package com.quintrex.Assignment6.service;

import java.util.List;

import com.quintrex.Assignment6.model.User;

public interface UserService {
	public List<User> getUsers();
	public User postUser(User user);
	public void deleteUser(String userName, int userId);
	public void putUser(User user);
}
