package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.abm.entity.User;

@Repository 
public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void addUser(User user) {
		entityManager.merge(user);
	}

}
