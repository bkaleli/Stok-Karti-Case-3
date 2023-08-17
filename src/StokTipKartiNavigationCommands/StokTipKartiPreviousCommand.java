package StokTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokTipKartEntity;
import Frames.StokTipKartiFrame;

public class StokTipKartiPreviousCommand implements CommandIF{
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiPreviousCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	}

	public void execute() {
		StokTipKartEntity stokTipKartEntity = new StokTipKartEntity();
		
		stokTipKartEntity.setStKodu(stokTipKartiFrame.tfSTKodu.getText());

		stokTipKartEntity.geri();
		
		stokTipKartiFrame.model = stokTipKartEntity;

		stokTipKartiFrame.modelDoldur(stokTipKartEntity);
		
	}
}
