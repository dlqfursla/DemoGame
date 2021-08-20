package Data;

import java.lang.Cloneable;

public class Character implements Cloneable {
    private String Name;
    private int HP;
    private int Stamina;
    private int MaxAtk;
    private int MinAtk;
    private int Intelligence;
    private int Defence;
    private int Regeneration;

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

    public Character copy() throws CloneNotSupportedException {
        return (Character) clone();
    }

}
