package fr.doranco.reservations.control;

import fr.doranco.reservations.entity.User;

public interface IUserControl {
	User getUserById(Integer id);
	User addUser(User user);
	void updateUser(User user);
	void removePersonne(User user);
	void seConnecter(String login, String password);
	void seDeconnecter();
}
