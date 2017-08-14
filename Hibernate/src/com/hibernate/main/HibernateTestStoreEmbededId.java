/**
 * 
 */
package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dto.OfficeDetails;
import com.hibernate.dto.OfficePrimary;
import com.hibernate.util.HibernateUtil;

/**
 * @author Ashish
 *
 */
public class HibernateTestStoreEmbededId {

	public static void main(String[] args) {
		
		OfficePrimary offPri = new OfficePrimary();
		offPri.setOfficeId(1);
		offPri.setOfficePriority(1);
		offPri.setTotalEmp(20);
		
		OfficeDetails offDetails = new OfficeDetails();
		offDetails.setOfficePrimary(offPri);
		offDetails.setBranchName("LittletonBranch");
		offDetails.setLocation("Littleton");
		offDetails.setOfficeName("Centurylink");
		
		
		// get Hibernate Session Factory from Hibernate Util
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.openSession(sf);
		session.beginTransaction();
		session.save(offDetails);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.sessionFactoryShutdown();
		
		
		
		
	}
	
	
}
