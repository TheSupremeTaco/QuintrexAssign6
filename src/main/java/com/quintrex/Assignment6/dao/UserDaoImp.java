package com.quintrex.Assignment6.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quintrex.Assignment6.model.User;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class UserDaoImp implements UserDao{
	
		@Autowired
		JdbcTemplate jdbcTemplate;

		@Override
		public List<User> getUsers() {
			// TODO Auto-generated method stub
			String sql = "SELECT * FROM user";
			List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
			System.out.print(query);
			return query;
		}

		@Override
		public User postUser(User user) {
			// TODO Auto-generated method stub
			User newUser = new User();
			newUser.setUserName(newUser.getUserName());
			newUser.setPassWord(newUser.getPassWord());
			newUser.setUserId(newUser.getUserId());
			String sql = "INSERT INTO user(userId,userName,passWord) VALUES ("
					+ "\"" + newUser.getUserId() + "\","
					+ "\"" + newUser.getPassWord()	+ "\","
					+ "\"" + newUser.getUserName() + "\");";
			jdbcTemplate.update(sql);
			return newUser;
		}

		@Override
		public void deleteUser(String userName, int userId) {
			// TODO Auto-generated method stub
			String sql = "DELETE FROM user WHERE userId="+userId+"AND userName =\""
					+ userName + "\");";
			jdbcTemplate.update(sql);
		}

		@Override
		public void putUser(User user) {
			// TODO Auto-generated method stub
			String sql = "UPDATE user SET userName = \"" + user.getUserName() + "\" WHERE userId = \""
					+ user.getUserId() + ";";
			jdbcTemplate.update(sql);
		}

		@Override
		public void initDB() {
			// TODO Auto-generated method stub
			List<String> sqlExec = new ArrayList<String>();
			sqlExec.add("DROP DATABASE IF EXISTS testDB");
			sqlExec.add("CREATE DATABASE testDB");
			sqlExec.add("USE testDB");
			sqlExec.add("CREATE TABLE user("
					+ "UserID int not null,"
					+ "userName varchar(255),"
					+ "passWord varchar(255),"
					+ "primary key(userID))");
			System.out.println("Succesfully created user table");
			//Adding dummy employee entries
			sqlExec.add("INSERT INTO user(userID, userName, passWord)"
					+ "values (1,\"JonnyTest\",\"jman1\")");
			sqlExec.add("INSERT INTO user(userID, userName, passWord)"
					+ "values (2,\"Mikez\",\"mikey123\")");
			sqlExec.add("INSERT INTO user(userID, userName, passWord)"
					+ "values (3,\"D0en\",\"gamer12\")");
			sqlExec.add("INSERT INTO user(userID, userName, passWord)"
					+ "values (4,\"Yeye\",\"zez09\")");
			for(String i: sqlExec)	jdbcTemplate.update(i);

		}
}
