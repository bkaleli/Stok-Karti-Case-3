package StokTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokTipKartEntity;
import Frames.StokTipKartiFrame;

public class StokTipKartiLastCommand implements CommandIF {

	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiLastCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	}

	public void execute() {
		StokTipKartEntity stokTipKartEntity = new StokTipKartEntity();
		stokTipKartEntity.sonVeri();
		
		stokTipKartiFrame.model = stokTipKartEntity;

		stokTipKartiFrame.modelDoldur(stokTipKartEntity);
		
	}
}
