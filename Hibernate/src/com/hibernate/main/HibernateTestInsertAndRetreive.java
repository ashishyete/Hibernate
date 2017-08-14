/**
 * 
 */
package com.hibernate.main;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.Address;
import com.hibernate.dto.StudentDetails;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class HibernateTestInsertAndRetreive {

	public static final Logger log = Logger.getLogger(HibernateTestInsertAndRetreive.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a Session factory from Hibernte Util
		SessionFactory sf = HibernateUtil.getSessionFactory();
		// create Session from Session Factory ( use Hibernate util)
		Session session = HibernateUtil.openSession(sf);
		// begin transaction
		session.beginTransaction();
		//session.save(loadStudentDetails());
		session.save(loadStudentDetailsWithAddr());
		log.info("object of student details persisted");
		session.getTransaction().commit();
		
		
		// retreive from database using get Command
		
		StudentDetails stuDetails = (StudentDetails)session.get(StudentDetails.class, 1);
		log.info("student name : "+stuDetails.getName());	
		log.info("student rollNo : "+stuDetails.getRollNo());
		log.info("student className : "+stuDetails.getClassName());
		log.info("student sectionName : "+stuDetails.getSectionName());
		log.info("student Stu Description : "+stuDetails.getStudentDescription());
		log.info("student date Of birth : "+stuDetails.getDob());
		// retreive home address details
		log.info("Student home addr street : "+stuDetails.getHomeAddress().getStreet());
		log.info("Student home addr city : "+stuDetails.getHomeAddress().getCity());
		log.info("Student home addr state : "+stuDetails.getHomeAddress().getState());
		log.info("Student home addr zip : "+stuDetails.getHomeAddress().getZip());
		
		// retreive school address details
		log.info("Student school addr street : "+stuDetails.getSchAddress().getStreet());
		log.info("Student school addr city : "+stuDetails.getSchAddress().getCity());
		log.info("Student school addr state : "+stuDetails.getSchAddress().getState());
		log.info("Student school addr zip : "+stuDetails.getSchAddress().getZip());
		
		session.close();
		HibernateUtil.sessionFactoryShutdown();
	}

	
	public static StudentDetails loadStudentDetails() {
		StudentDetails sd = new StudentDetails();
		//sd.setRollNo(1);
		sd.setName("Ashish");
		sd.setClassName("7");
		sd.setSectionName("B");
		sd.setDob(new Date());
		sd.setTimeEntry(new Date());
		sd.setStudentDescription("Good Student");		
		return sd;
		
	}
	
	public static StudentDetails loadStudentDetailsWithAddr() {
		StudentDetails sd = new StudentDetails();
		//sd.setRollNo(1);
		sd.setName("Ashish");
		sd.setClassName("7");
		sd.setSectionName("B");
		sd.setDob(new Date());
		sd.setTimeEntry(new Date());
		sd.setStudentDescription("Good Student");		
		
		Address addr = new Address();
		addr.setStreet("1200 S Oneida St");
		addr.setState("Colorado");
		addr.setCity("Denver");
		addr.setZip("80224");

		sd.setHomeAddress(addr);
		
		Address addr1 = new Address();
		addr1.setStreet("700 W Mineral Avenue");
		addr1.setState("Colorado");
		addr1.setCity("Littleton");
		addr1.setZip("80120");
		
		sd.setSchAddress(addr1);
		return sd;
		
	}
	
	
}
