package Data;

public class ApSkill extends Skill {
    // 원본 값
    private int OriginalDamage;
    private int OriginalHeal;

    // 플레이중 버프/디버프로 바뀐 값
    private int DynamicDamage;
    private int DynamicHeal;

     
    public ApSkill(String Name, int MaxGauge, int Gauge, int OriginalDamage, int OriginalHeal, int Stun, int Weaken, int Slow) {
        super(Name, MaxGauge, Gauge, Stun, Weaken, Slow);

        setOriginalDamage(OriginalDamage);
        setOriginalHeal(OriginalHeal);
    }

    public int getOriginalDamage() {
        return OriginalDamage;
    }

    public int getOriginalHeal() {
        return OriginalHeal;
    }

    public int getDynamicDamage() {
        return DynamicDamage;
    }

    public int getDynamicHeal() {
        return DynamicHeal;
    }

    public void setOriginalDamage(int OriginalDamage) {
        this.OriginalDamage = OriginalDamage;
    }

    public void setOriginalHeal(int OriginalHeal) {
        this.OriginalHeal = OriginalHeal;
    }

    public void setDynamicDamage(int DynamicDamage) {
        this.DynamicDamage = DynamicDamage;
    }

    public void setDynamicHeal(int DynamicHeal) {
        this.DynamicHeal = DynamicHeal;
    }

}
