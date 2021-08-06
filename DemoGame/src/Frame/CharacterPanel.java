package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CharacterPanel extends BasePanel {
	JButton BackToMapBtn;
	JButton ToBattleBtn;

	JLabel AlarmLbl;

	JPanel ExpeditionPnl;
	JLabel ExpeditionCharacterLbl;
	JLabel[] ExpeditionSkillsLbl;

	JPanel DefencePnl;
	JLabel DefenceCharacterLbl;
	JLabel[] DefenceSkillsLbl;

	JPanel SkillsPnl;
	JLabel[] SkillsLbl;

	JLabel EnDExchangeLbl;
	JLabel SkillExchangeLbl;

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

		AlarmLbl = new JLabel();
		AlarmLbl.setBounds(340, 0, 600, 50);
		AlarmLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		AlarmLbl.setOpaque(true);
		AlarmLbl.setBackground(Color.GRAY);
		AlarmLbl.setForeground(Color.white);
		add(AlarmLbl);

		ExpeditionPnl = new JPanel();
		ExpeditionPnl.setBounds(20, 70, 610, 300);
		ExpeditionPnl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		ExpeditionPnl.setOpaque(true);
		ExpeditionPnl.setBackground(Color.GRAY);
		ExpeditionPnl.setForeground(Color.white);
		add(ExpeditionPnl);

		ExpeditionCharacterLbl = new JLabel();
		ExpeditionCharacterLbl.setBounds(20, 70, 600, 50);
		ExpeditionCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		ExpeditionCharacterLbl.setOpaque(true);
		ExpeditionCharacterLbl.setBackground(Color.GRAY);
		ExpeditionCharacterLbl.setForeground(Color.white);
		add(ExpeditionCharacterLbl);

		ExpeditionSkillsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			ExpeditionSkillsLbl[i] = new JLabel();
			ExpeditionSkillsLbl[i].setBounds(340, 0, 600, 50);
			ExpeditionSkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			ExpeditionSkillsLbl[i].setOpaque(true);
			ExpeditionSkillsLbl[i].setBackground(Color.GRAY);
			ExpeditionSkillsLbl[i].setForeground(Color.white);
			add(ExpeditionSkillsLbl[i]);
		}
		
		DefencePnl = new JPanel();
		DefencePnl.setBounds(0, 580, 610, 300);
		DefencePnl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		DefencePnl.setOpaque(true);
		DefencePnl.setBackground(Color.GRAY);
		DefencePnl.setForeground(Color.white);
		add(DefencePnl);

		DefenceCharacterLbl = new JLabel();
		DefenceCharacterLbl.setBounds(20, 70, 600, 50);
		DefenceCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		DefenceCharacterLbl.setOpaque(true);
		DefenceCharacterLbl.setBackground(Color.GRAY);
		DefenceCharacterLbl.setForeground(Color.white);
		add(DefenceCharacterLbl);

		DefenceSkillsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			DefenceSkillsLbl[i] = new JLabel();
			DefenceSkillsLbl[i].setBounds(340, 0, 600, 50);
			DefenceSkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			DefenceSkillsLbl[i].setOpaque(true);
			DefenceSkillsLbl[i].setBackground(Color.GRAY);
			DefenceSkillsLbl[i].setForeground(Color.white);
			add(DefenceSkillsLbl[i]);
		}
	}
}
