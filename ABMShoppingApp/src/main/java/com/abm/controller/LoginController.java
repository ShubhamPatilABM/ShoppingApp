package com.abm.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abm.dao.LoginDao;

import com.abm.entity.User;

public class LoginController {
	
	@RequestMapping(value = "/LoginPage",method = RequestMethod.POST)
	protected String doPost() {
		User userLog = new User();
		String userEmail = userLog.getUserEmail("userEmail");
		String userPassword = userLog.getUserPassword("userPassword");
	
		
		LoginDao dao = new LoginDao();
		boolean result = dao.validate(userEmail, userPassword);
		
		if(result) {
			return "confirmation.jsp";
		}
		return "Failed.jsp";
		
		
	}


}
