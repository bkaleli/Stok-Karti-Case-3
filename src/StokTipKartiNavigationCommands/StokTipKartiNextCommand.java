package StokTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokTipKartEntity;
import Frames.StokTipKartiFrame;

public class StokTipKartiNextCommand implements CommandIF{
	
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiNextCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	}

	public void execute() {
		StokTipKartEntity stokTipKartEntity = new StokTipKartEntity();
		
		stokTipKartEntity.setStKodu(stokTipKartiFrame.tfSTKodu.getText());
		
		stokTipKartEntity.ileri();
		
		stokTipKartiFrame.model = stokTipKartEntity;
		
		stokTipKartiFrame.modelDoldur(stokTipKartEntity);
		
	}
}
