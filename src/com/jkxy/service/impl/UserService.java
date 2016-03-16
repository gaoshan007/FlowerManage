package com.jkxy.service.impl;

import java.util.List;

import com.jkxy.dao.IUserDAO;
import com.jkxy.model.User;
import com.jkxy.service.IUserService;

public class UserService implements IUserService{
	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean addOrUpdateUser(User user) {
		return userDAO.addOrUpdateUser(user);
	}

	@Override
	public User checkUser(User user) {
		return userDAO.checkUser(user);
	}

	@Override
	public boolean guashiUser(int id) {
		return userDAO.guashiUser(id);
	}

	@Override
	public boolean jieguaUser(int id) {
		return userDAO.jieguaUser(id);
	}

	@Override
	public List getGuashi() {
		return userDAO.getGuashi();
	}
	
	
}
