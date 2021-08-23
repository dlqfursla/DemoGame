package Data;

public class Skill {
    private String Name;
    private int MaxGauge; // 채울 수 있는 총 게이지
    private int Gauge; // 단위 게이지, MaxGauge를 몇 등분할지의 값
    private int Income; // 턴 당 게이지가 차는 양

    // 디버프, 값에 따라 몇 턴 동안 지속될지 결정
    private int Stun; // 다음 턴 쉼
    private int Weaken; // 가하는 데미지 30% 감소
    private int Slow; // 맞는 데미지 30% 증가

    public Skill(String Name, int MaxGauge, int Gauge, int Income, int Stun, int Weaken, int Slow) {
        setName(Name);
        setMaxGauge(MaxGauge);
        setGauge(Gauge);
        setIncome(Income);

        setStun(Stun);
        setWeaken(Weaken);
        setSLow(Slow);
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

    public int getIncome() {
        return Income;
    }
    public int getStun() {
        return Stun;
    }

    public int getWeaken() {
        return Weaken;
    }

    public int getSlow() {
        return Slow;
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

    public void setIncome(int Income) {
        this.Income = Income;
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
