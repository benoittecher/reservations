package fr.doranco.reservations.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.reservations.entity.User;

public interface IUserControl {
	User getUserById(Integer id) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException;
	User addUser(User user) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException;
	void updateUser(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException;
	void removeUser(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException;
	void seConnecter(String login, String password);
	void seDeconnecter();
}
