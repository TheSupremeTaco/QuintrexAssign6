package com.quintrex.Assignment6.model;

public class User {
	String userName;
	String passWord;
	int userId;
	
	public User(String userName, String passWord, int userId)
	{
		this.userName = userName;
		this.passWord = passWord;
		this.userId = userId;
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
