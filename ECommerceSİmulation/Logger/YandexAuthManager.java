package Logger;

import entities.concretes.User;

public class YandexAuthManager {
	

	public void register(User user) {
		
		System.out.println(user.getFirstName() + " Yandex ile kay�t yap�ld�.");
		
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " Yandex ile giri� yap�ld�.");

	}
	

}
