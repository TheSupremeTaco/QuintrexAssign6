package com.quintrex.Assignment6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrex.Assignment6.dao.UserDao;
import com.quintrex.Assignment6.model.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	@Override
	public User postUser(User user) {
		// TODO Auto-generated method stub
		return userDao.postUser(user);
	}

	@Override
	public void deleteUser(String userName, int userId) {
		// TODO Auto-generated method stub
		userDao.deleteUser(userName, userId);
	}

	@Override
	public void putUser(User user) {
		// TODO Auto-generated method stub
		userDao.putUser(user);
	}

}
