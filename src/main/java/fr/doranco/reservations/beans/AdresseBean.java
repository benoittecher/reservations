package fr.doranco.reservations.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AdresseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String idAdresse;
	@ManagedProperty(value="")
	private String numero;
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
	@ManagedProperty(value="")
	private String rue;
	@ManagedProperty(value="")
	private String ville;
	@ManagedProperty(value="")
	private String codePostal;


}
