package com.hibernate.main;

import org.hibernate.Session;

import com.hibernate.dto.Rectangle;
import com.hibernate.dto.ShapeDetails;
import com.hibernate.dto.Triangle;
import com.hibernate.util.HibernateUtil;

public class MainShapeDetails {

	public static void main(String[] args) {
		
		ShapeDetails sd = new ShapeDetails();
		sd.setShapeDesc("Set shape Description");
		
		Triangle t = new Triangle();
		t.setNumberOfSides(3);

		Rectangle r = new Rectangle();
		r.setNumberOfSides(4); 
		
		
		Session session = HibernateUtil.openSession(HibernateUtil.getSessionFactory());
		session.beginTransaction();
		session.save(sd);
		session.save(r);
		session.save(t);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.sessionFactoryShutdown();
		
		
	}
	
	
}
