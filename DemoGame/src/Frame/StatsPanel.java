package Frame;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class StatsPanel extends BasePanel {
	JLabel StatsLabel;
	JButton ChangeStatsBtn;
	JButton BackToMapBtn;
	
	int Stats = 0;
	public StatsPanel() {
		super();
		initStatsPanel();
	}
	
	public JLabel getStatsLabel() {
		return StatsLabel;
	}
	public JButton getChangeStatsBtn() {
		return ChangeStatsBtn;
	}
	public JButton getBackToMapBtn() {
		return BackToMapBtn;
	}
	
	public void setStats(int num) {
		Stats = Stats + num;
		StatsLabel.setText("Stats : " + Stats);
	}
	
	private void initStatsPanel() {
		StatsLabel = new JLabel("Stats : " + Stats);
		StatsLabel.setSize(200, 150);
		StatsLabel.setLocation(50, 50);
		add(StatsLabel);
		
		ChangeStatsBtn = new JButton("ChangeStatsBtn");
		ChangeStatsBtn.setSize(200, 150);
		ChangeStatsBtn.setLocation(800, 100);
		add(ChangeStatsBtn);
		
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		add(BackToMapBtn);
	}
}
