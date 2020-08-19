package fr.doranco.reservations.model.dao;

import fr.doranco.reservations.entity.UserDojo;

public interface IUserDao {

	UserDojo getUserById(Integer id);
	UserDojo addUser(UserDojo userDojo);
	void updateUser(UserDojo userDojo);
	void removeUser(UserDojo userDojo);
	void seConnecter(String login, String password);
	void seDeconnecter();
}
