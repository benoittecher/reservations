import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.utils.exceptions.UnavailableLoginException;

public class TestCreerUtilisateur {

	public static void main(String[] args) {
		UserControl userControl = new UserControl();
		Adresse adresse1 = new Adresse(10, "Rue de la Paix", "Paris", "75001");
		User user1 = new User("Albert", "Camus","ge@key.com","Login","1234hh","", "client");
		System.out.println("Test");
		user1.setAdresse(adresse1);
		try {
			user1 = userControl.addUser(user1);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnavailableLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ce login n'est pas disponible");
		}
		if (user1.getId() != null) {
			System.out.println("Utilisateur bien ajouté en bdd : ");
			System.out.println(user1); 
			
		} else {
			System.out.println("Erreur : l'ajout n'a pas fonctionné");
		}
	}
}
