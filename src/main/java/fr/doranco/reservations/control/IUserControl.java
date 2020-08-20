package fr.doranco.reservations.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.utils.exceptions.UnavailableLoginException;

public interface IUserControl {
	User getUserById(Integer id) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException;
	User addUser(User user) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException, UnavailableLoginException;
	void updateUser(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException;
	void removeUser(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException;
	boolean seConnecter(String login, String password) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException;
	void seDeconnecter();
	List<User> getUsers();
}
