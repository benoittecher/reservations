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
public class UserDojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 11)
	private Integer id;
	
	@NotEmpty
	@Size(min = 2, max = 45, message = "la longeur du nom doit être comprise entre 2 et 25 caractère !")
	@Column(name = "nom", length = 45, nullable = false)
	private String nom;
	
	@NotEmpty
	@Size(min = 2, max = 45, message = "la longeur du prenom doit être comprise entre 2 et 35 caractère !")
	@Column(name = "prenom", length = 45, nullable = false)
	private String prenom;
	
	@NotEmpty
	@Column(name = "email", length = 45, nullable = false)
	private String email;
	
	@NotEmpty
	@Size(min = 2, max = 25, message = "la longeur du login doit être comprise entre 2 et 25 caractère !")
	@Column(name = "login", length = 45, nullable = false)
	private String login;
	
	@NotEmpty
	@Column(name = "password", nullable = false)
	private byte[] password;
	
	@NotEmpty
	@Size(min = 2, max = 13, message = "la taille du telephone doit être comprise entre 2 et 25 caractère !")
	@Column(name = "telephone", length = 13, nullable = false)
	private String telephone;
	
	@NotEmpty
	@Size( max = 45)
	@Column(name = "roles", length = 45, nullable = false)
	private String roles;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "adresse_id")
	private Adresse adresse;
	
	@NotEmpty
	@Column(name = "cle_cryptage", nullable = false)
	private byte[] cleCryptage;

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

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public byte[] getCleCryptage() {
		return cleCryptage;
	}

	public void setCleCryptage(byte[] cleCryptage) {
		this.cleCryptage = cleCryptage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserDojo(Integer id,
			@NotEmpty @Size(min = 2, max = 45, message = "la longeur du nom doit être comprise entre 2 et 25 caractère !") String nom,
			@NotEmpty @Size(min = 2, max = 45, message = "la longeur du prenom doit être comprise entre 2 et 35 caractère !") String prenom,
			@NotEmpty String email,
			@NotEmpty @Size(min = 2, max = 25, message = "la longeur du login doit être comprise entre 2 et 25 caractère !") String login,
			@NotEmpty @Size(min = 2, max = 13, message = "la taille du telephone doit être comprise entre 2 et 25 caractère !") String telephone,
			@NotEmpty @Size(max = 45) String roles, Adresse adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.telephone = telephone;
		this.roles = roles;
		this.adresse = adresse;
	}


	
}
