package Frame;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class StartPanel extends BasePanel {
	JButton toMapBtn;
	
	public StartPanel() {
		super();
		initStartPanel();

	}
	
	public JButton getToMapBtn() {
		return toMapBtn;
	}
	
	private void initStartPanel() {
		toMapBtn = new JButton("toMapBtn");
		toMapBtn.setSize(200, 150);
		toMapBtn.setLocation(250,250);
		add(toMapBtn);
	}
	
}
