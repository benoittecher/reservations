import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.crypto.SecretKey;

import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.cryptage.CryptageDES;
import fr.doranco.reservations.cryptage.GenerateKey;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.entity.UserDojo;
import fr.doranco.reservations.model.dao.UserDao;

public class TestGetUsersControl {

	public static void main(String[] args) throws NoSuchAlgorithmException, GeneralSecurityException, UnsupportedEncodingException {
		UserControl userControl = new UserControl();
		List<User> users = userControl.getUsers();
		
		System.out.println(users);
	}

}
