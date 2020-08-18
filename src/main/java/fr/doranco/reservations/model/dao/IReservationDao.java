package fr.doranco.reservations.model.dao;

import fr.doranco.reservations.entity.Reservation;

public interface IReservationDao {
	public Reservation addReservation (Reservation reservation);
	public Reservation updateReservation (Reservation reservation);
	public Reservation getReservationById(Integer id);
	public void removeReservation(Reservation reservation);
}
