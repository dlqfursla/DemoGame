package Frame;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CharacterPanel extends BasePanel {
	JButton BackToMapBtn;
	JButton ToBattleBtn;
	public CharacterPanel() {
		super();
		initCharacterPanel();
	}

	public JButton getBackToMapBtn() {
		return BackToMapBtn;
	}
	public JButton getToBattleBtn() {
		return ToBattleBtn;
	}
	private void initCharacterPanel() {
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		add(BackToMapBtn);
		
		ToBattleBtn = new JButton("ToBattleBtn");
		ToBattleBtn.setSize(200, 150);
		ToBattleBtn.setLocation(450, 100);
		add(ToBattleBtn);
	}
}
