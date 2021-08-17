package Frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapPanel extends BasePanel {
   int a= 3;
   int b = 8;
   int c = 2;

   JPanel TopPnl = new JPanel();
   JLabel endLabel = new JLabel("내전까지 앞으로 40턴 남았습니다");

   JLabel characterLabel = new JLabel("Character");


   JPanel BattlePnl = new JPanel();
   JLabel battle1Label = new JLabel("도착까지 1턴 남았습니다");
   JLabel battle2Label = new JLabel("도착까지 3턴 남았습니다");
   JLabel battle3Label = new JLabel("도착까지 4턴 남았습니다");

   JPanel BasePnl;
   JLabel BaseLabel = new JLabel("B");

   JPanel Map1Pnl;
   JLabel[] Map1Label = new JLabel[10];

   JPanel Map2Pnl;
   JLabel[] Map2Label = new JLabel[9];

   JPanel Map3Pnl;
   JLabel[] Map3Label = new JLabel[10];

   JPanel Map4Pnl;
   JLabel[] Map4Label = new JLabel[11];
   
   JPanel Map5Pnl;
   JLabel[] Map5Label = new JLabel[10];

   JPanel Map6Pnl;
   JLabel[] Map6Label = new JLabel[10];

   

   String[] point_num1 = {"3","1","4","1","2","3","2","2","1","1"};
   String[] point_num2 = {"3","2","2","2","2","1","1","1","1"};
   String[] point_num3 = {"1","3","2","2","2","4","1","2","3","1"};
   String[] point_num4 = {"1","1","2","2","3","2","1","4","3","3","2"};
   String[] point_num5 = {"1","1","1","1","2","2","3","3","4","3"};
   String[] point_num6 = {"1","1","1","2","2","2","4","1","2","3"};
   


   public MapPanel() {
      super();
      initMapPanel();
   }

   public JLabel getToendLabel(){
      return endLabel;
   }
   public JLabel getcharacterLabel() {
      return characterLabel;
   }
   public JLabel[] getToMap1Label() {
      return Map1Label;
   }
   public JLabel[] getToMap2Label() {
      return Map1Label;
   }
   public JLabel[] getToMap3Label() {
      return Map3Label;
   }
   public JLabel[] getToMap4Label() {
      return Map4Label;
   }
   public JLabel[] getToMap5Label() {
      return Map5Label;
   }
   public JLabel[] getToMap6Label() {
      return Map6Label;
   }
   
   private void initMapPanel() {

      TopPnl.setLayout(null);
      TopPnl.setBounds(00,0,800,50);
      TopPnl.setBackground(Color.black);
      add(TopPnl);

      characterLabel.setSize(100,30);
      characterLabel.setLocation(0, 0);
      characterLabel.setOpaque(true);
      characterLabel.setHorizontalAlignment(JLabel.CENTER);
      characterLabel.setBackground(Color.GRAY);
      characterLabel.setFont(new Font("Kopub돋움체 bold", Font.BOLD, 20));
      characterLabel.setForeground(Color.black);
      TopPnl.add(characterLabel);

      endLabel.setSize(300,50);
      endLabel.setLocation(400,0);
      endLabel.setOpaque(true);
      endLabel.setHorizontalAlignment(JLabel.CENTER);
      endLabel.setBackground(new Color(250,250,210));
      endLabel.setFont(new Font("Kopub돋움체 bold", Font.BOLD, 20));
      endLabel.setForeground(Color.black);
      TopPnl.add(endLabel);

      BattlePnl.setLayout(null);
      BattlePnl.setBounds(1020,0, 250, 150);
      add(BattlePnl);

      battle1Label.setSize(250,50);
      battle1Label.setLocation(0,0);
      battle1Label.setOpaque(true);
      battle1Label.setHorizontalAlignment(JLabel.CENTER);
      battle1Label.setBackground(new Color(255,153,000));
      battle1Label.setFont(new Font("Kopub돋움체 bold", Font.BOLD, 20));
      battle1Label.setForeground(Color.black);
      BattlePnl.add(battle1Label);

      battle2Label.setSize(250,50);
      battle2Label.setLocation(0,50);
      battle2Label.setOpaque(true);
      battle2Label.setHorizontalAlignment(JLabel.CENTER);
      battle2Label.setBackground(new Color(102,051,204));
      battle2Label.setFont(new Font("Kopub돋움체 bold", Font.BOLD, 20));
      battle2Label.setForeground(Color.black);
      BattlePnl.add(battle2Label);

      battle3Label.setSize(250,50);
      battle3Label.setLocation(0,100);
      battle3Label.setOpaque(true);
      battle3Label.setHorizontalAlignment(JLabel.CENTER);
      battle3Label.setBackground(new Color(105,105,105));
      battle3Label.setFont(new Font("Kopub돋움체 bold", Font.BOLD, 20));
      battle3Label.setForeground(Color.black);
      BattlePnl.add(battle3Label);



      BasePnl = new JPanel();
      BasePnl.setLayout(null);
      BasePnl.setBounds(520, 350, 20, 20);
      add(BasePnl);

      BaseLabel.setSize(20,20);
      BaseLabel.setLocation(0,0);
      BaseLabel.setOpaque(true);
      BaseLabel.setHorizontalAlignment(JLabel.CENTER);
      BaseLabel.setBackground(Color.yellow);
      BaseLabel.setFont(new Font("Kopub돋움체 bold", Font.BOLD, 20));
      BaseLabel.setForeground(Color.black);
      BasePnl.add(BaseLabel);


      Map1Pnl = new JPanel();
      Map1Pnl.setLayout(null);
      Map1Pnl.setBackground(Color.BLACK);
      Map1Pnl.setBounds(40, 40, 250, 250);
      add(Map1Pnl);

      for (int i = 0; i < 10; i++) {
         Map1Label[i] = new JLabel(point_num1[i]);
         Map1Label[i].setSize(20,20);
         Map1Label[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20)); //글씨체
         Map1Label[i].setOpaque(true); // 배경색설정
         Map1Label[i].setHorizontalAlignment(JLabel.CENTER); //가운데정렬
         Map1Label[i].setBackground(new Color(051,153,051)); //배경색
         Map1Label[i].setForeground(Color.white); //글씨색
         Map1Pnl.add(Map1Label[i]);
      }

      Map1Label[0].setLocation(90, 40);
      Map1Label[1].setLocation(160, 60);
      Map1Label[2].setLocation(70, 90);
      Map1Label[3].setLocation(190, 90);
      Map1Label[4].setLocation(120, 120);
      Map1Label[5].setLocation(50, 150);
      Map1Label[6].setLocation(100, 150);
      Map1Label[7].setLocation(160, 170);
      Map1Label[8].setLocation(90, 200);
      Map1Label[9].setLocation(200, 200);



      Map2Pnl = new JPanel();
      Map2Pnl.setLayout(null);
      Map2Pnl.setBackground(Color.BLACK);
      Map2Pnl.setBounds(400, 60, 250, 250);
      add(Map2Pnl);

      for (int i = 0; i < 9; i++) {
         Map2Label[i] = new JLabel(point_num2[i]);
         Map2Label[i].setSize(20,20);
         Map2Label[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20)); //글씨체
         Map2Label[i].setOpaque(true); // 배경색설정
         Map2Label[i].setHorizontalAlignment(JLabel.CENTER); //가운데정렬
         Map2Label[i].setBackground(new Color(102,051,204)); //배경색
         Map2Label[i].setForeground(Color.white); //글씨색
         Map2Pnl.add(Map2Label[i]);
      }

      Map2Label[0].setLocation(90, 20*a-b);
      Map2Label[1].setLocation(140, 20*a-b);
      Map2Label[2].setLocation(50,30*a-b);
      Map2Label[3].setLocation(110, 35*a-b);
      Map2Label[4].setLocation(190, 45*a-b);
      Map2Label[5].setLocation(50, 55*a-b);
      Map2Label[6].setLocation(90, 55*a-b);
      Map2Label[7].setLocation(140, 55*a-b);
      Map2Label[8].setLocation(120, 75*a-b);

      Map3Pnl = new JPanel();
      Map3Pnl.setLayout(null);
      Map3Pnl.setBackground(Color.BLACK);
      Map3Pnl.setBounds(750, 60, 250, 350);
      add(Map3Pnl);
   
      for (int i = 0; i < 10; i++) {
         Map3Label[i] = new JLabel(point_num3[i]);
         Map3Label[i].setSize(20,20);
         Map3Label[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20)); //글씨체
         Map3Label[i].setOpaque(true); // 배경색설정
         Map3Label[i].setHorizontalAlignment(JLabel.CENTER); //가운데정렬
         Map3Label[i].setBackground(new Color(051,051,204)); //배경색
         Map3Label[i].setForeground(Color.white); //글씨색
         Map3Pnl.add(Map3Label[i]);
      }
   
      Map3Label[0].setLocation(35*c,25*a-b);
      Map3Label[1].setLocation(95*c, 25*a-b);
      Map3Label[2].setLocation(60*c,35*a-b);
      Map3Label[3].setLocation(50*c,50*a-b);
      Map3Label[4].setLocation(80*c,50*a-b);
      Map3Label[5].setLocation(110*c,50*a-b);
      Map3Label[6].setLocation(25*c,70*a-b);
      Map3Label[7].setLocation(65*c,75*a-b);
      Map3Label[8].setLocation(100*c,75*a-b);
      Map3Label[9].setLocation(90*c,95*a-b);


      Map4Pnl = new JPanel();
      Map4Pnl.setLayout(null);
      Map4Pnl.setBackground(Color.BLACK);
      Map4Pnl.setBounds(40, 300, 350, 350);
      add(Map4Pnl);
   
      for (int i = 0; i < 11; i++) {
         Map4Label[i] = new JLabel(point_num4[i]);
         Map4Label[i].setSize(20,20);
         Map4Label[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20)); //글씨체
         Map4Label[i].setOpaque(true); // 배경색설정
         Map4Label[i].setHorizontalAlignment(JLabel.CENTER); //가운데정렬
         Map4Label[i].setBackground(new Color(255,00,255)); //배경색
         Map4Label[i].setForeground(Color.white); //글씨색
         Map4Pnl.add(Map4Label[i]);
      }
   
      Map4Label[0].setLocation(55*a,25*a);
      Map4Label[1].setLocation(90*a,35*a);
      Map4Label[2].setLocation(45*a,45*a);
      Map4Label[3].setLocation(80*a,50*a);
      Map4Label[4].setLocation(40*a,65*a);
      Map4Label[5].setLocation(75*a,65*a);
      Map4Label[6].setLocation(95*a,75*a);
      Map4Label[7].setLocation(25*a,80*a);
      Map4Label[8].setLocation(60*a,80*a);
      Map4Label[9].setLocation(40*a,85*a);
      Map4Label[10].setLocation(85*a,95*a);

   Map5Pnl = new JPanel();
   Map5Pnl.setLayout(null);
   Map5Pnl.setBackground(Color.BLACK);
   Map5Pnl.setBounds(400, 350, 350, 350);
   add(Map5Pnl);

   for (int i = 0; i < 10; i++) {
      Map5Label[i] = new JLabel(point_num5[i]);
      Map5Label[i].setSize(20,20);
      Map5Label[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20)); //글씨체
      Map5Label[i].setOpaque(true); // 배경색설정
      Map5Label[i].setHorizontalAlignment(JLabel.CENTER); //가운데정렬
      Map5Label[i].setBackground(new Color(255,153,000)); //배경색
      Map5Label[i].setForeground(Color.white); //글씨색
      Map5Pnl.add(Map5Label[i]);
   }

   Map5Label[0].setLocation(45*a,25*a);
   Map5Label[1].setLocation(65*a,40*a);
   Map5Label[2].setLocation(95*a,50*a);
   Map5Label[3].setLocation(25*a,60*a);
   Map5Label[4].setLocation(75*a,60*a);
   Map5Label[5].setLocation(55*a,65*a);
   Map5Label[6].setLocation(40*a,80*a);
   Map5Label[7].setLocation(75*a,85*a);
   Map5Label[8].setLocation(60*a,95*a);
   Map5Label[9].setLocation(90*a,100*a);


   Map6Pnl = new JPanel();
   Map6Pnl.setLayout(null);
   Map6Pnl.setBackground(Color.BLACK);
   Map6Pnl.setBounds(750, 300, 350, 350);
   add(Map6Pnl);

   for (int i = 0; i < 10; i++) {
      Map6Label[i] = new JLabel(point_num6[i]);
      Map6Label[i].setSize(20,20);
      Map6Label[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 20)); //글씨체
      Map6Label[i].setOpaque(true); // 배경색설정
      Map6Label[i].setHorizontalAlignment(JLabel.CENTER); //가운데정렬
      Map6Label[i].setBackground(new Color(105,105,105)); //배경색
      Map6Label[i].setForeground(Color.white); //글씨색
      Map6Pnl.add(Map6Label[i]);
   }

   Map6Label[0].setLocation(25*a,25*a);
   Map6Label[1].setLocation(55*a,25*a);
   Map6Label[2].setLocation(90*a,30*a);
   Map6Label[3].setLocation(60*a,45*a);
   Map6Label[4].setLocation(85*a,50*a);
   Map6Label[5].setLocation(40*a,55*a);
   Map6Label[6].setLocation(110*a,65*a);
   Map6Label[7].setLocation(25*a,70*a);
   Map6Label[8].setLocation(60*a,75*a);
   Map6Label[9].setLocation(85*a,80*a);

   }

   public void setinitData() {
      
   }
   
}