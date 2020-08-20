package fr.doranco.reservations.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.doranco.reservations.entity.Adresse;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;

	
	public String idUser;
	
	@ManagedProperty(value="")
	private String nom;
	
	@ManagedProperty(value="")
	private String prenom;
	
	@ManagedProperty(value="")
	private String email;
	
	@ManagedProperty(value="")
	private String login;
	
	@ManagedProperty(value="")
	private String password;
	
	@ManagedProperty(value="")
	private String telephone;
	
	@ManagedProperty(value="")
	private Adresse adresse;

	
	
	public UserBean() {
	}



	public String getIdUser() {
		return idUser;
	}



	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public Adresse getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
	
	
}
