package fr.doranco.reservations.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adresse", catalog = "reservation")
public class Adresse implements Serializable {


	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 11)
	private Integer id;

//	@Size(min = 0, max = 45)
	@Column(name = "numero", length = 45, nullable = false)
	private Integer numero;
	
//	@Size(min = 0, max = 45)
	@Column(name = "rue", length = 45, nullable = false)
	private String rue;
	
//	@Size(max = 45)
	@Column(name = "ville", length = 45, nullable = false)
	private String ville;
	
//	@Size(min = 5, max = 6)
	@Column(name = "code_postal", length = 45, nullable = false)
	private String codePostal;
	
	@OneToMany(mappedBy="adresse")
	private List<UserDojo> userDojo;
	
	
	
	public Adresse() {
	}



	public Adresse(Integer numero, String rue, String ville, String codePostal) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
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
