package business.concretes;

import Core.AuthService;
import Core.EmailValidator;
import business.abstracts.UserService;
import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao, AuthService authService) {
        this.userDao = userDao;
        this.authService = authService;
    }


	@Override
	public void register(User user) {
		for (User  users : userDao.getAll()) {
			if(user.getMail().equals(user.getMail())) {
				System.out.println("Sistemde kay�tl� bir mail girdiniz , l�tfen farkl� mail kullan�n.");
				return;
			}
			
		}
		if(!EmailValidator.isValid(user.getMail())) {
			System.out.println("Mail uygun formatta de�ildir.");
		}else if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad iki harften fazla olmal�d�r.");
	
		}else if(user.getPassword().length() < 6) {
			System.out.println("Parola 6 karakterden fazla olmal�d�r.");
		}else {
			userDao.register(user);
		}
		
	}

	@Override
	public void login(User user) {
		if(user.isItValid()) {
			userDao.login(user);
		}else {
			System.out.println("Giri� ba�ar�s�z .");
		}
		
	}
	
	@Override
	public void confirmUser(User user) {
		userDao.confirmUser(user);
		
	}

	@Override
	public void registerWithYandex(User user) {
		user.setItValid(true);
		this.authService.register(user);
		
	}

	@Override
	public void loginWithYandex(User user) {
		if(user.isItValid()) {
			this.authService.login(user);
		}else {
			System.out.println("Kay�t olmadan giri� yapamazs�n�z !");
		}
		
		
	}
	




}
