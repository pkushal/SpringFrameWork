package com.kushal.springframework.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushal.springframework.web.DAO.User;
import com.kushal.springframework.web.DAO.UsersDAO;

@Service("usersService")
public class UsersService {

	private UsersDAO usersDao;

	@Autowired
	public void setUsersDao(UsersDAO usersDao) {
		this.usersDao = usersDao;
	}

	public void create(User user) {
		usersDao.create(user);
	}

	public boolean exists(String username) {
		return usersDao.exists(username);
	}

}
