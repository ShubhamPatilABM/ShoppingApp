package com.abm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.dao.UserDao;
import com.abm.entity.User;

@Service
@Transactional // Business logic should be in transaction
public class UserService {

	@Autowired
	private UserDao bankingDao;

	public void registerUser(User user) {
		bankingDao.addUser(user);
	}

}
