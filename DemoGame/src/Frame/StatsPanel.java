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
	private JLabel[] ExpeditionStatsNameLbl;
	private JLabel[] ExpeditionStatsNumLbl;
	private JLabel[] ExpeditionStatsUpLbl;
	private JPanel ExpeditionAllPnl;
	private JLabel[][] ExpeditionStatsAllLbl;

	String[] StatsName = { "HP", "Stamina", "MaxAtk", "MinAtk", "Intelligence", "Def", "regeneration", "" };

	// private JPanel DefencePnl;
	// private JLabel DefenceCharacterLbl;
	// private JPanel DefenceSkillsPnl;
	// private JLabel[] DefenceSkillsLbl;
	// private JPanel DefenceStatsPnl;
	// private JLabel[] DefenceStatsLbl;

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
		explanatioPnl.setBounds(450, 290, 790, 368);
		explanatioPnl.setOpaque(true);
		explanatioPnl.setBackground(Color.yellow);
		explanatioPnl.setForeground(Color.white);
		add(explanatioPnl);

		explanatioLbl = new JLabel("explanatioLbl");
		explanatioLbl.setBounds(0, 0, 770, 368);
		explanatioLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		explanatioLbl.setOpaque(true);
		explanatioLbl.setHorizontalAlignment(JLabel.CENTER);
		explanatioLbl.setBackground(Color.GRAY);
		explanatioLbl.setForeground(Color.white);
		explanatioPnl.add(explanatioLbl);

		ExpeditionPnl = new JPanel();
		ExpeditionPnl.setLayout(null);
		ExpeditionPnl.setBounds(20, 20, 1220, 650);
		ExpeditionPnl.setOpaque(true);
		ExpeditionPnl.setBackground(Color.YELLOW);
		ExpeditionPnl.setForeground(Color.white);
		add(ExpeditionPnl);

		ExpeditionCharacterLbl = new JLabel("ExpeditionCharacterLbl");
		ExpeditionCharacterLbl.setBounds(20, 20, 285, 240);
		ExpeditionCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		ExpeditionCharacterLbl.setOpaque(true);
		ExpeditionCharacterLbl.setHorizontalAlignment(JLabel.CENTER);
		ExpeditionCharacterLbl.setBackground(Color.GRAY);
		ExpeditionCharacterLbl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionCharacterLbl);

		ExpeditionSkillsPnl = new JPanel();
		ExpeditionSkillsPnl.setLayout(new GridLayout(2, 4));
		ExpeditionSkillsPnl.setBounds(315, 20, 880, 240);
		ExpeditionSkillsPnl.setOpaque(true);
		ExpeditionSkillsPnl.setBackground(Color.GREEN);
		ExpeditionSkillsPnl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionSkillsPnl);

		ExpeditionSkillsLbl = new JLabel[8];
		for (int i = 0; i < 8; i++) {
			ExpeditionSkillsLbl[i] = new JLabel("ExpeditionSkillsLbl" + i);
			ExpeditionSkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 8));
			ExpeditionSkillsLbl[i].setOpaque(true);
			ExpeditionSkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ExpeditionSkillsLbl[i].setBackground(new Color(20 * i, 30 * i, 25 * i));
			ExpeditionSkillsLbl[i].setForeground(Color.white);
			ExpeditionSkillsPnl.add(ExpeditionSkillsLbl[i]);
		}

		ExpeditionStatsPnl = new JPanel();
		ExpeditionStatsPnl.setLayout(new GridLayout(8, 1));
		ExpeditionStatsPnl.setBounds(20, 270, 400, 368);
		ExpeditionStatsPnl.setOpaque(false);
		ExpeditionStatsPnl.setBackground(Color.GRAY);
		ExpeditionStatsPnl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionStatsPnl);

		ExpeditionStatsNameLbl = new JLabel[7];
		for (int i = 0; i < 7; i++) {
			ExpeditionStatsNameLbl[i] = new JLabel(StatsName[i]);
			ExpeditionStatsNameLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			ExpeditionStatsNameLbl[i].setOpaque(false);
			ExpeditionStatsNameLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ExpeditionStatsNameLbl[i].setBackground(new Color(5 * i, 27 * i, 18 * i));
			ExpeditionStatsNameLbl[i].setForeground(Color.white);
			ExpeditionStatsPnl.add(ExpeditionStatsNameLbl[i]);
		}

		ExpeditionStatsNumLbl = new JLabel[7];
		for (int i = 0; i < 7; i++) {
			ExpeditionStatsNumLbl[i] = new JLabel("123");
			ExpeditionStatsNumLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			ExpeditionStatsNumLbl[i].setOpaque(false);
			ExpeditionStatsNumLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ExpeditionStatsNumLbl[i].setBackground(new Color(5 * i, 27 * i, 18 * i));
			ExpeditionStatsNumLbl[i].setForeground(Color.white);
			ExpeditionStatsPnl.add(ExpeditionStatsNumLbl[i]);
		}

		ExpeditionStatsUpLbl = new JLabel[7];
		for (int i = 0; i < 7; i++) {
			ExpeditionStatsUpLbl[i] = new JLabel("▲");
			ExpeditionStatsUpLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			ExpeditionStatsUpLbl[i].setOpaque(false);
			ExpeditionStatsUpLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ExpeditionStatsUpLbl[i].setBackground(new Color(5 * i, 27 * i, 18 * i));
			ExpeditionStatsUpLbl[i].setForeground(Color.white);
			ExpeditionStatsPnl.add(ExpeditionStatsUpLbl[i]);
		}

		ExpeditionAllPnl = new JPanel();
		ExpeditionAllPnl.setLayout(new GridLayout(8, 3));
		ExpeditionAllPnl.setBounds(20, 270, 400, 368);
		ExpeditionAllPnl.setOpaque(true);
		ExpeditionAllPnl.setBackground(Color.GRAY);
		ExpeditionAllPnl.setForeground(Color.white);
		ExpeditionPnl.add(ExpeditionAllPnl);

		ExpeditionStatsAllLbl = new JLabel[8][3];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					ExpeditionStatsAllLbl[i][j] = ExpeditionStatsNameLbl[i];
				} else if (j == 1) {
					ExpeditionStatsAllLbl[i][j] = ExpeditionStatsNumLbl[i];
				} else {
					ExpeditionStatsAllLbl[i][j] = ExpeditionStatsUpLbl[i];
				}

				ExpeditionStatsAllLbl[i][j].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
				ExpeditionStatsAllLbl[i][j].setOpaque(true);
				ExpeditionStatsAllLbl[i][j].setHorizontalAlignment(JLabel.CENTER);
				ExpeditionStatsAllLbl[i][j].setBackground(new Color(5 * i, 27 * i, 18 * i));
				ExpeditionStatsAllLbl[i][j].setForeground(Color.white);
				ExpeditionAllPnl.add(ExpeditionStatsAllLbl[i][j]);

			}
		}

		ExpeditionStatsAllLbl[7][1] = new JLabel("남은 포인트");
		ExpeditionStatsAllLbl[7][1].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		ExpeditionStatsAllLbl[7][1].setOpaque(true);
		ExpeditionStatsAllLbl[7][1].setHorizontalAlignment(JLabel.CENTER);
		ExpeditionStatsAllLbl[7][1].setBackground(new Color(5 * 7, 27 * 7, 18 * 7));
		ExpeditionStatsAllLbl[7][1].setForeground(Color.white);

		ExpeditionStatsAllLbl[7][2] = new JLabel("3");
		ExpeditionStatsAllLbl[7][2].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		ExpeditionStatsAllLbl[7][2].setOpaque(true);
		ExpeditionStatsAllLbl[7][2].setHorizontalAlignment(JLabel.CENTER);
		ExpeditionStatsAllLbl[7][2].setBackground(new Color(5 * 7, 27 * 7, 18 * 7));
		ExpeditionStatsAllLbl[7][2].setForeground(Color.white);

		ExpeditionAllPnl.add(ExpeditionStatsAllLbl[7][1]);
		ExpeditionAllPnl.add(ExpeditionStatsAllLbl[7][2]);

		// DefencePnl= new JPanel();
		// DefencePnl.setLayout(null);
		// DefencePnl.setBounds(650, 20, 610, 650);
		// DefencePnl.setOpaque(true);
		// DefencePnl.setBackground(Color.YELLOW);
		// DefencePnl.setForeground(Color.white);
		// add(DefencePnl);

		// DefenceCharacterLbl = new JLabel("DefenceCharacterLbl");
		// DefenceCharacterLbl.setBounds(20, 20, 150, 240);
		// DefenceCharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		// DefenceCharacterLbl.setOpaque(true);
		// DefenceCharacterLbl.setHorizontalAlignment(JLabel.CENTER);
		// DefenceCharacterLbl.setBackground(Color.GRAY);
		// DefenceCharacterLbl.setForeground(Color.white);
		// DefencePnl.add(DefenceCharacterLbl);

		// DefenceSkillsPnl = new JPanel();
		// DefenceSkillsPnl.setLayout(new GridLayout(4,2));
		// DefenceSkillsPnl.setBounds(200, 20, 390, 240);
		// DefenceSkillsPnl.setOpaque(true);
		// DefenceSkillsPnl.setBackground(Color.GREEN);
		// DefenceSkillsPnl.setForeground(Color.white);
		// DefencePnl.add(DefenceSkillsPnl);

		// DefenceSkillsLbl = new JLabel[8];
		// for (int i = 0; i < 8; i++) {
		// DefenceSkillsLbl[i] = new JLabel("DefenceSkillsLbl"+i);
		// DefenceSkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		// DefenceSkillsLbl[i].setOpaque(true);
		// DefenceSkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
		// DefenceSkillsLbl[i].setBackground(new Color(11*i,22*i,14*i));
		// DefenceSkillsLbl[i].setForeground(Color.white);
		// DefenceSkillsPnl.add(DefenceSkillsLbl[i]);
		// }

		// DefenceStatsPnl = new JPanel();
		// DefenceStatsPnl.setLayout(new GridLayout(8,1));
		// DefenceStatsPnl.setBounds(305, 270, 285, 368);
		// DefenceStatsPnl.setOpaque(true);
		// DefenceStatsPnl.setBackground(Color.GRAY);
		// DefenceStatsPnl.setForeground(Color.white);
		// DefencePnl.add(DefenceStatsPnl);

		// DefenceStatsLbl = new JLabel[8];
		// for (int i = 0; i < 8; i++) {
		// DefenceStatsLbl[i] = new JLabel("DefenceStatsLbl"+i);
		// DefenceStatsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		// DefenceStatsLbl[i].setOpaque(true);
		// DefenceStatsLbl[i].setHorizontalAlignment(JLabel.CENTER);
		// DefenceStatsLbl[i].setBackground(new Color(21*i,28*i,15*i));
		// DefenceStatsLbl[i].setForeground(Color.white);
		// DefenceStatsPnl.add(DefenceStatsLbl[i]);
		// }

	}
}
