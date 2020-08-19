package fr.doranco.reservations.model.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.doranco.reservations.entity.UserDojo;
import fr.doranco.reservations.model.session.HibernateConnector;


public class UserDao implements IUserDao {

	private Session session = HibernateConnector.getInstance().getSession();

	@Override
	public UserDojo getUserById(Integer id) {
		
		return (UserDojo) session.get(UserDojo.class,id);
	}
	
	public UserDojo getUserByLogin(String login) {
		 
		return (UserDojo) session.createQuery("from UserDojo u WHERE u.login=:login").setParameter("login",login).uniqueResult();
	}

	@Override
	public UserDojo addUser(UserDojo user) {
		
//		user.setId(1);
//		return user;
		
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
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return null;
	}

	@Override
	public void updateUser(UserDojo userDojo) {
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
	public void removeUser(UserDojo userDojo) {
		// TODO Auto-generated method stub
		
	}

}
