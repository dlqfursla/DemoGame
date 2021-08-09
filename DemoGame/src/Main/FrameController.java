package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Frame.*;

@SuppressWarnings("serial")
public class FrameController extends JFrame {
	DataController data;

	JPanel MainPanel;

	BattlePanel battlePanel;
	CharacterPanel characterPanel;
	MapPanel mapPanel;
	StartPanel startPanel;
	StatsPanel statsPanel;

	public FrameController() {

		init();
	}

	private void init() {
		data = new DataController();

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);
		setResizable(false);
		
		MainPanel = new JPanel();

		battlePanel = new BattlePanel();
		characterPanel = new CharacterPanel();
		mapPanel = new MapPanel();
		startPanel = new StartPanel();
		statsPanel = new StatsPanel();

		AddListenersToBattlePanel();
		AddListenersToCharacterPanel();
		AddListenersToMapPanel();
		AddListenersToStartPanel();
		AddListenersToStatsPanel();

	}

	public void Start() {
		System.out.println("Start");
		setToStartPanel();
	}

	public void setToBattlePanel() {
		setTitle("Battle");

		MainPanel = battlePanel;

		MainPanel.setVisible(false);

		add(MainPanel);

		MainPanel.setVisible(true);
	}

	public void setToCharacterPanel() {
		setTitle("Character");

		MainPanel = characterPanel;

		MainPanel.setVisible(false);

		add(MainPanel);

		MainPanel.setVisible(true);
	}

	public void setToMapPanel() {
		setTitle("Map");

		MainPanel = mapPanel;

		MainPanel.setVisible(false);

		add(MainPanel);

		MainPanel.setVisible(true);
	}

	public void setToStartPanel() {
		setTitle("Start");

		MainPanel = startPanel;

		MainPanel.setVisible(false);

		add(MainPanel);

		MainPanel.setVisible(true);
	}

	public void setToStatsPanel() {
		setTitle("Stats");

		MainPanel = statsPanel;

		MainPanel.setVisible(false);

		add(MainPanel);

		MainPanel.setVisible(true);
	}

////////////////////////////////////////////////////////////////////////////
	public void AddListenersToBattlePanel() {
		battlePanel.getBackToMapBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				battlePanel.setVisible(false);
				setToMapPanel();
			}

		});

		battlePanel.getSettingsLbl().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				battlePanel.getSettingsLbl().setForeground(Color.black);
				battlePanel.getSettingsLbl().setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				battlePanel.getSettingsLbl().setForeground(Color.white);
				battlePanel.getSettingsLbl().setBackground(Color.gray);
			}
		});
	}

	public void AddListenersToCharacterPanel() {
		characterPanel.getBackToMapBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				characterPanel.setVisible(false);
				setToMapPanel();
			}

		});
		characterPanel.getToBattleBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				characterPanel.setVisible(false);
				setToBattlePanel();
			}

		});
	}

	public void AddListenersToMapPanel() {

		mapPanel.getToCharacterBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mapPanel.setVisible(false);
				setToCharacterPanel();
			}

		});
		mapPanel.getToStartBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mapPanel.setVisible(false);
				setToStartPanel();
			}

		});
		mapPanel.getToStatsBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mapPanel.setVisible(false);
				setToStatsPanel();
			}

		});

	}

	public void AddListenersToStartPanel() {
		startPanel.getNewGameLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				startPanel.setVisible(false);
				setToMapPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				startPanel.getNewGameLabel().setForeground(Color.black);
				startPanel.getNewGameLabel().setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startPanel.getNewGameLabel().setForeground(Color.white);
				startPanel.getNewGameLabel().setBackground(Color.gray);
			}

		});
	}

	public void AddListenersToStatsPanel() {
		statsPanel.getChangeStatsBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				statsPanel.setStats(5);
			}

		});
		statsPanel.getBackToMapBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				statsPanel.setVisible(false);
				setToMapPanel();
			}

		});
	}
}
