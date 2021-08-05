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

	JPanel PlayerPanel;
	JPanel[] EnemyPanel;
	JPanel SkillsPanel;
	JPanel ItemsPanel;

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
		return PlayerPanel;
	}

	public JPanel getEnemyPanel(int i) {
		return EnemyPanel[i];
	}

	public JPanel getSkillsPanel() {
		return SkillsPanel;
	}

	public JPanel getItemsPanel() {
		return ItemsPanel;
	}

	private void initBattlePanel() {
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		BackToMapBtn.setVisible(false);
		add(BackToMapBtn);

		SettingsLbl = new JLabel("Settings");
		SettingsLbl.setBounds(1115, 0, 150, 50);
		SettingsLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		SettingsLbl.setOpaque(true);
		SettingsLbl.setBackground(Color.GRAY);
		SettingsLbl.setForeground(Color.white);
		SettingsLbl.setHorizontalAlignment(JLabel.CENTER);
		add(SettingsLbl);

		PlayerPanel = new JPanel();
		PlayerPanel.setBounds(70, 200, 200, 270);
		PlayerPanel.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		PlayerPanel.setOpaque(true);
		PlayerPanel.setBackground(Color.GRAY);
		PlayerPanel.setForeground(Color.white);
		add(PlayerPanel);

		EnemyPanel = new JPanel[5];
		for (int i = 0; i < 5; i++) {
			EnemyPanel[i] = new JPanel();
			EnemyPanel[i].setBounds((int) (500 * (i * 0.2 + 1)), (int) (230 + 97 * Math.pow(-1, i + 1))+20, 165, 195);
			EnemyPanel[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
			EnemyPanel[i].setOpaque(true);
			EnemyPanel[i].setBackground(new Color(100, 50 * i, 0));
			EnemyPanel[i].setForeground(Color.white);
			add(EnemyPanel[i]);
		}
		
		SkillsPanel = new JPanel();
		SkillsPanel.setBounds(0, 580, 1280, 100);
		SkillsPanel.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		SkillsPanel.setOpaque(true);
		SkillsPanel.setBackground(Color.GRAY);
		SkillsPanel.setForeground(Color.white);
		add(SkillsPanel);
		
		ItemsPanel = new JPanel();
		ItemsPanel.setBounds(0, 0, 1280, 100);
		ItemsPanel.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
		ItemsPanel.setOpaque(true);
		ItemsPanel.setBackground(Color.GRAY);
		ItemsPanel.setForeground(Color.white);
		add(ItemsPanel);
	}
}
