package Data;

public class AdSkill extends Skill {
    // 원본 값
    int OriginalDamage;

    // 플레이중 버프/디버프로 바뀐 값
    int DynamicDamage;



    public AdSkill(String Name, int MaxGauge, int Gauge, int OriginalDamage, int Stun, int Weaken, int Slow) {
        super(Name, MaxGauge, Gauge, Stun, Weaken, Slow);

        setOriginalDamage(OriginalDamage);

    }

    public int getOriginalDamage() {
        return OriginalDamage;
    }

    public int getDynamicDamage() {
        return DynamicDamage;
    }

    public void setOriginalDamage(int OriginalDamage) {
        this.OriginalDamage = OriginalDamage;
    }

    public void setDynamicDamage(int DynamicDamage) {
        this.DynamicDamage = DynamicDamage;
    }
}
