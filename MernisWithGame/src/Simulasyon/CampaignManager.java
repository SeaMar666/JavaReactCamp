package Simulasyon;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " ile b�t�n oyunlar  %" + campaign.getDiscount() + " indirimde !");
		
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli oyunun kampanya s�resi bitmi�tir");
		
	}


}
