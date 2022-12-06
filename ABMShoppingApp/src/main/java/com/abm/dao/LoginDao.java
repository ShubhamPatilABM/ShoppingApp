package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.abm.entity.User;

public class LoginDao {
	public Boolean validate(String userEmail, String userPassword) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		
		User user = new User(); 
		try {
		user = (User) em.createQuery(" select u from User u where u.userEmail = :userEmail").setParameter("userEmail", userEmail)
				.getSingleResult();
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		if(userEmail != null && user.getUserPassword().equals(userPassword) && user.getUserEmail().equals(userEmail)) {
			
			return true;
		}
			em.close();
			emf.close();
			return false;
		
	}
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void addUserEmail(User user) {
		
		entityManager.persist(user);
	}
		

}
