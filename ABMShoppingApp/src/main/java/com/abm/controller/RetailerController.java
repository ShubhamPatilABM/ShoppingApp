package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abm.entity.Retailer;
import com.abm.entity.User;
import com.abm.service.RetailerService;
import com.abm.service.UserService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService retailerService;

	@RequestMapping("/newRetailer")
	public String newUser(Retailer retailer) {
		retailerService.registerRetailer(retailer);
		return "confirmation.jsp";
	}

}
