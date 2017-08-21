/**
 * 
 */
package com.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.Owner;
import com.hibernate.dto.OwnerCars;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class CarOwnerMain {

	
	public static void main(String[] args) {
		
		OwnerCars oc = new OwnerCars();
		oc.setCarName("Mazda");
		oc.setCarType("Sedan");
		oc.setCarValue(5000.00);
		
		
		OwnerCars oc1 = new OwnerCars();
		oc1.setCarName("Honda");
		oc1.setCarType("Suv");
		oc1.setCarValue(15000.00);
		
		
		OwnerCars oc2 = new OwnerCars();
		oc2.setCarName("Toyota");
		oc2.setCarType("Sedan");
		oc2.setCarValue(7000.00);
		
		Owner owner = new Owner();
		owner.setOwnerName("Ashish");
		owner.setOwnerDescription("From India");
		owner.setOwnerEntryDate(new Date());
		owner.setOwnerCars(oc);
		owner.getOwnerCarsSet().add(oc);
		owner.getOwnerCarsSet().add(oc1);
		owner.getOwnerCarsSet().add(oc2);
		
		
		OwnerCars oc3 = new OwnerCars();
		oc3.setCarName("Mazda");
		oc3.setCarType("Sedan");
		oc3.setCarValue(5000.00);
		
		
		OwnerCars oc4 = new OwnerCars();
		oc4.setCarName("Honda");
		oc4.setCarType("Suv");
		oc4.setCarValue(15000.00);
		
		
		OwnerCars oc5 = new OwnerCars();
		oc5.setCarName("Toyota");
		oc5.setCarType("Sedan");
		oc5.setCarValue(7000.00);
		
		Owner owner1 = new Owner();
		owner1.setOwnerName("Nidhi");
		owner1.setOwnerDescription("From India");
		owner1.setOwnerEntryDate(new Date());
		owner1.setOwnerCars(oc3);
		owner1.getOwnerCarsSet().add(oc3);
		owner1.getOwnerCarsSet().add(oc4);
		owner1.getOwnerCarsSet().add(oc5);
		
		
		
		// create hibernate Session Factory
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sf);
		session.beginTransaction();
		session.save(owner);
		session.save(owner1);
		session.getTransaction().commit();
		
		Owner own = (Owner) session.get(Owner.class, 2);
		System.out.println("OwnerId " +own.getOwnerId() + " >> " + " Owner Name " + own.getOwnerName() );
		
		OwnerCars oweC = own.getOwnerCars();
		System.out.println(oweC.getCarName());
		session.close();
		HibernateUtil.sessionFactoryShutdown();
		
		
	}
	
}
