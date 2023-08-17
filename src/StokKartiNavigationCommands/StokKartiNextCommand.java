package StokKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokKartEntity;
import Frames.StokKartiFrame;

public class StokKartiNextCommand implements CommandIF{

	private StokKartiFrame stokKartiFrame;

	public StokKartiNextCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}

	public void execute() {
		StokKartEntity stokKartEntity = new StokKartEntity();
		
		stokKartEntity.setStokKodu(stokKartiFrame.tfStokKodu.getText());
		
		stokKartEntity.ileri();
		
		stokKartiFrame.model = stokKartEntity;
		
		stokKartiFrame.modelDoldur(stokKartEntity);

	}
}
