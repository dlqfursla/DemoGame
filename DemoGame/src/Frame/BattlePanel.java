package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BattlePanel extends BasePanel {
	JButton BackToMapBtn;

	JLabel SettingsLbl;

	JPanel PlayerPnl;
	JPanel[] EnemyPnl;

	JPanel SkillsPnl;
	JLabel[] SkillsLbl;

	JPanel ItemsPnl;
	JLabel ItemTitleLbl;
	JLabel[] ItemsLbl;

	JLabel[] NameLbl;

	JLabel[] CharacterPortraitLbl;

	JPanel[] BottomPnl;

	JPanel[] HPPnl;
	JLabel[] MaxHPLbl;
	JLabel[] HPLbl;

	JLabel StaminaLbl;

	JPanel[] debuffPnl;
	JLabel[] stunLbl;
	JLabel[] WeakenLbl;
	JLabel[] SlowLbl;

	JLabel[] NextActionLbl;
	
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
	public JPanel[] getEnemyPanel() {
		return EnemyPnl;
	}
	public JPanel getEnemyPanel(int i) {
		if(EnemyPnl.length > i)
			return EnemyPnl[i];
		else
			return new JPanel();
	}

	public JPanel getSkillsPanel() {
		return SkillsPnl;
	}
	
	public JLabel[] getSkillsLabel() {
		return SkillsLbl;
	}
	public JLabel getSkillsLabel(int i) {
		if(SkillsLbl.length > i)
			return SkillsLbl[i];
		else
			return new JLabel("Error");
	}
	public JPanel getItemsPanel() {
		return ItemsPnl;
	}

	public JLabel[] getItemsLabel() {
		return ItemsLbl;
	}
	public JLabel getItemsLabel(int i) {	
		if(ItemsLbl.length > i)
			return ItemsLbl[i];
		else
			return new JLabel("Error");
	}

	private void initBattlePanel() {
		BackToMapBtn = new JButton("BackToMapBtn");
		BackToMapBtn.setSize(200, 150);
		BackToMapBtn.setLocation(650, 250);
		BackToMapBtn.setVisible(true);
		add(BackToMapBtn);

		SettingsLbl = new JLabel("Settings");
		SettingsLbl.setBounds(1115, 0, 150, 100);
		SettingsLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
		SettingsLbl.setOpaque(true);
		SettingsLbl.setBackground(Color.BLACK);
		SettingsLbl.setForeground(Color.white);
		SettingsLbl.setHorizontalAlignment(JLabel.CENTER);
		add(SettingsLbl);

		PlayerPnl = new JPanel();
		PlayerPnl.setLayout(new BorderLayout());
		PlayerPnl.setBounds(100, 200, 200, 270);
		PlayerPnl.setOpaque(true);
		PlayerPnl.setBackground(Color.GRAY);
		PlayerPnl.setForeground(Color.white);
		add(PlayerPnl);

		EnemyPnl = new JPanel[5];
		for (int i = 0; i < 5; i++) {
			EnemyPnl[i] = new JPanel();
			EnemyPnl[i].setLayout(new BorderLayout());
			EnemyPnl[i].setBounds((int)(500+(180*0.7*i)), (int)(240+Math.pow(-1, i + 1)*100), 180, 200);
			EnemyPnl[i].setOpaque(true);
			EnemyPnl[i].setBackground(new Color(100, 50 * i, 0));
			EnemyPnl[i].setForeground(Color.white);
			add(EnemyPnl[i]);
		}
		
		SkillsPnl = new JPanel();
		SkillsPnl.setBounds(0, 580, 1272, 100);
		SkillsPnl.setLayout(new GridLayout(1,9));
		SkillsPnl.setOpaque(true);
		SkillsPnl.setBackground(Color.GRAY);
		SkillsPnl.setForeground(Color.white);
		add(SkillsPnl);

		SkillsLbl = new JLabel[9];
		for(int i=0;i<9;i++) {
			SkillsLbl[i] = new JLabel("SkillsLbl"+i);
			SkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
			SkillsLbl[i].setOpaque(true);
			SkillsLbl[i].setBackground(new Color(100, 20 * i, 0));
			SkillsLbl[i].setForeground(Color.white);
			SkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			SkillsPnl.add(SkillsLbl[i]);
		}

		
		
		ItemsPnl = new JPanel();
		ItemsPnl.setBounds(0, 0, 1280, 100);
		ItemsPnl.setLayout(null);
		ItemsPnl.setOpaque(true);
		ItemsPnl.setBackground(Color.GRAY);
		ItemsPnl.setForeground(Color.white);
		add(ItemsPnl);

		ItemTitleLbl = new JLabel("Items List");
		ItemTitleLbl.setBounds(150, 0, 150, 100);
		ItemTitleLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
		ItemTitleLbl.setOpaque(true);
		ItemTitleLbl.setBackground(new Color(250, 150, 100));
		ItemTitleLbl.setForeground(Color.white);
		ItemTitleLbl.setHorizontalAlignment(JLabel.CENTER);
		ItemsPnl.add(ItemTitleLbl);

		ItemsLbl = new JLabel[6];
		for(int i =0; i<6;i++) {
			ItemsLbl[i] = new JLabel("SkillsLbl"+i);
			ItemsLbl[i].setBounds(300+100*i, 0, 100, 100);
			ItemsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
			ItemsLbl[i].setOpaque(true);
			ItemsLbl[i].setBackground(new Color(100, 50 * i, 0));
			ItemsLbl[i].setForeground(Color.white);
			ItemsLbl[i].setHorizontalAlignment(JLabel.CENTER);
			ItemsPnl.add(ItemsLbl[i]);
		}


		NameLbl = new JLabel[6];
		for(int i=0 ; i<6 ; i++ ) {
			NameLbl[i] = new JLabel("NameLbl"+i);
			NameLbl[i].setBounds(300+100*i, 0, 100, 100);
			NameLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
			NameLbl[i].setOpaque(true);
			NameLbl[i].setBackground(new Color(100, 50 * i, 0));
			NameLbl[i].setForeground(Color.white);
			NameLbl[i].setHorizontalAlignment(JLabel.CENTER);
			if(i==0)
				PlayerPnl.add(NameLbl[i], BorderLayout.NORTH);
			else
				EnemyPnl[i-1].add(NameLbl[i], BorderLayout.NORTH);
		}
		// PlayerPnl
		// EnemyPnl

		CharacterPortraitLbl = new JLabel[6];
		for(int i=0 ; i < 6 ; i++ ) {
			CharacterPortraitLbl[i] = new JLabel("CharacterPortraitLbl"+i);
			
			CharacterPortraitLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
			CharacterPortraitLbl[i].setOpaque(true);
			CharacterPortraitLbl[i].setBackground(new Color(100, 50 * i, 0));
			CharacterPortraitLbl[i].setForeground(Color.white);
			CharacterPortraitLbl[i].setHorizontalAlignment(JLabel.CENTER);
			if(i==0)
			{
				CharacterPortraitLbl[i].setSize(200,180);
				PlayerPnl.add(CharacterPortraitLbl[i], BorderLayout.CENTER);
			}
			else{
				CharacterPortraitLbl[i].setSize(180,100);
				EnemyPnl[i-1].add(CharacterPortraitLbl[i], BorderLayout.CENTER);
			}
		}

		BottomPnl = new JPanel[6];
		for(int i=0 ; i < 6 ; i++ ) {
			BottomPnl[i] = new JPanel();
			
			BottomPnl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
			BottomPnl[i].setOpaque(true);
			BottomPnl[i].setBackground(new Color(100, 50 * i, 0));
			BottomPnl[i].setForeground(Color.white);
			if(i==0)
			{
				BottomPnl[i].setLayout(new GridLayout(3,1));
				PlayerPnl.add(BottomPnl[i], BorderLayout.SOUTH);
			}
			else
			{
				BottomPnl[i].setLayout(new GridLayout(2,1));
				EnemyPnl[i-1].add(BottomPnl[i], BorderLayout.SOUTH);
			}
		}

		HPPnl = new JPanel[6];
		for(int i=0 ; i < 6 ; i++ ) {
			HPPnl[i] = new JPanel();
			HPPnl[i].setLayout(new GridLayout(1,2));
			HPPnl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20));
			HPPnl[i].setOpaque(true);
			HPPnl[i].setBackground(new Color(100, 50 * i, 0));
			HPPnl[i].setForeground(Color.white);
			BottomPnl[i].add(HPPnl[i]);

		}

		HPLbl = new JLabel[6];
		MaxHPLbl = new JLabel[6];
		for(int i=0 ; i < 6 ; i++ ) {
			HPLbl[i] = new JLabel("HPLbl"+i);
			HPLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			HPLbl[i].setOpaque(true);
			HPLbl[i].setBackground(new Color(100, 50 * i, 0));
			HPLbl[i].setForeground(Color.white);
			HPPnl[i].add(HPLbl[i]);

			MaxHPLbl[i] = new JLabel(" / MaxHPLbl"+i);
			MaxHPLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			MaxHPLbl[i].setOpaque(true);
			MaxHPLbl[i].setBackground(new Color(100, 50 * i, 0));
			MaxHPLbl[i].setForeground(Color.white);
			HPPnl[i].add(MaxHPLbl[i]);

		}

	
		// JLabel StaminaLbl;
		StaminaLbl = new JLabel("StaminaLbl");
		StaminaLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
		StaminaLbl.setOpaque(true);
		StaminaLbl.setBackground(new Color(100, 142, 0));
		StaminaLbl.setForeground(Color.white);
		BottomPnl[0].add(StaminaLbl);
	
		// JPanel[] debuffPnl;
		debuffPnl = new JPanel[6];
		for(int i=0 ; i < 6 ; i++ ) {
			debuffPnl[i]= new JPanel();
			debuffPnl[i].setLayout(new GridLayout(1,3));
			debuffPnl[i].setOpaque(true);
			debuffPnl[i].setBackground(new Color(100, 24 * i, 100));
			debuffPnl[i].setForeground(Color.white);
			BottomPnl[i].add(debuffPnl[i]);

		}

		stunLbl = new JLabel[6];
		WeakenLbl = new JLabel[6];
		SlowLbl = new JLabel[6];
		for(int i=0; i<6 ; i++ ) {

			stunLbl[i]= new JLabel("stunLbl"+i);
			stunLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			stunLbl[i].setOpaque(true);
			stunLbl[i].setBackground(new Color(100, 20 * i, 0));
			stunLbl[i].setForeground(Color.white);
			debuffPnl[i].add(stunLbl[i]);

			WeakenLbl[i] = new JLabel("WeakenLbl"+i);
			WeakenLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			WeakenLbl[i].setOpaque(true);
			WeakenLbl[i].setBackground(new Color(170, 20 * i, 0));
			WeakenLbl[i].setForeground(Color.white);
			debuffPnl[i].add(WeakenLbl[i]);

			SlowLbl[i] = new JLabel("SlowLbl"+i);
			SlowLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			SlowLbl[i].setOpaque(true);
			SlowLbl[i].setBackground(new Color(250, 20 * i, 0));
			SlowLbl[i].setForeground(Color.white);
			debuffPnl[i].add(SlowLbl[i]);
		}

		NextActionLbl = new JLabel[5];
		for(int i=0 ; i<5 ; i++ ) {
			NextActionLbl[i] = new JLabel("NextActionLbl"+i);
			NextActionLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
			NextActionLbl[i].setOpaque(true);
			NextActionLbl[i].setBackground(new Color(170, 20 * i, 0));
			NextActionLbl[i].setForeground(Color.white);
			EnemyPnl[i].add(NextActionLbl[i],BorderLayout.NORTH);
		}

	}
}
