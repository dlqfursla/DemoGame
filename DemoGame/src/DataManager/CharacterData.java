package DataManager;

import java.util.ArrayList;

import Data.Character;

public class CharacterData {
	private Character Song;
	private Character Park;
	private Character Choi;
	private Character Jung;

	private ArrayList<Character> CharacterList;

	private boolean SelectExpeditionCharacter = false;
	private boolean SelectDefenceCharacter = false;
	private Character ExpeditionCharacter;
	private Character DefenceCharacter;

	public CharacterData() {
		ExpeditionCharacter = new Character();
		DefenceCharacter = new Character();
		CreateCharacters();

		CharacterList =  new ArrayList<Character>(); 

		addCharactersInList();
	}

	private void CreateCharacters() {
		Song = new Character("Song", 100, 150, 30, 20, 30, 40, 50);
		Park = new Character("Park", 200, 150, 40, 30, 50, 60, 70);
		Choi = new Character("Choi", 300, 50, 20, 10, 10, 30, 30);
		Jung = new Character("Jung", 500, 200, 10, 5, 80, 60, 50);
	}

	private void addCharactersInList() {	
		CharacterList.add(Song);
		CharacterList.add(Park);
		CharacterList.add(Choi);
		CharacterList.add(Jung);
	}
	public ArrayList<Character> getCharacterList() {
		return CharacterList;
	}
	public Character getExpeditionCharacter() {
		return ExpeditionCharacter;
	}
	public Character getDefenceCharacter() {
		return DefenceCharacter;
	}
	public boolean getSelectExpeditionCharacter() {
		return SelectExpeditionCharacter;
	}
	public boolean getSelectDefenceCharacter() {
		return SelectDefenceCharacter;
	}
	

	public void setExpeditionCharacter(Character character) {
		if(!SelectExpeditionCharacter || !character.getName().equals(ExpeditionCharacter.getName()))
			ExpeditionCharacter = character;
	}

	public void setDefenceCharacter(Character character) {
		if(!SelectDefenceCharacter || !character.getName().equals(DefenceCharacter.getName()))
			DefenceCharacter = character;
	}

	public void changeEnDCharacter() throws CloneNotSupportedException{
		Character tmp = ExpeditionCharacter.copy();
		ExpeditionCharacter = DefenceCharacter.copy();
		DefenceCharacter = tmp.copy();
	}

	public Character getThisCharacter(String name) throws CloneNotSupportedException {
		Character tmp = new Character();
		for(Character item : CharacterList) {
			if(item.getName().equals(name)) {
				tmp = item.copy();
				break;
			}
		}
		return tmp;
	}
	public void ChangeExpeditionCharacterSelected() {
		SelectExpeditionCharacter = !SelectExpeditionCharacter;
	}
	public void ChangeDefenceCharacterSelected() {
		SelectDefenceCharacter = !SelectDefenceCharacter;
	}
	public void ChangeFalse() {
		SelectExpeditionCharacter = false;
		SelectDefenceCharacter = false;
	}


	// public Character getSong() {
	// 	return Song;
	// }
	
	// public Character getPark() {
	// 	return Park;
	// }

	// public Character getChoi() {
	// 	return Choi;
	// }

	// public Character getJung() {
	// 	return Jung;
	// }

}
