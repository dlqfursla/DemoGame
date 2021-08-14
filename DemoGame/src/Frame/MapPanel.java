package Frame;

import javax.swing.JButton;

public class MapPanel extends BasePanel {
	JButton toCharacterBtn;
	JButton toStartBtn;
	JButton toStatsBtn;

	public MapPanel() {
		super();
		initStartPanel();
	}

	public JButton getToCharacterBtn() {
		return toCharacterBtn;
	}
	public JButton getToStartBtn() {
		return toStartBtn;
	}
	public JButton getToStatsBtn() {
		return toStatsBtn;
	}
	
	private void initStartPanel() {
		toCharacterBtn = new JButton("toCharacterBtn");
		toCharacterBtn.setSize(200, 150);
		toCharacterBtn.setLocation(650,250);
		add(toCharacterBtn);
		
		toStartBtn = new JButton("toStartBtn");
		toStartBtn.setSize(200, 150);
		toStartBtn.setLocation(450,250);
		add(toStartBtn);
		
		toStatsBtn = new JButton("toStatsBtn");
		toStatsBtn.setSize(200, 150);
		toStatsBtn.setLocation(450,550);
		add(toStatsBtn);
	}
	
}
