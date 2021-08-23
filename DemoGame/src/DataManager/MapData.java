package DataManager;

import java.util.ArrayList;

import Data.MapLink;

public class MapData {
	private ArrayList<ArrayList<MapLink>> LabelsMappingList; //데이터 전체 리스트
	private ArrayList<MapLink> map1LabelsMapping; // 왼쪽 위
	private ArrayList<MapLink> map2LabelsMapping; // 위
	private ArrayList<MapLink> map3LabelsMapping; // 오른쪽 위
	private ArrayList<MapLink> map4LabelsMapping; // 왼쪽 아래
	private ArrayList<MapLink> map5LabelsMapping; // 아래
	private ArrayList<MapLink> map6LabelsMapping; // 오른쪽 아래

	public MapData() {
		initMapData();
	}

	public void initMapData() {
		LabelsMappingList = new ArrayList<ArrayList<MapLink>>();

		map1LabelsMapping = new ArrayList<MapLink>();
		map2LabelsMapping = new ArrayList<MapLink>();
		map3LabelsMapping = new ArrayList<MapLink>();
		map4LabelsMapping = new ArrayList<MapLink>();
		map5LabelsMapping = new ArrayList<MapLink>();
		map6LabelsMapping = new ArrayList<MapLink>();

		LabelsMappingList.add(map1LabelsMapping);
		LabelsMappingList.add(map2LabelsMapping);
		LabelsMappingList.add(map3LabelsMapping);
		LabelsMappingList.add(map4LabelsMapping);
		LabelsMappingList.add(map5LabelsMapping);
		LabelsMappingList.add(map6LabelsMapping);

		initmap1LabelsMapping();
		initmap2LabelsMapping();
		initmap3LabelsMapping();
		initmap4LabelsMapping();
		initmap5LabelsMapping();
		initmap6LabelsMapping();

	}

	private void initmap1LabelsMapping() {
		//3 8 9
		map1LabelsMapping.add(new MapLink(0, 3, false, 2));
		map1LabelsMapping.add(new MapLink(1, 1, false, 4));
		map1LabelsMapping.add(new MapLink(2, 4, false, -1)); // 보스방
		map1LabelsMapping.add(new MapLink(3, 1, true, 1));
		map1LabelsMapping.add(new MapLink(4, 2, false, 0));
		map1LabelsMapping.add(new MapLink(5, 3, false, 2));
		map1LabelsMapping.add(new MapLink(6, 2, false, 5));
		map1LabelsMapping.add(new MapLink(7, 2, false, 4));
		map1LabelsMapping.add(new MapLink(8, 1, true, 6));
		map1LabelsMapping.add(new MapLink(9, 1, true, 7));

	}
	private void initmap2LabelsMapping() {
		// 8
		map2LabelsMapping.add(new MapLink(0, 3, false, -1)); // 보스방
		map2LabelsMapping.add(new MapLink(1, 2, false, 0));
		map2LabelsMapping.add(new MapLink(2, 2, false, 0));
		map2LabelsMapping.add(new MapLink(3, 2, false, 0));
		map2LabelsMapping.add(new MapLink(4, 2, false, 1,3));
		map2LabelsMapping.add(new MapLink(5, 1, false, 2));
		map2LabelsMapping.add(new MapLink(6, 1, false, 3));
		map2LabelsMapping.add(new MapLink(7, 1, false, 4));
		map2LabelsMapping.add(new MapLink(9, 1, true, 5,6,7));
	}
	private void initmap3LabelsMapping() {
		//0 6 9
		map3LabelsMapping.add(new MapLink(0, 1, true, 2));
		map3LabelsMapping.add(new MapLink(1, 3, false, 5));
		map3LabelsMapping.add(new MapLink(2, 2, false, 2));
		map3LabelsMapping.add(new MapLink(3, 2, false, 4));
		map3LabelsMapping.add(new MapLink(4, 2, false, 1));
		map3LabelsMapping.add(new MapLink(5, 4, false, -1)); // 보스방
		map3LabelsMapping.add(new MapLink(6, 1, true, 3));
		map3LabelsMapping.add(new MapLink(7, 2, false, 8));
		map3LabelsMapping.add(new MapLink(8, 3, false, 5));
		map3LabelsMapping.add(new MapLink(9, 1, true, 7));
	}
	private void initmap4LabelsMapping() {
		//0 1 6 
		map4LabelsMapping.add(new MapLink(0, 1, true, 2));
		map4LabelsMapping.add(new MapLink(1, 1, true, 3));
		map4LabelsMapping.add(new MapLink(2, 2, false, 4));
		map4LabelsMapping.add(new MapLink(3, 2, false, 5));
		map4LabelsMapping.add(new MapLink(4, 3, false, 7));
		map4LabelsMapping.add(new MapLink(5, 2, false, 8));
		map4LabelsMapping.add(new MapLink(6, 1, true, 5,10));
		map4LabelsMapping.add(new MapLink(7, 4, false, -1)); // 보스방
		map4LabelsMapping.add(new MapLink(8, 3, false, 7));
		map4LabelsMapping.add(new MapLink(9, 3, false, 7));
		map4LabelsMapping.add(new MapLink(10, 2, false, 9));

	}
	private void initmap5LabelsMapping() {
		//0 1 2 3
		map5LabelsMapping.add(new MapLink(0, 1, true, 5));
		map5LabelsMapping.add(new MapLink(1, 1, true, 4));
		map5LabelsMapping.add(new MapLink(2, 1, true, 5));
		map5LabelsMapping.add(new MapLink(3, 1, true, 4));
		map5LabelsMapping.add(new MapLink(4, 2, false, 7));
		map5LabelsMapping.add(new MapLink(5, 2, false, 6));
		map5LabelsMapping.add(new MapLink(6, 3, false, 8)); 
		map5LabelsMapping.add(new MapLink(7, 3, false, 8));
		map5LabelsMapping.add(new MapLink(8, 4, false, -1)); // 보스방
		map5LabelsMapping.add(new MapLink(9, 3, false, 8));
	}
	private void initmap6LabelsMapping() {
		// 0 1 2 7
		map6LabelsMapping.add(new MapLink(0, 1, true, 5));
		map6LabelsMapping.add(new MapLink(1, 1, true, 3));
		map6LabelsMapping.add(new MapLink(2, 1, true, 4));
		map6LabelsMapping.add(new MapLink(3, 2, false, 9));
		map6LabelsMapping.add(new MapLink(4, 2, false, 9));
		map6LabelsMapping.add(new MapLink(5, 2, false, 9));
		map6LabelsMapping.add(new MapLink(6, 4, false, -1)); // 보스방
		map6LabelsMapping.add(new MapLink(7, 1, true, 8));
		map6LabelsMapping.add(new MapLink(8, 2, false, 9));
		map6LabelsMapping.add(new MapLink(9, 3, false, 6));
	}

	public ArrayList<MapLink> getLabelsMappingList(int i) { 
		return LabelsMappingList.get(i);
	}


}
