package Frame;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BasePanel extends JPanel{
	
	public BasePanel() {
		setSize(1280, 720);
		setVisible(false);
		setLayout(null);
		setOpaque(true);
		setBackground(Color.BLACK);
	}
}
