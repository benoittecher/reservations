

import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.doranco.hibernate.entity.Personne;
import fr.doranco.hibernate.util.Dates;
import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.model.dao.UserDao;
import fr.doranco.reservations.model.session.HibernateConnector;


public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
//		User user1 = new User("Albert", "Camus","ge@key.com","jay","1234hh","");
//		User user2 = new User("Paul", "Gilbert", "hey@hello.com","hello","HGF11","");
		Transaction tx;
		Session session = HibernateConnector.getInstance().getSession();
		System.out.println(session);
		/*tx = session.beginTransaction();
		session.save(user1);
		session.save(user2);
		tx.commit();
		
		
		
	
		System.exit(0);*/

    }

}