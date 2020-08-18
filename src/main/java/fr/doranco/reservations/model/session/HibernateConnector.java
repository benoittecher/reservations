package fr.doranco.reservations.model.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Singleton de getConnection
 * @author DIALLO
 *
 */
public class HibernateConnector { 
	
	private static HibernateConnector instance;
	private Configuration config;
	private ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	private HibernateConnector() {
		try {
			config = new Configuration().configure(); // pour chercher par defaut le fichier "hibernate.cfg.xml" dans le dossier resources
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
			serviceRegistryBuilder.applySettings(config.getProperties());
			serviceRegistry = serviceRegistryBuilder.build();
			sessionFactory = config.buildSessionFactory(serviceRegistry);
		}catch(Throwable ex) {
			System.out.println("Echec de la création et de l'initialisation de la sessionFactory");
			System.out.println(ex);
			throw new ExceptionInInitializerError(ex);
		}

	}
	
	public static HibernateConnector getInstance() {
		if(instance == null) {
			instance = new HibernateConnector();
		}
		return instance;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getSession() { // on va créer une session en testant si on est connecté d'abord
		Session session = sessionFactory.openSession();
		if(!session.isConnected()) {
			sessionFactory = config.buildSessionFactory(serviceRegistry);
		}
		return session;
	}
	
	
	

}
