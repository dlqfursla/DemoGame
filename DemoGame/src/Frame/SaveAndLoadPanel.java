package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SaveAndLoadPanel extends BasePanel  {
	JPanel Slot1;
	JLabel Slot1_Name;
	JLabel Slot1_Image;
	
	JPanel Slot2;
	JLabel Slot2_Name;
	JLabel Slot2_Image;
	
	JPanel Slot3;
	JLabel Slot3_Name;
	JLabel Slot3_Image;
	
	JLabel BackToStart;
	public SaveAndLoadPanel() {
		super();
		initSaveAndLoadPanel();
	}
	public JPanel getSlot1() {
		return Slot1;
	}
	public JPanel getSlot2() {
		return Slot2;
	}
	public JPanel getSlot3() {
		return Slot3;
	}
	public JLabel getBackToStart() {
		return BackToStart;
	}
	
	private void initSaveAndLoadPanel() {
		Slot1 = new JPanel();
		Slot1.setBounds(50, 50, 800, 150);
		Slot1.setVisible(true);
		Slot1.setOpaque(true);
		Slot1.setBackground(Color.gray);
		add(Slot1);
		
		Slot2 = new JPanel();
		Slot2.setBounds(50, 250, 800, 150);
		Slot2.setVisible(true);
		Slot2.setOpaque(true);
		Slot2.setBackground(Color.gray);
		add(Slot2);
		
		Slot3 = new JPanel();
		Slot3.setBounds(50, 450, 800, 150);
		Slot3.setVisible(true);
		Slot3.setOpaque(true);
		Slot3.setBackground(Color.gray);
		add(Slot3);
		
		BackToStart = new JLabel("Back to Main");
		BackToStart.setOpaque(true);
		BackToStart.setBounds(1000, 500, 200, 50);
		BackToStart.setHorizontalAlignment(JLabel.CENTER);
		BackToStart.setFont(new Font("Copperplate Gothic",Font.BOLD,30));
		BackToStart.setForeground(Color.white);
		BackToStart.setBackground(Color.gray);
		add(BackToStart);
		
	}
}
