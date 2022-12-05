package com.abm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
