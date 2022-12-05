package com.abm.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.dao.ProductDao;
import com.abm.entity.Product;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private Product product;
	
	public List<Product> viewProduct(Product product) {
		return productDao.fetchAllProducts();
	}

	public List<Product> fetching(String productCategory) {
		
		return productDao.fetchByCategory(productCategory);
	}
	
//	public List<Product> fetchByPriceRange(float productPrice1, float productPrice2) {
//		List<Product> list = productDao.fetchAllProducts();
//		
//		List<Object> rangeProductList = list.stream().filter(prod -> productPrice1 <= product.getProductPrice() && productPrice2 >= product.getProductPrice())
//				.collect(Collectors.toList());
//		list.forEach(emp -> System.out.println(emp));

}
