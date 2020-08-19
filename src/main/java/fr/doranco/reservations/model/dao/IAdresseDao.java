package fr.doranco.reservations.model.dao;

import fr.doranco.reservations.entity.Adresse;

public interface IAdresseDao {
	public Adresse addAdresse (Adresse adresse);
	public Adresse updateAdresse (Adresse adresse);
	public Adresse getAdresseById(Integer id);
	public void removeAdresse(Adresse adresse);
}
