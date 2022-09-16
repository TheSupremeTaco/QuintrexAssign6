package com.quintrex.Assignment6.model;

public class User {
	String userName;
	String passWord;
	int userId;
	
	public User(int userId, String userName, String passWord)
	{
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
	}

	public User()
	{
		this.userName = "JohnDoe";
		this.passWord = "test";
		this.userId = 420;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
