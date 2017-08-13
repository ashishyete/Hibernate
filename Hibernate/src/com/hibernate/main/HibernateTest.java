/**
 * 
 */
package com.hibernate.main;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.UserDetails;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class HibernateTest {
	
	final static Logger log = Logger.getLogger(HibernateTest.class);

	public static void main(String[] args) {
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUsername("Ashish");
				
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sf);
		
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
		
		sf.close();

	}

}
