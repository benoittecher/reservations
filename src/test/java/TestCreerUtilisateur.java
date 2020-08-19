import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.entity.User;

public class TestCreerUtilisateur {

	public static void main(String[] args) {
		UserControl userControl = new UserControl();
		Adresse adresse1 = new Adresse(10, "Rue de la Paix", "Paris", "75001");
		User user1 = new User("Albert", "Camus","ge@key.com","jay","1234hh","", "client");
		user1.setAdresse(adresse1);
		try {
			userControl.addUser(user1);
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
		}
		if (user1.getId() != null) {
			System.out.println("Utilisateur bien ajouté en bdd : ");
			System.out.println(user1); 
			
		}
	}
}
