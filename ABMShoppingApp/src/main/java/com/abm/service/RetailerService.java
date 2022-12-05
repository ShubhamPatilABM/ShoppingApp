package com.abm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.dao.RetailerDao;
import com.abm.dao.UserDao;
import com.abm.entity.Retailer;

@Service
@Transactional // Business logic should be in transaction
public class RetailerService {

	@Autowired
	private RetailerDao retailerDao;

	public void registerRetailer(Retailer retailer) {
		retailerDao.addRetailer(retailer);
	}
	
	public Retailer findByid(int retId) {
	
		Retailer r= retailerDao.fetchDetails(retId);
		return r;
		
	}

}
