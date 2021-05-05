package Simulasyon;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService checkPlayerService;
	
	
	public PlayerManager(PlayerCheckService checkPlayerService){
		this.checkPlayerService = checkPlayerService;
	}

	
	public void registerPlayer(Player player) 
	{
		
			if (checkPlayerService.checkIfRealPerson(player)) {
				System.out.println(player.getFirstName() + " " + player.getLastName() + 
						" isimli kullan�c�n�n kay�t olma i�lemi ba�ar�yla ger�ekle�ti. ");
			}else {
				System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullan�c�n�n kay�t olma i�leminiz ger�ekle�medi.");
			}
			
	}
		
	
	public void uptadePlayerInfo(Player player)
    {
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullan�c�n�n bilgileri g�ncellenmi�tir.");
	}
	
	public void deletePlayer(Player player) 
	{
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullan�c�n�n hesab� silinmi�tir.");
	}

}
