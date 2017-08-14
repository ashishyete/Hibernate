/**
 * 
 */
package com.hibernate.main;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
		
		session.close();
		sessionFactory.close();
		
	}

}
