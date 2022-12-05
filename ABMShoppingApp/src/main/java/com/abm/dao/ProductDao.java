package com.abm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.abm.entity.Product;

@Repository
public class ProductDao {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Product> fetchAllProducts() {
		Query q = entityManager.createQuery("select p from Product p");
		List<Product> allProductList = q.getResultList();
		return allProductList;
	}

	public List<Product> fetchByCategory(String productCategory) {
		Query q = entityManager.createQuery("select p from Product p where p.productCategory = :productCategory");
		q.setParameter("productCategory", productCategory);
		List<Product> productListByCategory = q.getResultList();
		return productListByCategory;
	}

}
