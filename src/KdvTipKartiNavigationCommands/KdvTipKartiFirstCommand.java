package KdvTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.KdvTipKartEntity;
import Frames.KdvTipKartiFrame;

public class KdvTipKartiFirstCommand implements CommandIF{

	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiFirstCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartEntity kdvTipKartEntity = new KdvTipKartEntity();		
		kdvTipKartEntity.ilkVeri();
		
		kdvTipKartiFrame.model = kdvTipKartEntity;
		
		kdvTipKartiFrame.modelDoldur(kdvTipKartEntity);
		
	}
}
