package fr.doranco.reservations.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.utils.exceptions.UnavailableLoginException;

public interface IAdresseControl {
	Adresse getAdresseById(Integer id) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException;
	Adresse addAdresse(Adresse adresse) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, GeneralSecurityException, UnavailableLoginException;
	void updateAdresse(Adresse adresse) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException;
	void removeAdresse(Adresse adresse) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException;
}
