import org.hibernate.Session;

import fr.doranco.reservations.model.session.HibernateConnector;

public class TestConnexionBdd {
	public static void main(String[] args) {
		final Session session = HibernateConnector.getInstance().getSession();
		System.out.println("ma session : " + session);
	}
}
