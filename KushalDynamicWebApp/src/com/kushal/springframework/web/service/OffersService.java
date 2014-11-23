package com.kushal.springframework.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
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
	@Secured({"ROLE_USER", "ROLE_USER"})
	public void create(Offers offers) {
		offersDao.create(offers);
	}

	//this method was just created for forcing the exception, not a part of the code
	public void throwTestException() {
		offersDao.getOffers(987979);

	}
}
