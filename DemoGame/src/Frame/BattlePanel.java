package Frame;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BattlePanel extends BasePanel {
	JButton BackToMapBtn;
	public BattlePanel() {
		super();
		initBattlePanel();
	}
	
	public JButton getBackToMapBtn() {
		return BackToMapBtn;
	}
	
	private void initBattlePanel() {
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		add(BackToMapBtn);
	}
}
