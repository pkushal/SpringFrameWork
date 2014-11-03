package com.kushal.springframework.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushal.springframework.web.DAO.Offers;
import com.kushal.springframework.web.DAO.OffersDAO;

@Service("offersService")
public class OffersService {

	private OffersDAO offersDao;

	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	public List<Offers> getCurrent() {
		return offersDao.getOffers();
	}
}
