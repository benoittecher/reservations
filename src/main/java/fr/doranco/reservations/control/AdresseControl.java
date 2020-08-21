package fr.doranco.reservations.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.model.dao.AdresseDao;
import fr.doranco.reservations.utils.exceptions.UnavailableLoginException;

public class AdresseControl implements IAdresseControl{

	AdresseDao adresseDao = new AdresseDao();
	@Override
	public Adresse getAdresseById(Integer id) throws NoSuchAlgorithmException, NoSuchPaddingException,
			UnsupportedEncodingException, GeneralSecurityException {
		return adresseDao.getAdresseById(id);
		
	}

	@Override
	public Adresse addAdresse(Adresse adresse) throws NoSuchAlgorithmException, NoSuchPaddingException,
			UnsupportedEncodingException, GeneralSecurityException, UnavailableLoginException {
		return adresseDao.addAdresse(adresse);
		
	}

	@Override
	public void updateAdresse(Adresse adresse)
			throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdresse(Adresse adresse)
			throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		// TODO Auto-generated method stub
		
	}

}
