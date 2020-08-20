import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

import fr.doranco.reservations.cryptage.CryptageDES;
import fr.doranco.reservations.cryptage.GenerateKey;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.entity.UserDojo;
import fr.doranco.reservations.model.dao.UserDao;

public class TestAddUserDao {

	public static void main(String[] args) throws NoSuchAlgorithmException, GeneralSecurityException, UnsupportedEncodingException {
		UserDao userDao = new UserDao();
		UserDojo userDojo = new UserDojo();
		Adresse adresse = new Adresse(1, "rue de la Paix", "Paris", "75001");
		userDojo.setAdresse(adresse);
		System.out.println("Test");
		userDojo.setNom("Nom");
		userDojo.setPrenom("Prenom");
		userDojo.setLogin("Login3");
		userDojo.setEmail("Email");
		userDojo.setTelephone("Telephone");
		userDojo.setRoles("user");
		SecretKey key = GenerateKey.getKey("DES", 56);
		userDojo.setPassword(CryptageDES.encrypt("mdp", key));
		byte[] keyInBytes = key.getEncoded();
		userDojo.setCleCryptage(keyInBytes);
		System.out.println(userDojo.toString());
		userDojo = userDao.addUser(userDojo);
		
		System.out.println(userDojo.toString());
	}

}
