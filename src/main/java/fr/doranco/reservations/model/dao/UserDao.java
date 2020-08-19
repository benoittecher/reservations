package fr.doranco.reservations.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.model.session.HibernateConnector;

public class UserDao implements IUserDao {

	private Session session = HibernateConnector.getInstance().getSession();
	@Override
	public User getUserById(Integer id) {
		User user = session.get(User.class, id);
		
		return null;
	}

	@Override
	public User addUser(User user) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			return user;
		} catch (Exception e) {
			System.out.println("Erreur l'utilisateur n'a pas pu être enregistré");
			System.out.println(e);
			tx.rollback();
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}


	@Override
	public void seConnecter(String login, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void seDeconnecter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
