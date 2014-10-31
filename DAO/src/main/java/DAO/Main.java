package DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans/beans.xml");
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

		/*
		 * Offers offer= offersDao.getOffers("Kushal");
		 * System.out.println(offer);
		 */
		try {
			// offersDao.delete(8);
			// Offers offer1 = new Offers("Jonathan", "jon@cave.com",
			// "coding java is fun");
			// Offers offer2 = new Offers("Jon", "jon@cgmail.com",
			// "coding SPRING is fun");
			// if (offersDao.create(offer1))
			// System.out.println("Object created");
			// if (offersDao.create(offer2))
			// System.out.println("Object created");

			// Offers offer = new Offers(5,"kushalupdate","update@update.com",
			// "this is a update");
			// if(offersDao.update(offer)) System.out.println("Object updated");
			
			List<Offers>  offerarray= new ArrayList<Offers>();
			offerarray.add (new Offers(415,"user415","user1@gmail.com","this is some text"));
			offerarray.add(new Offers(625,"user2","user2@gmail.com","this is some text again"));
			
			int[] vals=offersDao.create(offerarray);
			for(int value:vals){
				System.out.println("updated "+ value + " rows.");
			}
			
			

			List<Offers> offers = offersDao.getOffers();
			for (Offers off : offers) {
				System.out.println(off);
			}

		} catch (CannotGetJdbcConnectionException e) { // this specific catch is
														// for the JDBC
														// connection exceptions
														// while the lower one
														// is more generic
			System.out.println("CannotGetJdbcConnectionException.");
		} catch (DataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		((ClassPathXmlApplicationContext) context).close();

	}
}
