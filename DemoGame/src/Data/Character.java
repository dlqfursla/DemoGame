package Data;

import java.lang.Cloneable;

public class Character implements Cloneable {
    private String Name; // 캐릭터 이름
    private int HP; // HP
    private int Stamina; // 스킬을 쓰기 위한 재화
    private int MaxAtk; // Ad Skill 보정값
    private int MinAtk; // Ad Skill 보정값
    private int Intelligence; // Ap Skill 보정값
    private int Defence; // 받는 딜 - (받는 딜 * 방어력%)로 계산
    private int Regeneration; // 휴식시 받는 스테미나 보정값

    private Skill[] Skills;

    private boolean IsStun; // 디버프 확인용
    private boolean IsWeaken; // 디버프 확인용
    private boolean IsSlow; // 디버프 확인용

    public Character() {
        setName("N/A");
        setHP(0);
        setStamina(0);
        setMinAtk(0);
        setMaxAtk(0);
        setIntelligence(0);
        setDefence(0);
        setRegeneration(0);

    }

    public Character(String Name, int HP, int Stamina, int MaxAtk, int MinAtk, int Intelligence, int Defence,
            int Regeneration) {
        setName(Name);
        setHP(HP);
        setStamina(Stamina);
        setMinAtk(MinAtk);
        setMaxAtk(MaxAtk);
        setIntelligence(Intelligence);
        setDefence(Defence);
        setRegeneration(Regeneration);

        Skills = new Skill[8];

        IsStun = false;
        IsWeaken = false;
        IsSlow = false;
    }

    public String getName() {
        return Name;
    }

    public int getHP() {
        return HP;
    }

    public int getStamina() {
        return Stamina;
    }

    public int getMaxAtk() {
        return MaxAtk;
    }

    public int getMinAtk() {
        return MinAtk;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getDefence() {
        return Defence;
    }

    public int getRegeneration() {
        return Regeneration;
    }

    public Skill getSkills(int i) {
        return Skills[i];
    }

    public boolean getIsStun() {
        return IsStun;
    }

    public boolean getIsWeaken() {
        return IsWeaken;
    }

    public boolean getIsSlow() {
        return IsSlow;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setStamina(int Stamina) {
        this.Stamina = Stamina;
    }

    public void setMaxAtk(int MaxAtk) {
        if (MaxAtk >= MinAtk)
            this.MaxAtk = MaxAtk;
    }

    public void setMinAtk(int MinAtk) {
        if (MaxAtk >= MinAtk)
            this.MinAtk = MinAtk;
    }

    public void setIntelligence(int Intelligence) {
        this.Intelligence = Intelligence;
    }

    public void setDefence(int Defence) {
        this.Defence = Defence;
    }

    public void setRegeneration(int Regeneration) {
        this.Regeneration = Regeneration;
    }

    public void setSkills(Skill skill, int i) {
        Skills[i] = skill;
    }

    public void setIsStun(boolean IsStun) {
        this.IsStun = IsStun;
    }

    public void getIsWeaken(boolean IsWeaken) {
        this.IsWeaken = IsWeaken;
    }

    public void getIsSlow(boolean IsSlow) {
        this.IsSlow = IsSlow;
    }

    public Character copy() throws CloneNotSupportedException {
        return (Character) clone();
    }

}
