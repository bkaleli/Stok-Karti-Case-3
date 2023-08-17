package KdvTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.KdvTipKartEntity;
import Frames.KdvTipKartiFrame;

public class KdvTipKartiNextCommand implements CommandIF{
	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiNextCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartEntity kdvTipKartEntity = new KdvTipKartEntity();		
		
		kdvTipKartEntity.setKtKodu(kdvTipKartiFrame.tfKTKodu.getText());
		
		kdvTipKartEntity.ileri();
		
		kdvTipKartiFrame.model = kdvTipKartEntity;
		
		kdvTipKartiFrame.modelDoldur(kdvTipKartEntity);

	}
}
