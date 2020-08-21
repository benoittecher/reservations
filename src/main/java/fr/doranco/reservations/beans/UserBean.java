package fr.doranco.reservations.beans;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.crypto.NoSuchPaddingException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.doranco.reservations.control.IUserControl;
import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.Adresse;
import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.utils.exceptions.UnavailableLoginException;

@ManagedBean(name = "userbean")
@SessionScoped
public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;

	public String id;
	
	@ManagedProperty(value="denzel")
	private String nom;
	
	@ManagedProperty(value="Washington")
	private String prenom;
	
	@ManagedProperty(value="a@b.fr")
	private String email;
	
	@ManagedProperty(value="Denzton")
	private String login;
	
	@ManagedProperty(value="newyork")
	private String password;
	
	@ManagedProperty(value="0798097654")
	private String telephone;
	
	@ManagedProperty(value="1")
	private String adresseNumero;
	
	@ManagedProperty(value="Rue de la Paix")
	private String adresseRue;
	

	@ManagedProperty(value="Paris")
	private String adresseVille;
	
	@ManagedProperty(value="75001")
	private String adresseCodePostal;

	@ManagedProperty(name = "messageSuccess", value = "")
	private String messageSuccess = "";

	@ManagedProperty(name = "messageError", value = "")
	private String messageError = "";

	private static final IUserControl userControl = new UserControl();
	
//	private final List<User> listUsers = getUsers();
	private static final List<User> listUsers = new ArrayList<User>(Arrays.asList(
				new User("test1", "test2", "test3", "test4", "test5", "test6", "test7"))
			);

	public UserBean() {
	}
	
	private List<User> getUsers() {
		
		try {
			return userControl.getUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			setMessageError("erreur lors de la récupération de la liste des users !!");
			return null;
		}
	}

	public void addUser() {
		//initializeMessages();
		User user = new User();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setLogin(login);
		user.setPassword(password);
		user.setTelephone(telephone);
		user.setRoles("user");
		
		Adresse addedAdresse = new Adresse();
		addedAdresse.setNumero(Integer.parseInt(adresseNumero));
		addedAdresse.setRue(adresseRue);
		addedAdresse.setVille(adresseVille);
		addedAdresse.setCodePostal(adresseCodePostal);
		user.setAdresse(addedAdresse);
		try {
			User addedUser = userControl.addUser(user);
			if (addedUser != null && addedUser.getId() != null) {
				messageSuccess = "Utilisateur ajouté avec succès.";
				return;
			}
			messageError = "Erreur lors de l'ajout de l'utilisateur !!";
			return;
				
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
			
		 
		
	}
	public void seConnecter() {
		try {
			if (userControl.seConnecter(login, password)) {
			messageSuccess = "Vous êtes bien connecté";
			messageError = "";
			} else {
				messageError = "Echec lors de la connexion";
				messageSuccess = "";
			}
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
		}
	}

	public String initialize() {
		initializeMessages();
		//initializeFields();
		return "";
	}

	private void initializeMessages() {
		messageSuccess = "";
		messageError = "";
	}

	
	public String getNom() {
		return nom;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public static List<User> getListUsers() {
//		return listUsers;
//	}
//
//	public static void setListUsers(List<User> listUsers) {
//		UserBean.listUsers = listUsers;
//	}

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
	
	
	public String getMessageSuccess() {
		return messageSuccess;
	}



	public void setMessageSuccess(String messageSuccess) {
		this.messageSuccess = messageSuccess;
	}



	public String getMessageError() {
		return messageError;
	}



	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	public String getAdresseNumero() {
		return adresseNumero;
	}

	public void setAdresseNumero(String adresseNumero) {
		this.adresseNumero = adresseNumero;
	}

	public String getAdresseRue() {
		return adresseRue;
	}

	public void setAdresseRue(String adresseRue) {
		this.adresseRue = adresseRue;
	}

	public String getAdresseVille() {
		return adresseVille;
	}

	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}

	public String getAdresseCodePostal() {
		return adresseCodePostal;
	}

	public void setAdresseCodePostal(String adresseCodePostal) {
		this.adresseCodePostal = adresseCodePostal;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	
	
}
