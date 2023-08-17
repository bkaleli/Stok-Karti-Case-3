package KdvTipKartiNavigationCommands;

import Commands.CommandIF;
import Entities.KdvTipKartEntity;
import Frames.KdvTipKartiFrame;

public class KdvTipKartiLastCommand implements CommandIF{

	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiLastCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartEntity kdvTipKartEntity = new KdvTipKartEntity();		
				
		kdvTipKartEntity.sonVeri();
		
		kdvTipKartiFrame.model = kdvTipKartEntity;
		
		kdvTipKartiFrame.modelDoldur(kdvTipKartEntity);

	}
}
