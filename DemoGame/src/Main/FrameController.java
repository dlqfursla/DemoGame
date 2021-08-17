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
		//setToCharacterSelectPanel();
		setToStartPanel();
		//setToBattlePanel();
		//setToCharacterPanel();
		//setToMapPanel();
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



//////////////BattlePanel/////////////////////////////////////////////////////////////
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

	//////////CharacterPanel///////////////////////////////////////////////////////

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
	
	//////////CharacterSelectPanel/////////////////////////////////////////////

	public void AddListenersToCharacterSelectPanel() {

		//backLabel
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
			}});


		//CharacterNameLbl
		//CharacterPortrait
		for(int i=0; i<12; i++){
			JLabel NameLbl = characterselectPanel.getCharacterNameLbl(i);
			JLabel PortraitLbl = characterselectPanel.getCharacterPortraitLbl(i);

			NameLbl.addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent e) {
				}

				@Override
				public void mousePressed(MouseEvent e) {
					JLabel tmp = (JLabel) e.getSource();
					try {
						//둘 다 false
						if(!data.getcharacterData().getSelectExpeditionCharacter() && !data.getcharacterData().getSelectDefenceCharacter()) {
							characterselectPanel.getTitleLabel().setText("Choose Defence Character");
							data.getcharacterData().ChangeExpeditionCharacterSelected();
							data.getcharacterData().setExpeditionCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
						}
						else if(data.getcharacterData().getSelectExpeditionCharacter() && !data.getcharacterData().getSelectDefenceCharacter() && !data.getcharacterData().getExpeditionCharacter().getName().equals(tmp.getText())) {
							characterselectPanel.getTitleLabel().setText("Done");
							data.getcharacterData().ChangeDefenceCharacterSelected();
							data.getcharacterData().setDefenceCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
						}
						else {
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
				}});

				PortraitLbl.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
							JLabel tmp = (JLabel) e.getSource();
							try {
								//둘 다 false
								if(!data.getcharacterData().getSelectExpeditionCharacter() && !data.getcharacterData().getSelectDefenceCharacter()) {
									characterselectPanel.getTitleLabel().setText("Choose Defence Character");
									data.getcharacterData().ChangeExpeditionCharacterSelected();
									data.getcharacterData().setExpeditionCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
								}
								else if(data.getcharacterData().getSelectExpeditionCharacter() && !data.getcharacterData().getSelectDefenceCharacter() && !data.getcharacterData().getExpeditionCharacter().getName().equals(tmp.getText())) {
									characterselectPanel.getTitleLabel().setText("Done");
									data.getcharacterData().ChangeDefenceCharacterSelected();
									data.getcharacterData().setDefenceCharacter(data.getcharacterData().getThisCharacter(tmp.getText()));
								}
								else {
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
					}});
		
		}
		characterselectPanel.getTitleLabel().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(characterselectPanel.getTitleLabel().getText().equals("Done"))
				{
					characterselectPanel.setVisible(false);
					setToMapPanel();
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				if(characterselectPanel.getTitleLabel().getText().equals("Done"))
				{
					characterselectPanel.getTitleLabel().setBackground(Color.BLUE);
					characterselectPanel.getTitleLabel().setForeground(Color.white);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if(characterselectPanel.getTitleLabel().getText().equals("Done"))
				{
					characterselectPanel.getTitleLabel().setBackground(Color.RED);
					characterselectPanel.getTitleLabel().setForeground(Color.white);
				}
				
			}});
		
	}

	//////////MapPanel//////////////////////////////////////////////////////


	public void AddListenersToMapPanel() {

		

	}

	//////////SaveAndLoadPanel////////////////////////////////////////////////////

	public void AddListenersToSaveAndLoadPanel() { 
		for(int i =0; i<3; i++){
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
			}}); 
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

	//////////StartPanel/////////////////////////////////////////////////////////////
	
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

	//////////StatsPanel/////////////////////////////////////////////////////////////

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

