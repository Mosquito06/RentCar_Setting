package kr.or.dgit.Coffee_Setting;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import kr.or.dgit.Coffee_Setting.service.DbService;
import kr.or.dgit.Coffee_Setting.service.ExportService;
import kr.or.dgit.Coffee_Setting.service.ImportService;
import kr.or.dgit.Coffee_Setting.service.InitService;

@SuppressWarnings("serial")
public class BtnAction extends AbstractAction {

	public BtnAction(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DbService service = null;
		
		switch (e.getActionCommand()) {
		case "초기화":
			service = InitService.getInstance();
			break;
		case "백원":
			service = ExportService.getInstance();
			break;
		case "복원":
			service = ImportService.getInstance();
			break;
		}
		service.service();
		JOptionPane.showMessageDialog(null, e.getActionCommand() + "가(이) 완료되었습니다.");
	}

}
