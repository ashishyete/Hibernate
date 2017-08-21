/**
 * 
 */
package com.hibernate.main;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.Address;
import com.hibernate.dto.EmployeeDetails;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class HibernateRetreive {
	
	public final static Logger log = Logger.getLogger(HibernateRetreive.class);
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sessionFactory);
		session.beginTransaction();
		
		EmployeeDetails empDetails = null;
		
		empDetails = (EmployeeDetails)session.get(EmployeeDetails.class, 1);
		
		log.info("Emp Id : "+empDetails.getEmpId());
		log.info("Emp Username : "+empDetails.getEmpName());
		log.info("Emp Username : "+empDetails.getDescription());
		session.close();
		sessionFactory.close();
		log.info("Collection Size ::  "+empDetails.getListOfAddr().size());
		for(Address ad : empDetails.getListOfAddr()) {
			log.info(ad.getStreet());
			log.info(ad.getCity());
			log.info(ad.getState());
			log.info(ad.getZip());
		
		}

		
	}

}
