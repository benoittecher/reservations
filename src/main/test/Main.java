import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {

	public static void main(String[] args) {
//		Personne personne1 = new Personne("Albert", "Camus", Dates.convertStringToDateUtil("15/07/2020"));
//		Personne personne2 = new Personne("Paul", "Gilbert", Dates.convertStringToDateUtil("23/02/2020"));
//		
//		Transaction tx = null;
//		
//		try { 
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			tx = session.beginTransaction();
//			session.save(personne1);
//			session.save(personne2);
//			tx.commit();
//			
//		} catch (Exception e) {
//			if(tx != null) {
//				tx.rollback();
//			}
//			e.printStackTrace();
//		}
//		
//		try {
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			List<Personne> listePersonnes = session.createQuery("from Personne", Personne.class).list();
//			for (Personne personne : listePersonnes) {
//				System.out.println(personne);
//			}	
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	
//		System.exit(0);
//
    }

}
