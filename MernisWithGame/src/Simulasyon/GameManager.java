package Simulasyon;

public class GameManager implements GameService{

	@Override
	public void sellGame(Game game,Player player) {
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullan�c� " + game.getGameName() + " isimli oyunu sat�n ald� .");
		
	}

	@Override
	public void sellWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + "isimli oyun " + campaign.getCampaignName() + "dahilindedir.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + "isimli oyun sistemden silindi.");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + "isimli oyun sistemde g�ncellendi.");
		
	}

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + "isimli oyun sisteme eklendi.");
		
	}



}
