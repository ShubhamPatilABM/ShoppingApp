package com.abm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abm.entity.Product;
import com.abm.entity.Retailer;
import com.abm.entity.User;
import com.abm.service.ProductService;
import com.abm.service.RetailerService;
import com.abm.service.UserService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	

	@RequestMapping("/showProduct")
	public String viewProduct(@RequestParam("p_category") String productCategory,Map<String, Object> model) {
		List<Product> product = productService.fetching("p_category");
		model.put("product", product);
//		productService.viewProduct(product);
		return "ProductView.jsp";
	}
	 
	

}
