package KdvTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.KdvTipKartEntity;
import Frames.KdvTipKartiFrame;

public class KdvTipKartiPreviousCommand implements CommandIF{
	
	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiPreviousCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartEntity kdvTipKartEntity = new KdvTipKartEntity();		
		
		kdvTipKartEntity.setKtKodu(kdvTipKartiFrame.tfKTKodu.getText());
		
		kdvTipKartEntity.geri();
		
		kdvTipKartiFrame.model = kdvTipKartEntity;
		
		kdvTipKartiFrame.modelDoldur(kdvTipKartEntity);

	}
}
