package DeleteCommands;

import Commands.CommandIF;
import Frames.KdvTipKartiFrame;

public class KdvTipKartiDeleteCommand implements CommandIF {

	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiDeleteCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}
	
	public void execute() {
		kdvTipKartiFrame.model.delete();
	}
}
