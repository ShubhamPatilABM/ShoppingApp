package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.abm.entity.User;
import com.abm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/newUser")
	public String newUser(User user) {
		userService.registerUser(user);
		return "confirmation.jsp";
	}

}
