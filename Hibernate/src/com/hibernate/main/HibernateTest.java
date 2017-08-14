/**
 * 
 */
package com.hibernate.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.Address;
import com.hibernate.dto.EmployeeDetails;
import com.hibernate.dto.StudentDetails;
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
		userDetails.setUserId(1);
		userDetails.setUsername("Ashish");
		
		//Employee Details
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setEmpId(1);
		empDetails.setEmpName("Ashish");
		empDetails.setJoinedDate(new Date());
		empDetails.setAddress("Denver");
		empDetails.setDescription("Employee Details");
		empDetails.setListOfAddress(loadWithAddr());
		empDetails.setListOfAddr(loadWithAddr1());
				
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sf);
		
		session.beginTransaction();
		session.save(userDetails);
		session.save(empDetails);
		session.getTransaction().commit();
		session.close();
		
		sf.close();

	}
	
	public static Set<Address> loadWithAddr() {
	
		Set<Address> ss = new HashSet<>();
		
		Address addr = new Address();
		addr.setStreet("1200 S Oneida St");
		addr.setState("Colorado");
		addr.setCity("Denver");
		addr.setZip("80224");

		ss.add(addr);
		
		Address addr1 = new Address();
		addr1.setStreet("700 W Mineral Avenue");
		addr1.setState("Colorado");
		addr1.setCity("Littleton");
		addr1.setZip("80120");
		
		ss.add(addr1);
		return ss;
		
	}
	
	public static Collection <Address> loadWithAddr1() {
		
		Collection<Address> ss = new ArrayList<>();
		
		Address addr = new Address();
		addr.setStreet("1200 S Oneida St");
		addr.setState("Colorado");
		addr.setCity("Denver");
		addr.setZip("80224");

		ss.add(addr);
		
		Address addr1 = new Address();
		addr1.setStreet("700 W Mineral Avenue");
		addr1.setState("Colorado");
		addr1.setCity("Littleton");
		addr1.setZip("80120");
		
		ss.add(addr1);
		return ss;
		
	}

}
