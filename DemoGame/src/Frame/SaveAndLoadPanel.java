package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SaveAndLoadPanel extends BasePanel {
	private JPanel[] Slot;
	private JLabel[] SlotName;
	private JLabel[] SlotImage;

	private JLabel BackToStart;

	public SaveAndLoadPanel() {
		super();
		initSaveAndLoadPanel();
	}

	public JPanel[] getSlot() {
		return Slot;
	}

	public JPanel getSlot(int i) {
		return Slot[i];
	}

	public JLabel getBackToStart() {
		return BackToStart;
	}

	private void initSaveAndLoadPanel() {
		Slot = new JPanel[3];
		SlotName = new JLabel[3];
		SlotImage = new JLabel[3];
		for (int i = 0; i < 3; i++) {
			Slot[i] = new JPanel();
			Slot[i].setLayout(null);
			Slot[i].setBounds(50, 50 + 200 * i, 800, 150);
			Slot[i].setVisible(true);
			Slot[i].setOpaque(true);
			Slot[i].setBackground(Color.gray);
			add(Slot[i]);

			SlotName[i] = new JLabel("SlotName" + i);
			SlotName[i].setOpaque(true);
			SlotName[i].setBounds(80, 30, 200, 90);
			SlotName[i].setHorizontalAlignment(JLabel.CENTER);
			SlotName[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			SlotName[i].setForeground(Color.white);
			SlotName[i].setBackground(Color.RED);
			Slot[i].add(SlotName[i]);

			SlotImage[i] = new JLabel("SlotImage" + i);
			SlotImage[i].setOpaque(true);
			SlotImage[i].setBounds(330, 30, 400, 90);
			SlotImage[i].setHorizontalAlignment(JLabel.CENTER);
			SlotImage[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			SlotImage[i].setForeground(Color.white);
			SlotImage[i].setBackground(Color.GREEN);
			Slot[i].add(SlotImage[i]);

		}

		BackToStart = new JLabel("Back to Main");
		BackToStart.setOpaque(true);
		BackToStart.setBounds(1000, 500, 200, 50);
		BackToStart.setHorizontalAlignment(JLabel.CENTER);
		BackToStart.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		BackToStart.setForeground(Color.white);
		BackToStart.setBackground(Color.gray);
		add(BackToStart);

	}
}
