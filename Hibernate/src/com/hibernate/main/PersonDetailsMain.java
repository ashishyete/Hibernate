/**
 * 
 */
package com.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.PersonDetails;
import com.hibernate.dto.Vehicle;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class PersonDetailsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDetails pd = new PersonDetails();
		pd.setPersonName("Ashish");
		pd.setPersonAge("32");
		pd.setPersonDOB(new Date());
		
		Vehicle veh = new Vehicle();
		veh.setVehicleName("MAZDA");
		veh.setDateOfPurchase(new Date());
		
		pd.setVehicle(veh);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sf);
		session.beginTransaction();
		session.save(pd);
		session.save(veh);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.sessionFactoryShutdown();
		
		
		
	}

}
