package fr.doranco.reservations.model.dao;

import java.util.List;

import fr.doranco.reservations.entity.UserDojo;



public interface IUserDao {

	UserDojo getUserById(Integer id);
	UserDojo getUserByLogin(String login);
	UserDojo addUser(UserDojo userDojo);
	List<UserDojo> getUsers();
	void updateUser(UserDojo userDojo);
	void removeUser(UserDojo userDojo);
	void seConnecter(String login, String password);
	void seDeconnecter();
}
