package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;


@SuppressWarnings("serial")
public class StartPanel extends BasePanel {
	JLabel NewGameLbl;
	
	public StartPanel() {
		super();
		initStartPanel();

	}
	
	public JLabel getNewGameLabel() {
		return NewGameLbl;
	}
	
	private void initStartPanel() {
		NewGameLbl = new JLabel("New Game");
		NewGameLbl.setOpaque(true);
		NewGameLbl.setBounds(500, 450, 200, 80);
		NewGameLbl.setHorizontalAlignment(JLabel.CENTER);
		NewGameLbl.setFont(new Font("Copperplate Gothic",Font.BOLD,30));
		NewGameLbl.setForeground(Color.white);
		NewGameLbl.setBackground(Color.gray);
		add(NewGameLbl);
	}
	
}
