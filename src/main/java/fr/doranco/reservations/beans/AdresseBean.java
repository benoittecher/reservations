package fr.doranco.reservations.beans;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.doranco.reservations.control.AdresseControl;
import fr.doranco.reservations.control.IAdresseControl;
import fr.doranco.reservations.control.IUserControl;
import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.utils.exceptions.UnavailableLoginException;

@ManagedBean
@SessionScoped
public class AdresseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String idAdresse;
	@ManagedProperty(value="1")
	private String numero;
	@ManagedProperty(value="Rue de la Paix")
	private String rue;
	@ManagedProperty(value="Paris")
	private String ville;
	@ManagedProperty(value="75001")
	private String codePostal;
	
	private static final IAdresseControl adresseControl = new AdresseControl();
	public String addAdresse() {
		Adresse adresse = new Adresse();
		adresse.setNumero(Integer.parseInt(numero));
		adresse.setRue(rue);
		adresse.setVille(ville);
		adresse.setCodePostal(codePostal);
		try {
			adresseControl.addAdresse(adresse);
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
		}
		return "Adresse ajoutée";
	}
	public String getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(String idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	
	


}
