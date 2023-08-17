package StokKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokKartEntity;
import Frames.StokKartiFrame;


public class StokKartiFirstCommand implements CommandIF{
	private StokKartiFrame stokKartiFrame;

	public StokKartiFirstCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}

	public void execute() {
		
		StokKartEntity stokKartEntity = new StokKartEntity();
		
		stokKartEntity.ilkVeri();
		
		stokKartiFrame.model = stokKartEntity;
		
		stokKartiFrame.modelDoldur(stokKartEntity);
	}
	
}
