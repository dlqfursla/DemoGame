package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharacterPanel extends BasePanel {
	private JButton BackToMapBtn;
	private JButton ToBattleBtn;

	private JLabel AlarmLbl;

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

	private JPanel SkillsPnl;
	private JLabel[] SkillsLbl;

	private JLabel EnDExchangeLbl;
	private JLabel SkillExchangeLbl;

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
		BackToMapBtn.setVisible(false);
		add(BackToMapBtn);

		ToBattleBtn = new JButton("ToBattleBtn");
		ToBattleBtn.setSize(200, 150);
		ToBattleBtn.setLocation(450, 100);
		ToBattleBtn.setVisible(false);
		add(ToBattleBtn);

		AlarmLbl = new JLabel("AlarmLbl");
		AlarmLbl.setBounds(340, 0, 600, 50);
		AlarmLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		AlarmLbl.setHorizontalAlignment(JLabel.CENTER);
		AlarmLbl.setOpaque(true);
		AlarmLbl.setBackground(Color.GRAY);
		AlarmLbl.setForeground(Color.white);
		add(AlarmLbl);

		ExpeditionPnl = new JPanel();
		ExpeditionPnl.setLayout(null);
		ExpeditionPnl.setBounds(20, 70, 610, 300);
		ExpeditionPnl.setOpaque(true);
		ExpeditionPnl.setBackground(Color.YELLOW);
		ExpeditionPnl.setForeground(Color.white);
		add(ExpeditionPnl);

		ExpeditionCharacterLbl = new JLabel("ExpeditionCharacterLbl");
		ExpeditionCharacterLbl.setBounds(20, 20, 150, 160);
		ExpeditionCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		ExpeditionCharacterLbl.setOpaque(true);
		ExpeditionCharacterLbl.setHorizontalAlignment(JLabel.CENTER);
		ExpeditionCharacterLbl.setBackground(Color.GRAY);
		ExpeditionCharacterLbl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionCharacterLbl);

		ExpeditionSkillsPnl = new JPanel();
		ExpeditionSkillsPnl.setLayout(new GridLayout(2,4));
		ExpeditionSkillsPnl.setBounds(200, 20, 400, 160);
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
		ExpeditionStatsPnl.setLayout(new GridLayout(2,4));
		ExpeditionStatsPnl.setBounds(20, 190, 580, 100);
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
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		DefencePnl = new JPanel();
		DefencePnl.setLayout(null);
		DefencePnl.setBounds(650, 70, 610, 300);
		DefencePnl.setOpaque(true);
		DefencePnl.setBackground(Color.YELLOW);
		DefencePnl.setForeground(Color.white);
		add(DefencePnl);

		DefenceCharacterLbl = new JLabel("DefenceCharacterLbl");
		DefenceCharacterLbl.setBounds(20, 20, 150, 160);
		DefenceCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		DefenceCharacterLbl.setOpaque(true);
		DefenceCharacterLbl.setHorizontalAlignment(JLabel.CENTER);
		DefenceCharacterLbl.setBackground(Color.GRAY);
		DefenceCharacterLbl.setForeground(Color.white);
		DefencePnl.add(DefenceCharacterLbl);
		
		DefenceSkillsPnl = new JPanel();
		DefenceSkillsPnl.setLayout(new GridLayout(2,4));
		DefenceSkillsPnl.setBounds(200, 20, 400, 160);
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
		DefenceStatsPnl.setLayout(new GridLayout(2,4));
		DefenceStatsPnl.setBounds(20, 190, 580, 100);
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
		

		
		SkillsPnl = new JPanel();
		SkillsPnl.setLayout(new GridLayout(4,8));
		SkillsPnl.setBounds(20, 385, 1240, 200);
		SkillsPnl.setOpaque(true);
		SkillsPnl.setBackground(Color.MAGENTA);
		SkillsPnl.setForeground(Color.white);
		add(SkillsPnl);
		
		SkillsLbl = new JLabel[32];
		for (int i = 0; i < 32; i++) {
			SkillsLbl[i] = new JLabel("Label"+i);
			SkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			SkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			SkillsLbl[i].setOpaque(true);
			SkillsLbl[i].setBackground(new Color(i*2,i*3,i*4));
			SkillsLbl[i].setForeground(Color.GREEN);
			SkillsPnl.add(SkillsLbl[i]);
		}

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		EnDExchangeLbl = new JLabel("E&D Exchange");
		EnDExchangeLbl.setBounds(480, 600, 150, 50);
		EnDExchangeLbl.setHorizontalAlignment(JLabel.CENTER);
		EnDExchangeLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
		EnDExchangeLbl.setOpaque(true);
		EnDExchangeLbl.setBackground(Color.GRAY);
		EnDExchangeLbl.setForeground(Color.white);
		add(EnDExchangeLbl);
		
		SkillExchangeLbl = new JLabel("Change");
		SkillExchangeLbl.setBounds(650, 600, 150, 50);
		SkillExchangeLbl.setHorizontalAlignment(JLabel.CENTER);
		SkillExchangeLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		SkillExchangeLbl.setOpaque(true);
		SkillExchangeLbl.setBackground(Color.GRAY);
		SkillExchangeLbl.setForeground(Color.white);
		add(SkillExchangeLbl);

		
	}
}
