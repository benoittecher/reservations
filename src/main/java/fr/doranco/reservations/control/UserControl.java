package fr.doranco.reservations.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import fr.doranco.reservations.cryptage.CryptageDES;
import fr.doranco.reservations.cryptage.GenerateKey;
import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.entity.UserDojo;
import fr.doranco.reservations.model.dao.UserDao;


public class UserControl implements IUserControl{

	UserDao userDao = new UserDao();
	@Override
	public User getUserById(Integer id) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException {
		return convertToPojo(userDao.getUserById(id));
	}

	@Override
	public User addUser(User user) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException {
		UserDojo userDojo = convertToDojo(user);
		return convertToPojo(userDao.addUser(userDojo));
		
	}

	@Override
	public void updateUser(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		UserDojo userDojo = convertToDojo(user);
		userDao.updateUser(userDojo);
		
	}

	@Override
	public void removeUser(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		UserDojo userDojo = convertToDojo(user);
		userDao.removeUser(userDojo);
		
	}

	@Override
	public boolean seConnecter(String login, String password) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException {

		UserDojo userDojo = userDao.getUserByLogin(login);
		if (userDojo != null) {
			byte[] encodedPassword = userDojo.getPassword();
			SecretKey key = new SecretKeySpec(encodedPassword, 0, encodedPassword.length, "DES");
			String decodedPassword = CryptageDES.decrypt(userDojo.getPassword(), key);
			if (decodedPassword == password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void seDeconnecter() {
		// TODO Auto-generated method stub
		
	}
	private UserDojo convertToDojo(User user) throws NoSuchAlgorithmException, GeneralSecurityException, UnsupportedEncodingException {
		UserDojo userDojo = new UserDojo(user.getId(),user.getNom(), user.getPrenom(), user.getEmail(), user.getLogin(),user.getTelephone(),user.getRoles(), user.getAdresse());
		SecretKey key = GenerateKey.getKey("DES", 56);
		byte[] passwordCrypte = CryptageDES.encrypt(user.getPassword(), key);
		userDojo.setCleCryptage(key.getEncoded());
		userDojo.setPassword(passwordCrypte);
		return userDojo;
	}
	private User convertToPojo(UserDojo userDojo) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException {
		User user = new User();
		user.setId(userDojo.getId());
		user.setNom(userDojo.getNom());
		user.setPrenom(userDojo.getPrenom());
		user.setEmail(userDojo.getEmail());
		user.setLogin(userDojo.getLogin());
		user.setTelephone(userDojo.getTelephone());
		user.setRoles(userDojo.getRoles());
		user.setAdresse(userDojo.getAdresse());
		byte[] encodedPassword = userDojo.getPassword();
		SecretKey key = new SecretKeySpec(encodedPassword, 0, encodedPassword.length, "DES");
		String password = CryptageDES.decrypt(userDojo.getPassword(), key);
		user.setPassword(password);
		return user;
		
	}
}
