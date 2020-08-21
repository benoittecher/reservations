package fr.doranco.reservations.beans;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
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
	
	@ManagedProperty(value="wash@hello.com")
	private String email;
	
	@ManagedProperty(value="Denzton")
	private String login;
	
	@ManagedProperty(value="newyork")
	private String password;
	
	@ManagedProperty(value="0798097654")
	private String telephone;
	
	@ManagedProperty(value="")
	private Adresse adresse;

	@ManagedProperty(name = "messageSuccess", value = "")
	private String messageSuccess = "";

	@ManagedProperty(name = "messageError", value = "")
	private String messageError = "";

	private static final IUserControl userControl = new UserControl();
	
	private static List<User> listUsers = getUsers();
	
	public List<User> getListUsers() {
		initialize();
		return listUsers;
	}

	public UserBean() {
	}
	
	private static List<User> getUsers() {
		
		List<User> listeUsers = userControl.getUsers();
		return listeUsers;
	}

	public String addUser() {
		//initializeMessages();
		User user = new User();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setLogin(login);
		user.setPassword(password);
		user.setTelephone(telephone);
		user.setRoles("user");
		User addedUser = null;
		Adresse addedAdresse = new Adresse();
		addedAdresse.setNumero(adresse.getNumero());
		addedAdresse.setRue(adresse.getRue());
		addedAdresse.setVille(adresse.getVille());
		addedAdresse.setCodePostal(adresse.getCodePostal());
		user.setAdresse(addedAdresse);
		try {
			addedUser = userControl.addUser(user);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return messageError;
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return messageError;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return messageError;
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnavailableLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return messageError;
		}
			messageSuccess = "Utilisateur ajouté avec succès.";
		 
		return messageSuccess;
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



	public Adresse getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
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






	
	
	
	
	
	
}
