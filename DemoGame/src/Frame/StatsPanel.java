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
   private JLabel CharacterLbl;

   private JPanel SkillsPnl;
   private JLabel[] SkillsLbl;

   private JPanel StatsPnl;
   private JLabel[] StatsNameLbl;
   private JLabel[] StatsNumLbl;
   private JLabel[] StatsUpLbl;
   private JLabel[][] StatsAllLbl; 

   String[] StatsName = { "HP", "Stamina", "MaxAtk", "MinAtk", "Intelligence", "Def", "regeneration", "" };


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

      CharacterLbl = new JLabel("CharacterLbl");
      CharacterLbl.setBounds(20, 20, 285, 240);
      CharacterLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
      CharacterLbl.setOpaque(true);
      CharacterLbl.setHorizontalAlignment(JLabel.CENTER);
      CharacterLbl.setBackground(Color.GRAY);
      CharacterLbl.setForeground(Color.white);
      ExpeditionPnl.add(CharacterLbl);

      SkillsPnl = new JPanel();
      SkillsPnl.setLayout(new GridLayout(2,4));
      SkillsPnl.setBounds(315, 20, 880, 240);
      SkillsPnl.setOpaque(true);
      SkillsPnl.setBackground(Color.GREEN);
      SkillsPnl.setForeground(Color.white);
      ExpeditionPnl.add(SkillsPnl);
      
      SkillsLbl = new JLabel[8];
      for (int i = 0; i < 8; i++) {
         SkillsLbl[i] = new JLabel("SkillsLbl"+i);
         SkillsLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 8));
         SkillsLbl[i].setOpaque(true);
         SkillsLbl[i].setHorizontalAlignment(JLabel.CENTER);
         SkillsLbl[i].setBackground(new Color(20*i,30*i,25*i));
         SkillsLbl[i].setForeground(Color.white);
         SkillsPnl.add(SkillsLbl[i]);
      }
      
      StatsPnl = new JPanel();
      StatsPnl.setLayout(new GridLayout(8,1));
      StatsPnl.setBounds(20, 270, 400, 368);
      StatsPnl.setOpaque(false);
      StatsPnl.setBackground(Color.GRAY);
      StatsPnl.setForeground(Color.white);
      ExpeditionPnl.add(StatsPnl);
      
      StatsNameLbl = new JLabel[7];
      for (int i = 0; i < 7; i++) {
         StatsNameLbl[i] = new JLabel(StatsName[i]);
         StatsNameLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
         StatsNameLbl[i].setOpaque(false);
         StatsNameLbl[i].setHorizontalAlignment(JLabel.CENTER);
         StatsNameLbl[i].setBackground(new Color(5*i,27*i,18*i));
         StatsNameLbl[i].setForeground(Color.white);
         StatsPnl.add(StatsNameLbl[i]);

      }

      StatsNumLbl = new JLabel[7];
      for (int i = 0; i < 7; i++) {

         StatsNumLbl[i] = new JLabel("123");
         StatsNumLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
         StatsNumLbl[i].setOpaque(false);
         StatsNumLbl[i].setHorizontalAlignment(JLabel.CENTER);
         StatsNumLbl[i].setBackground(new Color(5*i,27*i,18*i));
         StatsNumLbl[i].setForeground(Color.white);
         StatsPnl.add(StatsNumLbl[i]);

      }

      StatsUpLbl = new JLabel[7];
      for (int i = 0; i < 7; i++) {

         StatsUpLbl[i] = new JLabel("▲");
         StatsUpLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
         StatsUpLbl[i].setOpaque(false);
         StatsUpLbl[i].setHorizontalAlignment(JLabel.CENTER);
         StatsUpLbl[i].setBackground(new Color(5*i,27*i,18*i));
         StatsUpLbl[i].setForeground(Color.white);
         StatsPnl.add(StatsUpLbl[i]);
      }

      StatsPnl = new JPanel();
      StatsPnl.setLayout(new GridLayout(8,3));
      StatsPnl.setBounds(20, 270, 400, 368);
      StatsPnl.setOpaque(true);
      StatsPnl.setBackground(Color.GRAY);
      StatsPnl.setForeground(Color.white);
      ExpeditionPnl.add(StatsPnl);


      StatsAllLbl = new JLabel[8][3];
      for (int i = 0 ; i < 7 ; i++ ) {
         for(int j = 0 ; j<3 ; j++ ){
            if(j==0){
               StatsAllLbl[i][j] = StatsNameLbl[i];
            }
            else if(j==1){
               StatsAllLbl[i][j] = StatsNumLbl[i];
            }
            else{
               StatsAllLbl[i][j] = StatsUpLbl[i];
            }
         
         StatsAllLbl[i][j].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
         StatsAllLbl[i][j].setOpaque(true);
         StatsAllLbl[i][j].setHorizontalAlignment(JLabel.CENTER);
         StatsAllLbl[i][j].setBackground(new Color(5*i,27*i,18*i));
         StatsAllLbl[i][j].setForeground(Color.white);
         StatsPnl.add(StatsAllLbl[i][j]);


         }
      }

      StatsAllLbl[7][1] = new JLabel("남은 포인트");
      StatsAllLbl[7][1].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
      StatsAllLbl[7][1].setOpaque(true);
      StatsAllLbl[7][1].setHorizontalAlignment(JLabel.CENTER);
      StatsAllLbl[7][1].setBackground(new Color(5*7,27*7,18*7));
      StatsAllLbl[7][1].setForeground(Color.white);

      StatsAllLbl[7][2] = new JLabel("3");
      StatsAllLbl[7][2].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
      StatsAllLbl[7][2].setOpaque(true);
      StatsAllLbl[7][2].setHorizontalAlignment(JLabel.CENTER);
      StatsAllLbl[7][2].setBackground(new Color(5*7,27*7,18*7));
      StatsAllLbl[7][2].setForeground(Color.white);
         
      StatsPnl.add(StatsAllLbl[7][1]);
      StatsPnl.add(StatsAllLbl[7][2]);

   

   }
}