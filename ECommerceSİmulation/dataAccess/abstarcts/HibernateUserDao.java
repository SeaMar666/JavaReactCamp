package dataAccess.abstarcts;

import java.util.ArrayList;
import java.util.List;

import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
    private List<User> users;

	public HibernateUserDao() {
		this.users = new ArrayList<>();
	}

	@Override
	public void register(User user) {
		this.users.add(user);
		System.out.println("Kay�t olma ba�ar�l� : " + user.getMail() + "adresine gelen do�rulama linkine t�klay�n�z.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		int userToDelete = this.users.indexOf(user);
		 this.users.remove(userToDelete);
		System.out.println("Kullan�c� silindi : " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void confirmUser(User user) {
		 System.out.println(user.getMail() + " : Mail adresi do�ruland�.");
	     user.setItValid(true);
		
	}

	@Override
	public void login(User user) {
		 System.out.println(user.getFirstName() + " : Kullan�c� giri�i ba�ar�l�.");
		
	}

}
