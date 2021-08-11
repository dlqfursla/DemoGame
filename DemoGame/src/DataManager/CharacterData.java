package DataManager;

import Data.Character;
public class CharacterData {
	Character Song;
	Character Park;

	public CharacterData() {
		Song = new Character("Song", 100, 150, 20, 30, 30, 40, 50);
		Park = new Character("Park", 200, 150, 30, 40, 50, 60, 70);
	}

	public Character getSong() {
		return Song;
	}
	
	public Character getPark() {
		return Park;
	}
}
