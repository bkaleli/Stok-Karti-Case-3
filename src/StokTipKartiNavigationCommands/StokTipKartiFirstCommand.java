package StokTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokTipKartEntity;
import Frames.StokTipKartiFrame;

public class StokTipKartiFirstCommand implements CommandIF{
	
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiFirstCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	}

	public void execute() {
		StokTipKartEntity stokTipKartEntity = new StokTipKartEntity();
		stokTipKartEntity.ilkVeri();
		
		stokTipKartiFrame.model = stokTipKartEntity;
		
		stokTipKartiFrame.modelDoldur(stokTipKartEntity);
		
	}

}
