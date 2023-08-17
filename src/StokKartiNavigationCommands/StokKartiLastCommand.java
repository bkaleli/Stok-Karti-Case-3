package StokKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokKartEntity;
import Frames.StokKartiFrame;

public class StokKartiLastCommand implements CommandIF{
	private StokKartiFrame stokKartiFrame;

	public StokKartiLastCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}

	public void execute() {
		StokKartEntity stokKartEntity = new StokKartEntity();
			
		stokKartEntity.sonVeri();
		
		stokKartiFrame.model = stokKartEntity;
		
		stokKartiFrame.modelDoldur(stokKartEntity);
	}
}
