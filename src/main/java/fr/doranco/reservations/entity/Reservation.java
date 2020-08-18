package fr.doranco.reservations.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;






@Entity
@Table(name = "reservation", catalog = "reservation")
public class Reservation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 11)
	private Integer id;
	@NotEmpty
	@Column(name = "reference", length = 45, nullable = false)
	private String ref;
	@NotEmpty
	@Column(name = "date_debut", nullable = false)
	private Date dateDebut;
	@NotEmpty
	@Column(name = "date_fin", nullable = false)
	private Date deteFin;
	@NotEmpty
	@Column(name = "prix", nullable = false)
	private Float prix;
	
	
	public Reservation() {
	}


	public Reservation(String ref, Date dateDebut, Date deteFin, Float prix) {
		this.ref = ref;
		this.dateDebut = dateDebut;
		this.deteFin = deteFin;
		this.prix = prix;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDeteFin() {
		return deteFin;
	}


	public void setDeteFin(Date deteFin) {
		this.deteFin = deteFin;
	}


	public Float getPrix() {
		return prix;
	}


	public void setPrix(Float prix) {
		this.prix = prix;
	}
	
	
	
}
