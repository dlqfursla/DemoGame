package Data;
import java.lang.Cloneable;
public class Stats implements Cloneable {

    public Stats() {
        
        setHP(0);
        setStamina(0);
        setMinAtk(0);
        setMaxAtk(0);
        setIntelligence(0);
        setDefence(0);
        setRegeneration(0);
        
    }
    public Stats(String Name, int HP, int Stamina, int MaxAtk, int MinAtk, int Intelligence, int Defence, int Regeneration) {
        setName(Name);
        setHP(HP);
        setStamina(Stamina);
        setMinAtk(MinAtk);
        setMaxAtk(MaxAtk);
        setIntelligence(Intelligence);
        setDefence(Defence);
        setRegeneration(Regeneration);
    }
}
