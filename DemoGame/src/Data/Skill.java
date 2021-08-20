package Data;

public class Skill {
    String Name;
    int MaxGauge; // 채울 수 있는 총 게이지
    int Gauge; // 단위 게이지, MaxGauge를 몇 등분할지의 값

    // 디버프, 값에 따라 몇 턴 동안 지속될지 결정
    int Stun; // 다음 턴 쉼
    int Weaken; // 가하는 데미지 30% 감소
    int Slow; // 맞는 데미지 30% 증가

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

    public int getStun() {
        return Stun;
    }

    public int getWeaken() {
        return Stun;
    }

    public int getSLow() {
        return Stun;
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

    public void setStun(int Stun) {
        this.Stun = Stun;
    }

    public void setWeaken(int Weaken) {
        this.Weaken = Weaken;
    }

    public void setSLow(int Slow) {
        this.Slow = Slow;
    }

}
