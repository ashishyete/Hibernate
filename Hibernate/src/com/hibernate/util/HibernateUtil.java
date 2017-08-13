/**
 * 
 */
package com.hibernate.util;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author Ashish This call will return Hibernate Session Factory.
 */
public class HibernateUtil {
	
final static Logger log = Logger.getLogger(HibernateUtil.class);

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
			if (sessionFactory == null) {
				/*Configuration configuration = new Configuration().configure();
				StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
				ssrb.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = ssrb.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);*/
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}

		} catch (Exception ex) {
			log.error("Error Caught while creating Hibernate Session factory");
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		log.info("Returning Session Factory");
		return sessionFactory;
		
	}

	public static void sessionFactoryShutdown() {
		log.info("Session factory Shutdown");
		getSessionFactory().close();
	}
		
	
	public static Session openSession(SessionFactory sf) {
		log.info("Session Open");
		return sf.openSession();
	}

}
