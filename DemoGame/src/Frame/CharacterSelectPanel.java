package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.DataController;
import Data.Character;

public class CharacterSelectPanel extends BasePanel {
    private JPanel ListPnl;

    private JLabel TitleLbl;
    private JLabel BacktoStartLbl;

    private JPanel[] CharacterPnl;
    private static JLabel[] CharacterNameLbl;
    private static JLabel[] CharacterPortraitLbl;

    public CharacterSelectPanel() {
        super();
		initCharacterSelectPanel();
    }
    private void initCharacterSelectPanel() {
        ListPnl = new JPanel();
        ListPnl.setLayout(null);
		ListPnl.setBounds(153, 20, 960, 650);
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
            CharacterPnl[i].setBounds(25+230*(i%4), 180+150*(i/4), 220, 100);
            CharacterPnl[i].setOpaque(true);
            CharacterPnl[i].setBackground(Color.ORANGE);
            CharacterPnl[i].setForeground(Color.white);
            ListPnl.add(CharacterPnl[i]);
            
            CharacterNameLbl[i] = new JLabel("CharacterNameLbl"+i);
            CharacterNameLbl[i].setSize(110,100);
            CharacterNameLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
            CharacterNameLbl[i].setHorizontalAlignment(JLabel.CENTER);
            CharacterNameLbl[i].setOpaque(true);
            CharacterNameLbl[i].setBackground(Color.GREEN);
            CharacterNameLbl[i].setForeground(Color.white);
            CharacterPnl[i].add(CharacterNameLbl[i]);

            CharacterPortraitLbl[i] = new JLabel("CharacterPortraitLbl"+i);
            CharacterPortraitLbl[i].setSize(110,100);
            CharacterPortraitLbl[i].setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
            CharacterPortraitLbl[i].setHorizontalAlignment(JLabel.CENTER);
            CharacterPortraitLbl[i].setOpaque(true);
            CharacterPortraitLbl[i].setBackground(Color.GREEN);
            CharacterPortraitLbl[i].setForeground(Color.white);
            CharacterPnl[i].add(CharacterPortraitLbl[i]);
        }

        TitleLbl = new JLabel("Choose 2 Characters");
        TitleLbl.setBounds(300,20, 360, 100);
        TitleLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
        TitleLbl.setHorizontalAlignment(JLabel.CENTER);
        TitleLbl.setOpaque(true);
        TitleLbl.setBackground(Color.RED);
        TitleLbl.setForeground(Color.white);
        ListPnl.add(TitleLbl);

        BacktoStartLbl = new JLabel("Back");
        BacktoStartLbl.setBounds(880 ,20, 60, 30);
        BacktoStartLbl.setFont(new Font("Copperplate Gothic", Font.BOLD, 10));
        BacktoStartLbl.setHorizontalAlignment(JLabel.CENTER);
        BacktoStartLbl.setOpaque(true);
        BacktoStartLbl.setBackground(Color.BLUE);
        BacktoStartLbl.setForeground(Color.white);
        ListPnl.add(BacktoStartLbl);

    }

    public JPanel getCharacterPnl(int i) {
        return CharacterPnl[i];
    }

    public JLabel getCharacterNameLbl(int i) {
        return CharacterNameLbl[i];
    }
    public JLabel getCharacterPortraitLbl(int i){
        return CharacterPortraitLbl[i];
    }
    public JLabel getBackLabel() {
        return BacktoStartLbl;
    }
    public static void setDataForCharacterList(DataController data) {
        ArrayList<Character> List = data.getcharacterData().getCharacterList();

        for(int i = 0; i<12; i++) {
            if(i<List.size())
            {
                CharacterNameLbl[i].setText(List.get(i).getName());
                CharacterPortraitLbl[i].setText(List.get(i).getName()+"`s Portrait");
            }
            else
            {
                CharacterNameLbl[i].setText("N/A");
                CharacterPortraitLbl[i].setText("N/A");
            }
        }
    }
}
