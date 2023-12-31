package StokKartiNavigationCommands;

import Commands.CommandIF;
import Entities.StokKartEntity;
import Frames.StokKartiFrame;

public class StokKartiPreviousCommand implements CommandIF{
	
	private StokKartiFrame stokKartiFrame;

	public StokKartiPreviousCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}

	public void execute() {
		StokKartEntity stokKartEntity = new StokKartEntity();
		
		stokKartEntity.setStokKodu(stokKartiFrame.tfStokKodu.getText());
		
		stokKartEntity.geri();

		stokKartiFrame.model = stokKartEntity;
		
		stokKartiFrame.modelDoldur(stokKartEntity);

		//geri metodu içerisinde tek kayıt döndüren sorgu yazılmalı , sorgudan satır dönüyorsa model doldurulmalı , doldurulan model ile frame burada set edilmeli 
	}
}
