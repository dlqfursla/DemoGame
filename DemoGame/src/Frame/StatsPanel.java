package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatsPanel extends BasePanel {

	private JButton BackToMapBtn;
	
	private JPanel ExpeditionPnl;
	private JLabel ExpeditionCharacterLbl;
	private JPanel ExpeditionSkillsPnl;
	private JLabel[] ExpeditionSkillsLbl;
	private JPanel ExpeditionStatsPnl;
	private JLabel[] ExpeditionStatsLbl;

	private JPanel DefencePnl;
	private JLabel DefenceCharacterLbl;
	private JPanel DefenceSkillsPnl;
	private JLabel[] DefenceSkillsLbl;
	private JPanel DefenceStatsPnl;
	private JLabel[] DefenceStatsLbl;

	private JPanel explanatioPnl;
	private JLabel explanatioLbl;
	public StatsPanel() {
		super();
		initStatsPanel();
	}
	
	public JButton getBackToMapBtn() {
		return BackToMapBtn;
	}
	
	public JLabel getExplanatioLbl() {
		return explanatioLbl;
	}

	
	private void initStatsPanel() {
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setVisible(false);
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		add(BackToMapBtn);

		explanatioPnl = new JPanel();
		explanatioPnl.setLayout(null);
		explanatioPnl.setBounds(345, 290, 590, 368);
		explanatioPnl.setOpaque(true);
		explanatioPnl.setBackground(Color.GRAY);
		explanatioPnl.setForeground(Color.white);
		add(explanatioPnl);

		explanatioLbl = new JLabel("explanatioLbl");
		explanatioLbl.setBounds(0, 0, 590, 368);
		explanatioLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		explanatioLbl.setOpaque(true);
		explanatioLbl.setHorizontalAlignment(JLabel.CENTER);
		explanatioLbl.setBackground(Color.GRAY);
		explanatioLbl.setForeground(Color.white);
		explanatioPnl.add(explanatioLbl);

		ExpeditionPnl= new JPanel();
		ExpeditionPnl.setLayout(null);
		ExpeditionPnl.setBounds(20, 20, 630, 650);
		ExpeditionPnl.setOpaque(true);
		ExpeditionPnl.setBackground(Color.YELLOW);
		ExpeditionPnl.setForeground(Color.white);
		add(ExpeditionPnl);

		ExpeditionCharacterLbl = new JLabel("ExpeditionCharacterLbl");
		ExpeditionCharacterLbl.setBounds(20, 20, 150, 240);
		ExpeditionCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		ExpeditionCharacterLbl.setOpaque(true);
		ExpeditionCharacterLbl.setHorizontalAlignment(JLabel.CENTER);
		ExpeditionCharacterLbl.setBackground(Color.GRAY);
		ExpeditionCharacterLbl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionCharacterLbl);

		ExpeditionSkillsPnl = new JPanel();
		ExpeditionSkillsPnl.setLayout(new GridLayout(4,2));
		ExpeditionSkillsPnl.setBounds(200, 20, 390, 240);
		ExpeditionSkillsPnl.setOpaque(true);
		ExpeditionSkillsPnl.setBackground(Color.GREEN);
		ExpeditionSkillsPnl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionSkillsPnl);
		
		ExpeditionSkillsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			ExpeditionSkillsLbl[i] = new JLabel("ExpeditionSkillsLbl"+i);
			ExpeditionSkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 8));
			ExpeditionSkillsLbl[i].setOpaque(true);
			ExpeditionSkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ExpeditionSkillsLbl[i].setBackground(new Color(20*i,30*i,25*i));
			ExpeditionSkillsLbl[i].setForeground(Color.white);
			ExpeditionSkillsPnl.add(ExpeditionSkillsLbl[i]);
		}
		
		ExpeditionStatsPnl = new JPanel();
		ExpeditionStatsPnl.setLayout(new GridLayout(8,1));
		ExpeditionStatsPnl.setBounds(20, 270, 285, 368);
		ExpeditionStatsPnl.setOpaque(true);
		ExpeditionStatsPnl.setBackground(Color.GRAY);
		ExpeditionStatsPnl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionStatsPnl);
		
		ExpeditionStatsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			ExpeditionStatsLbl[i] = new JLabel("ExpeditionStatsLbl"+i);
			ExpeditionStatsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			ExpeditionStatsLbl[i].setOpaque(true);
			ExpeditionStatsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ExpeditionStatsLbl[i].setBackground(new Color(5*i,27*i,18*i));
			ExpeditionStatsLbl[i].setForeground(Color.white);
			ExpeditionStatsPnl.add(ExpeditionStatsLbl[i]);
		}

		DefencePnl= new JPanel();
		DefencePnl.setLayout(null);
		DefencePnl.setBounds(650, 20, 610, 650);
		DefencePnl.setOpaque(true);
		DefencePnl.setBackground(Color.YELLOW);
		DefencePnl.setForeground(Color.white);
		add(DefencePnl);


		DefenceCharacterLbl = new JLabel("DefenceCharacterLbl");
		DefenceCharacterLbl.setBounds(20, 20, 150, 240);
		DefenceCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		DefenceCharacterLbl.setOpaque(true);
		DefenceCharacterLbl.setHorizontalAlignment(JLabel.CENTER);
		DefenceCharacterLbl.setBackground(Color.GRAY);
		DefenceCharacterLbl.setForeground(Color.white);
		DefencePnl.add(DefenceCharacterLbl);
		
		DefenceSkillsPnl = new JPanel();
		DefenceSkillsPnl.setLayout(new GridLayout(4,2));
		DefenceSkillsPnl.setBounds(200, 20, 390, 240);
		DefenceSkillsPnl.setOpaque(true);
		DefenceSkillsPnl.setBackground(Color.GREEN);
		DefenceSkillsPnl.setForeground(Color.white);
		DefencePnl.add(DefenceSkillsPnl);
		
		DefenceSkillsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			DefenceSkillsLbl[i] = new JLabel("DefenceSkillsLbl"+i);
			DefenceSkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			DefenceSkillsLbl[i].setOpaque(true);
			DefenceSkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			DefenceSkillsLbl[i].setBackground(new Color(11*i,22*i,14*i));
			DefenceSkillsLbl[i].setForeground(Color.white);
			DefenceSkillsPnl.add(DefenceSkillsLbl[i]);
		}
		
		DefenceStatsPnl = new JPanel();
		DefenceStatsPnl.setLayout(new GridLayout(8,1));
		DefenceStatsPnl.setBounds(305, 270, 285, 368);
		DefenceStatsPnl.setOpaque(true);
		DefenceStatsPnl.setBackground(Color.GRAY);
		DefenceStatsPnl.setForeground(Color.white);
		DefencePnl.add(DefenceStatsPnl);
		
		DefenceStatsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			DefenceStatsLbl[i] = new JLabel("DefenceStatsLbl"+i);
			DefenceStatsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			DefenceStatsLbl[i].setOpaque(true);
			DefenceStatsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			DefenceStatsLbl[i].setBackground(new Color(21*i,28*i,15*i));
			DefenceStatsLbl[i].setForeground(Color.white);
			DefenceStatsPnl.add(DefenceStatsLbl[i]);
		}


	}
}
