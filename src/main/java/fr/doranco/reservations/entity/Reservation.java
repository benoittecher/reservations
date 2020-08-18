package fr.doranco.reservations.entity;

import java.util.Date;

public class Reservation {

	private Integer id;
	private String ref;
	private Date dateDebut;
	private Date deteFin;
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
