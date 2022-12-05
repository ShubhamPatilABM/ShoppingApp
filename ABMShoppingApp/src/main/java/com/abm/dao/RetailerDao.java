package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import javax.persistence.Query;

import com.abm.entity.Retailer;

@Repository 
public class RetailerDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPU");
	EntityManager em=emf.createEntityManager();

	@PersistenceContext
	private EntityManager entityManager;

	public void addRetailer(Retailer retailer) {
		entityManager.merge(retailer);
	}
	
	
public Retailer fetchDetails(int retId){
		
		
		Query q=em.createQuery("select r from Retailer r where r.retId=:em");//HQL/JPQL
		q.setParameter("em",retId);
		Retailer retailer=(Retailer) q.getSingleResult();
		em.close();
		emf.close();
		
		return retailer;
		
	}

}
