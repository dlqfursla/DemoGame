package DataManager;

import java.util.ArrayList;

public class MapData {
	ArrayList<ArrayList<Integer>> LabelsMappingList;
	ArrayList<Integer> map1LabelsMapping;
	ArrayList<Integer> map2LabelsMapping;
	ArrayList<Integer> map3LabelsMapping;
	ArrayList<Integer> map4LabelsMapping;
	ArrayList<Integer> map5LabelsMapping;
	ArrayList<Integer> map6LabelsMapping;

	public MapData() {

	}

	public void initMapData() {
		// LabelsMapping = new ArrayList<int[]>[6];
		map1LabelsMapping = new ArrayList<Integer>();
		map2LabelsMapping = new ArrayList<Integer>();
		map3LabelsMapping = new ArrayList<Integer>();
		map4LabelsMapping = new ArrayList<Integer>();
		map5LabelsMapping = new ArrayList<Integer>();
		map6LabelsMapping = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getmap1LabelsMapping() {
		return map1LabelsMapping;
	}
}
