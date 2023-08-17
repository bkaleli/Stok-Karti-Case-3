package FrameCommands;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import Commands.ComboBoxCommand;
import DeleteCommands.StokKartiDeleteCommand;
import Entities.StokKartEntity;
import Frames.MainFrame;
import Frames.StokKartiFrame;
import SaveCommands.StokKartiSaveCommand;
import StokKartiNavigationCommands.StokKartiFirstCommand;
import StokKartiNavigationCommands.StokKartiLastCommand;
import StokKartiNavigationCommands.StokKartiNextCommand;
import StokKartiNavigationCommands.StokKartiPreviousCommand;


public class StokKartiFrameCommand {
	public StokKartiFrame stokKartiFrame;
	
	public void execute() {
		// TODO Auto-generated method stub
		
		
		stokKartiFrame = new StokKartiFrame();
		MainFrame.desktopPane.add(stokKartiFrame).setVisible(true);
		
		ComboBoxCommand comboBoxCommandler = new ComboBoxCommand();
		comboBoxCommandler.comboBoxStokTipi(stokKartiFrame);
		comboBoxCommandler.comboBoxKdvTipi(stokKartiFrame);
		
		setListeners();
			
	}
	
	private void setListeners() {
		stokKartiFrame.btnKaydet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiSaveCommand saveCommand = new StokKartiSaveCommand(stokKartiFrame);
				if(stokKartiFrame.model.getStokKodu().equals(stokKartiFrame.tfStokKodu.getText())) {     //bu if bloğu eğer stkodu kayıtlıysa update değilse recorded ı false yapıp save etmesi için 
					saveCommand.execute();
				}else {
					stokKartiFrame.model.setRecorded(false);
					saveCommand.execute();
				}
			}
		});
		
		stokKartiFrame.btnSil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiDeleteCommand deleteCommand = new StokKartiDeleteCommand(stokKartiFrame);
				deleteCommand.execute();
			}
		});
		
		stokKartiFrame.btnIlk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiFirstCommand firstCommand = new StokKartiFirstCommand(stokKartiFrame);
				firstCommand.execute();
			}
			
		});
		
		stokKartiFrame.btnSon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiLastCommand lastCommand = new StokKartiLastCommand(stokKartiFrame);
				lastCommand.execute();
			}
			
		});
		
		stokKartiFrame.btnIleri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiNextCommand nextCommand = new StokKartiNextCommand(stokKartiFrame);
				nextCommand.execute();
			}
			
		});
		
		stokKartiFrame.btnGeri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiPreviousCommand previousCommand = new StokKartiPreviousCommand(stokKartiFrame);
				previousCommand.execute();
			}
			
		});
		
		stokKartiFrame.tfStokKodu.addActionListener(new ActionListener() {    //stok kodu textfield da enter a bastığında bilgiler componentlerde gözükecek
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartEntity stokKartEntity = new StokKartEntity();
				stokKartEntity.doldur(stokKartiFrame);
			}
		});
		
		stokKartiFrame.tfStokKodu.addFocusListener(new FocusAdapter() {    //stok kodu textfield da enter a bastığında bilgiler componentlerde gözükecek
			@Override
			public void focusLost(FocusEvent arg0) {
				StokKartEntity stokKartEntity = new StokKartEntity();
				stokKartEntity.doldur(stokKartiFrame);
			}
		});
	}
}
