package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
	try {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
	} catch (Exception e) {
		System.err.println("initial session creation failed " + e);
		throw new ExceptionInInitializerError(e);
	}
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
