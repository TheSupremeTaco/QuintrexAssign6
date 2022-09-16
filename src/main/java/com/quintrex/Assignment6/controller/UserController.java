package com.quintrex.Assignment6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quintrex.Assignment6.model.User;
import com.quintrex.Assignment6.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public List<User> getUsers(){
		return userService.getUsers();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public User postUsers(@RequestBody User user)
	{
		return userService.postUser(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value= "/user/{userName}/{userId}")
	public void deleteUser(@PathVariable String userName, @PathVariable int userId) 
	{
		userService.deleteUser(userName, userId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/user")
	public void putUser(@RequestBody User user)
	{
		userService.putUser(user);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/init")
	public void initDB()
	{
		userService.initDB();
	}
}
