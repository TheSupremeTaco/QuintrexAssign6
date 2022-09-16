package com.quintrex.Assignment6.dao;

import com.quintrex.Assignment6.model.User;

import java.util.List;

public interface UserDao {
	public void initDB();
	public List<User> getUsers();
	public User postUser(User user);
	public void deleteUser(String userName, int userId);
	public void putUser(User user);
}
