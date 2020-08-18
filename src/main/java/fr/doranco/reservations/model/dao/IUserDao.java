package fr.doranco.reservations.model.dao;

import fr.doranco.reservations.entity.User;

public interface IUserDao {

	User getUserById(Integer id);
	User addUser(User user);
	void updateUser(User user);
	void removePersonne(User user);
	void seConnecter(String login, String password);
	void seDeconnecter();
}
