package Data;

public class Skill {
    String Name;
    int MaxGauge; // 채울 수 있는 총 게이지
    int Gauge; // 단위 게이지, MaxGauge를 몇 등분할지의 값

    //디버프, 값에 따라 몇 턴 동안 지속될지 결정
    int Stun;
    int Weaken;
    int Slow;

    public Skill(String Name, int MaxGauge, int Gauge) {
        this.Name = Name;
        this.MaxGauge = MaxGauge;
        this.Gauge = Gauge;
    }

    public String getName() {
        return Name;
    }

    public int getMaxGauge() {
        return MaxGauge;
    }

    public int getGauge() {
        return Gauge;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setMaxGauge(int MaxGauge) {
        this.MaxGauge = MaxGauge;
    }

    public void setGauge(int Gauge) {
        this.Gauge = Gauge;
    }
    
}
