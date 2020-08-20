package fr.doranco.reservations.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.model.session.HibernateConnector;

public class AdresseDao implements IAdresseDao{

	private Session session = HibernateConnector.getInstance().getSession();
	@Override
	public Adresse addAdresse(Adresse adresse) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(adresse);
			tx.commit();
			return adresse;
		} catch (Exception e) {
			System.out.println("Erreur l'adresse n'a pas pu être enregistrée");
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
	public Adresse updateAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse getAdresseById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		
	}

}
