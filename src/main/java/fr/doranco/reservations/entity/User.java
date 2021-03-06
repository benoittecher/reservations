package fr.doranco.reservations.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user", catalog = "reservation")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	
	private String nom;
	
	
	private String prenom;
	
	
	private String email;
	
	
	private String login;
	
	
	private String password;
	
	
	private String telephone;
	
	private String roles;
	
	
	
	private Adresse adresse;
	
	
	public User() {
	}


	public User(String nom, String prenom, String email, String login, String password, String telephone, String roles) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
		this.roles = roles;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
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
