package com.hibernate.main;

import org.hibernate.Session;

import com.hibernate.dto.PersonDetails;
import com.hibernate.dto.PersonPersonalDetails;
import com.hibernate.dto.Vehicle;
import com.hibernate.util.HibernateUtil;

public class OneToManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Vehicle();
		v.setVehicleName("A");
		v.setVehicleModel("B");
		
		
		Vehicle v1 = new Vehicle();
		v1.setVehicleName("A");
		v1.setVehicleModel("B");
		
		PersonPersonalDetails ppd =  new PersonPersonalDetails();
		ppd.setEmail("Ashish.yete@gmail.com");
		ppd.setSSN("1234-89-111");
		
		
		PersonDetails pd = new PersonDetails();
		pd.setPersonName("Ashish");
		pd.setPersonDesc("asdasasd");
		pd.getVehicle().add(v);
		pd.getVehicle().add(v1);
		pd.setPpd(ppd);
		
		
		
		Session session = HibernateUtil.openSession(HibernateUtil.getSessionFactory());
		session.beginTransaction();
		session.save(pd);
		session.save(v1);
		session.save(v);
		session.save(ppd);
		session.getTransaction().commit();
		session.close(); 
		HibernateUtil.sessionFactoryShutdown();
		
		
		
	}

}
