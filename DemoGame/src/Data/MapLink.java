package Data;

import java.util.ArrayList;

public class MapLink {
    private int LabelNum; // 코드상에서 레이블 인덱스
    private int Level; // Map Panel에 있는 각 지점의 난이도 (각 레이블의 숫자 값)
    private boolean FirstLink; // 시작하자마자 갈 수 있는 곳 표시
    private ArrayList<Integer> NextLink; // 해당 지점을 꺠면 갈 수 있는 곳 표시

    public MapLink(int LabelNum, int Level, boolean FirstLink, int NextLink1) {
        setLabelNum(LabelNum);
        setLevel(Level);
        setFirstLink(FirstLink);
        setNextLink(NextLink1);
    }

    public MapLink(int LabelNum, int Level, boolean FirstLink, int NextLink1, int NextLink2) {
        setLabelNum(LabelNum);
        setLevel(Level);
        setFirstLink(FirstLink);
        setNextLink(NextLink1, NextLink2);
    }

    public MapLink(int LabelNum, int Level, boolean FirstLink, int NextLink1, int NextLink2, int NextLink3) {
        setLabelNum(LabelNum);
        setLevel(Level);
        setFirstLink(FirstLink);
        setNextLink(NextLink1, NextLink2, NextLink3);
    }

    public int getLabelNum() {
        return LabelNum;
    }

    public int getLevel() {
        return Level;
    }

    public boolean getFirstLink() {
        return FirstLink;
    }

    public ArrayList<Integer> getNextLink() {
        return NextLink;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public void setFirstLink(boolean FirstLink) {
        this.FirstLink = FirstLink;
    }

    /**
     * NextLink가 비어있을때만 가능
     */
    public void setLabelNum(int LabelNum) {
        this.LabelNum = LabelNum;
    }

    public void setNextLink(int NextLink1) {
        NextLink = new ArrayList<Integer>();
        if (NextLink.isEmpty())
            NextLink.add(NextLink1);
    }

    public void setNextLink(int NextLink1, int NextLink2) {
        NextLink = new ArrayList<Integer>();
        if (NextLink.isEmpty()) {
            NextLink.add(NextLink1);
            NextLink.add(NextLink2);
        }

    }

    public void setNextLink(int NextLink1, int NextLink2, int NextLink3) {
        NextLink = new ArrayList<Integer>();
        if (NextLink.isEmpty()) {
            NextLink.add(NextLink1);
            NextLink.add(NextLink2);
            NextLink.add(NextLink3);
        }
    }
}
