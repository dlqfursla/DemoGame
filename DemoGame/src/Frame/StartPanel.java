package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class StartPanel extends BasePanel {
	JLabel TitleLbl; 
	 
	JLabel NewGameLbl; 
	JLabel ContinueLbl; 
	JLabel EndGameLbl; 
	
	public StartPanel() {
		super();
		initStartPanel();

	}
	public JLabel getContinueLabel() { 
		return ContinueLbl; 
	} 
	public JLabel getEndGameLabel() { 
		return EndGameLbl; 
	} 
	
	public JLabel getNewGameLabel() {
		return NewGameLbl;
	}
	
	private void initStartPanel() {
		TitleLbl = new JLabel("The Game Title"); 
		TitleLbl.setOpaque(true); 
		TitleLbl.setBounds(50, 50, 1165, 300); 
		TitleLbl.setHorizontalAlignment(JLabel.CENTER); 
		TitleLbl.setFont(new Font("Copperplate Gothic",Font.BOLD,150)); 
		TitleLbl.setForeground(Color.white); 
		TitleLbl.setBackground(Color.yellow); 
		add(TitleLbl); 
		
		NewGameLbl = new JLabel("New Game");
		NewGameLbl.setOpaque(true);
		NewGameLbl.setBounds(532, 400, 200, 50); 
		NewGameLbl.setHorizontalAlignment(JLabel.CENTER);
		NewGameLbl.setFont(new Font("Copperplate Gothic",Font.BOLD,30));
		NewGameLbl.setForeground(Color.white);
		NewGameLbl.setBackground(Color.gray);
		add(NewGameLbl);
		
		ContinueLbl = new JLabel("Continue"); 
		ContinueLbl.setOpaque(true); 
		ContinueLbl.setBounds(532, 470, 200, 50); 
		ContinueLbl.setHorizontalAlignment(JLabel.CENTER); 
		ContinueLbl.setFont(new Font("Copperplate Gothic",Font.BOLD,30)); 
		ContinueLbl.setForeground(Color.white); 
		ContinueLbl.setBackground(Color.gray); 
		add(ContinueLbl); 
		 
		EndGameLbl = new JLabel("End Game"); 
		EndGameLbl.setOpaque(true); 
		EndGameLbl.setBounds(532, 540, 200, 50); 
		EndGameLbl.setHorizontalAlignment(JLabel.CENTER); 
		EndGameLbl.setFont(new Font("Copperplate Gothic",Font.BOLD,30)); 
		EndGameLbl.setForeground(Color.white); 
		EndGameLbl.setBackground(Color.gray); 
		add(EndGameLbl); 
	}
	
}
