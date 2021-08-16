package DataManager;

import java.util.ArrayList;

import Data.Character;

public class CharacterData {
	private Character Song;
	private Character Park;
	private Character Choi;
	private Character Jung;

	ArrayList<Character> CharacterList;

	public CharacterData() {
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
