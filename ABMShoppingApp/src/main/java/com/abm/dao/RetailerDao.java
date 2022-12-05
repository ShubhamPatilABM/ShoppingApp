package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.abm.entity.Retailer;

@Repository 
public class RetailerDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void addRetailer(Retailer retailer) {
		entityManager.merge(retailer);
	}

}
