package com.abm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.dao.LoginDao;
import com.abm.dao.UserDao;
import com.abm.entity.User;

@Service
@Transactional // Business logic should be in transaction
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public void registerLogin(User user) {
		loginDao.addUserEmail(user);
	}

}
