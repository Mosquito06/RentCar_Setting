package kr.or.dgit.RentCar_Setting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DBSettingHome extends JPanel {

	public DBSettingHome() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(91, 341, 217, 305);
		add(panel);
		panel.setLayout(null);
		
		JButton btnInit = new JButton(new BtnAction("초기화"));
		btnInit.setBounds(12, 20, 193, 44);
		panel.add(btnInit);
		
		JButton btnExport = new JButton(new BtnAction("백업"));
		btnExport.setBounds(12, 94, 193, 44);
		panel.add(btnExport);
		
		JButton btnImport = new JButton(new BtnAction("복원"));
		btnImport.setBounds(12, 171, 193, 44);
		panel.add(btnImport);
		
		JButton btnOut = new JButton("나가기");
		btnOut.setBounds(12, 244, 193, 44);
		panel.add(btnOut);
		
		JLabel backImg = new JLabel("");
		backImg.setBounds(0, 0, 974, 751);
		backImg.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\Images\\DBBack.jpg"));
		add(backImg);

	}
}
