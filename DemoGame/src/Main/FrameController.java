package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Frame.*;

public class FrameController extends JFrame {
	private DataController data;

	private JPanel MainPanel;

	private BattlePanel battlePanel;
	private CharacterPanel characterPanel;
	private CharacterSelectPanel characterselectPanel;
	private MapPanel mapPanel;
	private SaveAndLoadPanel saveandloadPanel;
	private StartPanel startPanel;
	private StatsPanel statsPanel;

	public FrameController() {
		initFrameController();
	}

	private void initFrameController() {
		data = new DataController();

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);
		setResizable(false);

		MainPanel = new JPanel();

		battlePanel = new BattlePanel();
		characterPanel = new CharacterPanel();
		characterselectPanel = new CharacterSelectPanel();
		mapPanel = new MapPanel();
		saveandloadPanel = new SaveAndLoadPanel();
		startPanel = new StartPanel();
		statsPanel = new StatsPanel();

		AddListenersToBattlePanel();
		AddListenersToCharacterPanel();
		AddListenersToCharacterSelectPanel();
		AddListenersToMapPanel();
		AddListenersToSaveAndLoadPanel();
		AddListenersToStartPanel();
		AddListenersToStatsPanel();

	}

	public void Start() {
		// setToCharacterSelectPanel();
		setToStartPanel();
		// setToBattlePanel();
		// setToCharacterPanel();
		// setToMapPanel();
		// setToStatsPanel();

	}

	///////////////////////////////////////////////////////////////////////////////////////

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

	public void setToCharacterSelectPanel() {
		setTitle("CharacterSelectPanel");

		MainPanel = characterselectPanel;

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

	public void setToSaveAndLoadPanel() {
		setTitle("Save and Load");

		MainPanel = saveandloadPanel;

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
	////////////////////////////////////////////////////////////////////////////////////////////

	////////////// BattlePanel/////////////////////////////////////////////////////////////
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

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

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

	////////// CharacterPanel///////////////////////////////////////////////////////

	public void AddListenersToCharacterPanel() {

		characterPanel.getExpeditionPnl().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				characterPanel.setVisible(false);
				setToStatsPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				characterPanel.getExpeditionPnl().setBackground(Color.BLUE);
				characterPanel.getExpeditionPnl().setBackground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				characterPanel.getExpeditionPnl().setBackground(Color.GRAY);
				characterPanel.getExpeditionPnl().setBackground(Color.YELLOW);

			}
		});

		characterPanel.getDefencePnl().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				characterPanel.setVisible(false);
				setToStatsPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				characterPanel.getDefencePnl().setBackground(Color.BLUE);
				characterPanel.getDefencePnl().setBackground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				characterPanel.getDefencePnl().setBackground(Color.GRAY);
				characterPanel.getDefencePnl().setBackground(Color.YELLOW);

			}
		});
	}

	////////// CharacterSelectPanel/////////////////////////////////////////////

	public void AddListenersToCharacterSelectPanel() {

		// backLabel
		characterselectPanel.getBackLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				characterselectPanel.setVisible(false);
				setToStartPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				characterselectPanel.getBackLabel().setBackground(Color.YELLOW);
				characterselectPanel.getBackLabel().setForeground(Color.black);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				characterselectPanel.getBackLabel().setBackground(Color.BLUE);
				characterselectPanel.getBackLabel().setForeground(Color.white);
			}
		});

		// CharacterNameLbl
		// CharacterPortrait
		for (int i = 0; i < 12; i++) {
			JLabel NameLbl = characterselectPanel.getCharacterNameLbl(i);
			JLabel PortraitLbl = characterselectPanel.getCharacterPortraitLbl(i);

			NameLbl.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
				}

				@Override
				public void mousePressed(MouseEvent e) {
					JLabel tmp = (JLabel) e.getSource();
					try {
						// 둘 다 false
						if (!data.getcharacterData().getSelectExpeditionCharacter()
								&& !data.getcharacterData().getSelectDefenceCharacter()) {
							characterselectPanel.getTitleLabel().setText("Choose Defence Character");
							data.getcharacterData().ChangeExpeditionCharacterSelected();
							data.getcharacterData()
									.setExpeditionCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
						} else if (data.getcharacterData().getSelectExpeditionCharacter()
								&& !data.getcharacterData().getSelectDefenceCharacter()
								&& !data.getcharacterData().getExpeditionCharacter().getName().equals(tmp.getText())) {
							characterselectPanel.getTitleLabel().setText("Done");
							data.getcharacterData().ChangeDefenceCharacterSelected();
							data.getcharacterData()
									.setDefenceCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
						} else {
							characterselectPanel.getTitleLabel().setText("Choose Expedition Character");
							data.getcharacterData().ChangeFalse();
						}
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}
				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					NameLbl.setBackground(Color.gray);
					NameLbl.setForeground(Color.yellow);

					PortraitLbl.setBackground(Color.gray);
					PortraitLbl.setForeground(Color.yellow);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					NameLbl.setBackground(Color.GREEN);
					NameLbl.setForeground(Color.white);

					PortraitLbl.setBackground(Color.GREEN);
					PortraitLbl.setForeground(Color.white);
				}
			});

			PortraitLbl.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {

				}

				@Override
				public void mousePressed(MouseEvent e) {
					JLabel tmp = (JLabel) e.getSource();
					try {
						// 둘 다 false
						if (!data.getcharacterData().getSelectExpeditionCharacter()
								&& !data.getcharacterData().getSelectDefenceCharacter()) {
							characterselectPanel.getTitleLabel().setText("Choose Defence Character");
							data.getcharacterData().ChangeExpeditionCharacterSelected();
							data.getcharacterData()
									.setExpeditionCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
						} else if (data.getcharacterData().getSelectExpeditionCharacter()
								&& !data.getcharacterData().getSelectDefenceCharacter()
								&& !data.getcharacterData().getExpeditionCharacter().getName().equals(tmp.getText())) {
							characterselectPanel.getTitleLabel().setText("Done");
							data.getcharacterData().ChangeDefenceCharacterSelected();
							data.getcharacterData()
									.setDefenceCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
						} else {
							characterselectPanel.getTitleLabel().setText("Choose Expedition Character");
							data.getcharacterData().ChangeFalse();
						}
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}

				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					NameLbl.setBackground(Color.gray);
					NameLbl.setForeground(Color.yellow);

					PortraitLbl.setBackground(Color.gray);
					PortraitLbl.setForeground(Color.yellow);

				}

				@Override
				public void mouseExited(MouseEvent e) {
					NameLbl.setBackground(Color.GREEN);
					NameLbl.setForeground(Color.white);

					PortraitLbl.setBackground(Color.GREEN);
					PortraitLbl.setForeground(Color.white);
				}
			});

		}
		characterselectPanel.getTitleLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				if (characterselectPanel.getTitleLabel().getText().equals("Done")) {
					characterselectPanel.setVisible(false);
					setToMapPanel();
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				if (characterselectPanel.getTitleLabel().getText().equals("Done")) {
					characterselectPanel.getTitleLabel().setBackground(Color.BLUE);
					characterselectPanel.getTitleLabel().setForeground(Color.white);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (characterselectPanel.getTitleLabel().getText().equals("Done")) {
					characterselectPanel.getTitleLabel().setBackground(Color.RED);
					characterselectPanel.getTitleLabel().setForeground(Color.white);
				}

			}
		});

	}

	////////// MapPanel//////////////////////////////////////////////////////

	public void AddListenersToMapPanel() {
		mapPanel.getcharacterLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				mapPanel.setVisible(false);
				characterPanel.getExpeditionCharacterLbl()
						.setText(data.getcharacterData().getExpeditionCharacter().getName());
				characterPanel.getDefenceCharacterLbl()
						.setText(data.getcharacterData().getDefenceCharacter().getName());
				setToCharacterPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

				mapPanel.getcharacterLabel().setBackground(Color.BLUE);
				mapPanel.getcharacterLabel().setBackground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				mapPanel.getcharacterLabel().setBackground(Color.GRAY);
				mapPanel.getcharacterLabel().setBackground(Color.black);

			}
		});

		for (int i = 0; i < 11; i++) {
			// Map1Label//////////////////////////////////////////////////////////////////////
			if (mapPanel.getToMap1Label().length > i) {
				mapPanel.getToMap1Label(i).addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
					}

					@Override
					public void mousePressed(MouseEvent e) {
					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(153, 51, 153)); // 배경색
						tmp.setForeground(Color.black); // 글씨색
					}

					@Override
					public void mouseExited(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(051, 153, 051)); // 배경색
						tmp.setForeground(Color.white); // 글씨색
					}
				});
			}
			// Map2Label//////////////////////////////////////////////////////////////////////
			if (mapPanel.getToMap2Label().length > i) {
				mapPanel.getToMap2Label(i).addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
					}

					@Override
					public void mousePressed(MouseEvent e) {
					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(204, 102, 51)); // 배경색
						tmp.setForeground(Color.black); // 글씨색
					}

					@Override
					public void mouseExited(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(102, 051, 204)); // 배경색
						tmp.setForeground(Color.white); // 글씨색
					}
				});
			}
			// Map3Label//////////////////////////////////////////////////////////////////////
			if (mapPanel.getToMap3Label().length > i) {
				mapPanel.getToMap3Label(i).addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
					}

					@Override
					public void mousePressed(MouseEvent e) {
					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(204, 51, 51)); // 배경색
						tmp.setForeground(Color.black); // 글씨색
					}

					@Override
					public void mouseExited(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(051, 051, 204)); // 배경색
						tmp.setForeground(Color.white); // 글씨색
					}
				});
			}
			// Map4Label//////////////////////////////////////////////////////////////////////
			if (mapPanel.getToMap4Label().length > i) {
				mapPanel.getToMap4Label(i).addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
					}

					@Override
					public void mousePressed(MouseEvent e) {
					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(0, 255, 0)); // 배경색
						tmp.setForeground(Color.black); // 글씨색
					}

					@Override
					public void mouseExited(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(255, 00, 255)); // 배경색
						tmp.setForeground(Color.white); // 글씨색
					}
				});
			}
			// Map5Label//////////////////////////////////////////////////////////////////////
			if (mapPanel.getToMap5Label().length > i) {
				mapPanel.getToMap5Label(i).addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
					}

					@Override
					public void mousePressed(MouseEvent e) {
					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(0, 153, 255)); // 배경색
						tmp.setForeground(Color.black); // 글씨색
					}

					@Override
					public void mouseExited(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(255, 153, 000)); // 배경색
						tmp.setForeground(Color.white); // 글씨색
					}
				});
			}
			// Map6Label//////////////////////////////////////////////////////////////////////
			if (mapPanel.getToMap6Label().length > i) {
				mapPanel.getToMap6Label(i).addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
					}

					@Override
					public void mousePressed(MouseEvent e) {
					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(150, 150, 150)); // 배경색
						tmp.setForeground(Color.black); // 글씨색
					}

					@Override
					public void mouseExited(MouseEvent e) {
						JLabel tmp = (JLabel) e.getSource();
						tmp.setBackground(new Color(105, 105, 105)); // 배경색
						tmp.setForeground(Color.white); // 글씨색
					}
				});
			}
		}

	}

	////////// SaveAndLoadPanel////////////////////////////////////////////////////

	public void AddListenersToSaveAndLoadPanel() {
		for (int i = 0; i < 3; i++) {
			JPanel slot = saveandloadPanel.getSlot(i);
			slot.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {

				}

				@Override
				public void mousePressed(MouseEvent e) {

				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					slot.setBackground(Color.white);
					slot.setForeground(Color.black);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					slot.setBackground(Color.gray);
					slot.setForeground(Color.white);
				}
			});
		}

		saveandloadPanel.getBackToStart().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				saveandloadPanel.setVisible(false);
				setToStartPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				saveandloadPanel.getBackToStart().setForeground(Color.black);
				saveandloadPanel.getBackToStart().setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				saveandloadPanel.getBackToStart().setForeground(Color.white);
				saveandloadPanel.getBackToStart().setBackground(Color.gray);
			}
		});
	}

	////////// StartPanel/////////////////////////////////////////////////////////////

	public void AddListenersToStartPanel() {
		startPanel.getNewGameLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				startPanel.setVisible(false);
				CharacterSelectPanel.setDataForCharacterList(data);
				setToCharacterSelectPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

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
		startPanel.getContinueLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				startPanel.setVisible(false);
				setToSaveAndLoadPanel();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				startPanel.getContinueLabel().setForeground(Color.black);
				startPanel.getContinueLabel().setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startPanel.getContinueLabel().setForeground(Color.white);
				startPanel.getContinueLabel().setBackground(Color.gray);
			}

		});
		startPanel.getEndGameLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				startPanel.setVisible(false);
				dispose();
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				startPanel.getEndGameLabel().setForeground(Color.black);
				startPanel.getEndGameLabel().setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startPanel.getEndGameLabel().setForeground(Color.white);
				startPanel.getEndGameLabel().setBackground(Color.gray);
			}

		});
	}

	////////// StatsPanel/////////////////////////////////////////////////////////////

	public void AddListenersToStatsPanel() {

		statsPanel.getBackToMapBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				statsPanel.setVisible(false);
				setToMapPanel();
			}

		});
	}

}
