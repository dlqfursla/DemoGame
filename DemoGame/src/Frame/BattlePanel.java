package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BattlePanel extends BasePanel {
	JButton BackToMapBtn;

	JLabel SettingsLbl;

	JPanel PlayerPnl;
	JPanel[] EnemyPnl;
	JPanel SkillsPnl;
	JPanel ItemsPnl;

	public BattlePanel() {
		super();
		initBattlePanel();
	}

	public JButton getBackToMapBtn() {
		return BackToMapBtn;
	}

	public JLabel getSettingsLbl() {
		return SettingsLbl;
	}

	public JPanel getPlayerPanel() {
		return PlayerPnl;
	}

	public JPanel getEnemyPanel(int i) {
		return EnemyPnl[i];
	}

	public JPanel getSkillsPanel() {
		return SkillsPnl;
	}

	public JPanel getItemsPanel() {
		return ItemsPnl;
	}

	private void initBattlePanel() {
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		BackToMapBtn.setVisible(true);
		add(BackToMapBtn);

		SettingsLbl = new JLabel("Settings");
		SettingsLbl.setBounds(1115, 0, 150, 50);
		SettingsLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		SettingsLbl.setOpaque(true);
		SettingsLbl.setBackground(Color.GRAY);
		SettingsLbl.setForeground(Color.white);
		SettingsLbl.setHorizontalAlignment(JLabel.CENTER);
		add(SettingsLbl);

		PlayerPnl = new JPanel();
		PlayerPnl.setBounds(70, 200, 200, 270);
		PlayerPnl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		PlayerPnl.setOpaque(true);
		PlayerPnl.setBackground(Color.GRAY);
		PlayerPnl.setForeground(Color.white);
		add(PlayerPnl);

		EnemyPnl = new JPanel[5];
		for (int i = 0; i < 5; i++) {
			EnemyPnl[i] = new JPanel();
			EnemyPnl[i].setBounds((int) (500 * (i * 0.2 + 1)), (int) (230 + 97 * Math.pow(-1, i + 1))+20, 165, 195);
			EnemyPnl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			EnemyPnl[i].setOpaque(true);
			EnemyPnl[i].setBackground(new Color(100, 50 * i, 0));
			EnemyPnl[i].setForeground(Color.white);
			add(EnemyPnl[i]);
		}
		
		SkillsPnl = new JPanel();
		SkillsPnl.setBounds(0, 580, 1280, 100);
		SkillsPnl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		SkillsPnl.setOpaque(true);
		SkillsPnl.setBackground(Color.GRAY);
		SkillsPnl.setForeground(Color.white);
		add(SkillsPnl);
		
		ItemsPnl = new JPanel();
		ItemsPnl.setBounds(0, 0, 1280, 100);
		ItemsPnl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		ItemsPnl.setOpaque(true);
		ItemsPnl.setBackground(Color.GRAY);
		ItemsPnl.setForeground(Color.white);
		add(ItemsPnl);
	}
}
