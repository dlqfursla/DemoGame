package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharacterSelectPanel extends BasePanel {
    JPanel ListPnl;

    JPanel[] CharacterPnl;
    JLabel[] CharacterNameLbl;
    JLabel[] CharacterPortraitLbl;

    public CharacterSelectPanel() {
        super();
		initCharacterSelectPanel();
    }
    private void initCharacterSelectPanel() {
        ListPnl = new JPanel();
        ListPnl.setLayout(null);
		ListPnl.setBounds(50, 50, 960, 560);
		ListPnl.setOpaque(true);
		ListPnl.setBackground(Color.YELLOW);
		ListPnl.setForeground(Color.white);
		add(ListPnl);

        CharacterPnl = new JPanel[12];
        CharacterNameLbl = new JLabel[12];
        CharacterPortraitLbl = new JLabel[12];

        for(int i=0; i<12; i++) {
            CharacterPnl[i] = new JPanel();
            CharacterPnl[i].setLayout(new GridLayout(1,2));
            CharacterPnl[i].setBounds(50+225*i, 30+100*i, 225, 100);
            CharacterPnl[i].setOpaque(true);
            CharacterPnl[i].setBackground(Color.ORANGE);
            CharacterPnl[i].setForeground(Color.white);
            ListPnl.add(CharacterPnl[i]);

            CharacterNameLbl[i] = new JLabel("CharacterNameLbl"+i);
            CharacterNameLbl[i].setSize(100,100);
            CharacterNameLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
            CharacterNameLbl[i].setHorizontalAlignment(JLabel.CENTER);
            CharacterNameLbl[i].setOpaque(true);
            CharacterNameLbl[i].setBackground(Color.GREEN);
            CharacterNameLbl[i].setForeground(Color.white);
            CharacterPnl[i].add(CharacterNameLbl[i]);

            CharacterPortraitLbl[i] = new JLabel("CharacterPortraitLbl"+i);
            CharacterPortraitLbl[i].setSize(100,100);
            CharacterPortraitLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
            CharacterPortraitLbl[i].setHorizontalAlignment(JLabel.CENTER);
            CharacterPortraitLbl[i].setOpaque(true);
            CharacterPortraitLbl[i].setBackground(Color.GREEN);
            CharacterPortraitLbl[i].setForeground(Color.white);
            CharacterPnl[i].add(CharacterPortraitLbl[i]);
        }
    }

}
