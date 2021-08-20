package Main;

import DataManager.*;
import DataManager.CharacterData;

public class DataController {
    private BattleData battleData;
    private CharacterData characterData;
    private MapData mapData;
    private StatsData statsData;

    public DataController() {
        initDataController();
    }

    public void initDataController() {
        battleData = new BattleData();
        characterData = new CharacterData();
        mapData = new MapData();
        statsData = new StatsData();
    }

    public BattleData getBattleData() {
        return battleData;
    }

    public CharacterData getcharacterData() {
        return characterData;
    }

    public MapData getmapData() {
        return mapData;
    }

    public StatsData getstatsData() {
        return statsData;
    }
}
