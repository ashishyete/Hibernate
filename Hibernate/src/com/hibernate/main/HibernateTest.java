/**
 * 
 */
package com.hibernate.main;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.EmployeeDetails;
import com.hibernate.dto.UserDetails;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class HibernateTest {
	
	final static Logger log = Logger.getLogger(HibernateTest.class);

	public static void main(String[] args) {
		
		//User Details 
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(2);
		userDetails.setUsername("Ashish");
		
		//Employee Details
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setEmpId(1);
		empDetails.setEmpName("Ashish");
		empDetails.setJoinedDate(new Date());
		empDetails.setAddress("Denver");
		empDetails.setDescription("Employee Details");
		
				
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sf);
		
		session.beginTransaction();
		session.save(userDetails);
		session.save(empDetails);
		session.getTransaction().commit();
		session.close();
		
		sf.close();

	}

}
