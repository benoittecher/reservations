import org.hibernate.Session;

import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.model.session.HibernateConnector;


public class Main {

	public static void main(String[] args) {

//		final Session session = HibernateConnector.getInstance().getSession();
//		System.out.println("ma session : " + session);
//		session.close();
//		System.exit(0);
		
		UserControl userControl = new UserControl();
		Adresse adresse1 = new Adresse(10, "Rue de la Paix", "Paris", "75001");
		
		User user1 = new User("Francois", "Camus","ge@key.com","jay","1234hh","");
		user1.setAdresse(adresse1);
		userControl.addUser(user1);
		System.out.println(user1);

		User user2 = new User("Paul", "Gilbert", "hey@hello.com","hello","HGF11","");
		user2.setAdresse(adresse1);
		userControl.addUser(user2);
		System.out.println(user2);

		/*tx = session.beginTransaction();
		session.save(user1);
		session.save(user2);
		tx.commit();
		
		
		
	
		System.exit(0);*/

    }

}