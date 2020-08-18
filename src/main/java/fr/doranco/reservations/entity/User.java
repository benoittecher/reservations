package fr.doranco.reservations.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 11)
	private Integer id;
	
	@NotEmpty
	@Size(min = 2, max = 25, message = "la longeur du nom doit être comprise entre 2 et 25 caractère !")
	@Column(name = "nom", length = 25, nullable = false)
	private String nom;
	
	@NotEmpty
	@Size(min = 2, max = 25, message = "la longeur du prenom doit être comprise entre 2 et 35 caractère !")
	@Column(name = "prenom", length = 35, nullable = false)
	private String prenom;
	
	@NotEmpty
	@Column(name = "email", length = 25, nullable = false)
	private String email;
	
	@NotEmpty
	@Size(min = 2, max = 25, message = "la longeur du login doit être comprise entre 2 et 25 caractère !")
	@Column(name = "login", length = 25, nullable = false)
	private String login;
	
	@NotEmpty
	@Size(min = 2, max = 10, message = "le mot de passe doit être compris entre 2 et 10 caractère !")
	@Column(name = "password", length = 25, nullable = false)
	private String password;
	
	@NotEmpty
	@Size(min = 2, max = 25, message = "la taille du telephone doit être comprise entre 2 et 25 caractère !")
	@Column(name = "telephone", length = 25, nullable = false)
	private String telephone;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Adresse adresse;
	
	
	public User() {
	}


	public User(String nom, String prenom, String email, String login, String password, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
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


	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", login=" + login
				+ ", password=" + password + ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
	
	
	
	
}
