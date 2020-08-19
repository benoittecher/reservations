package fr.doranco.reservations.control;

import fr.doranco.reservations.entity.User;
import fr.doranco.reservations.model.dao.UserDao;

public class UserControl implements IUserControl{

	UserDao userDao = new UserDao();
	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

	@Override
	public void removePersonne(User user) {
		userDao.removePersonne(user);
		
	}

	@Override
	public void seConnecter(String login, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seDeconnecter() {
		// TODO Auto-generated method stub
		
	}

}
