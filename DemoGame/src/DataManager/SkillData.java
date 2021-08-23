package DataManager;

import java.util.ArrayList;

import Data.AdSkill;
import Data.ApSkill;

public class SkillData {
    private ArrayList<AdSkill> AdSkillsList;
    private ArrayList<ApSkill> ApSkillsList;

    public SkillData() {
        initAdSkills();
        intiApSkills();
    }

    private void initAdSkills() {
        AdSkillsList = new ArrayList<AdSkill>();
        //AdSkillsList.add(new AdSkill(Name, MaxGauge, Gauge, Income, OriginalDamage, Stun, Weaken, Slow));
        
        AdSkillsList.add(new AdSkill("AdSkill1", 60,  20, 20, 20, 0, 0, 0));
        AdSkillsList.add(new AdSkill("AdSkill2", 80,  40, 30, 20, 0, 0, 1));
        AdSkillsList.add(new AdSkill("AdSkill3", 100, 50, 30, 30, 0, 1, 0));
        AdSkillsList.add(new AdSkill("AdSkill4", 120, 60, 30, 35, 1, 0, 0));

        AdSkillsList.add(new AdSkill("AdSkill5", 100, 50, 40, 30, 0, 1, 0));
        AdSkillsList.add(new AdSkill("AdSkill6", 120, 60, 35, 35, 0, 0, 2));
        AdSkillsList.add(new AdSkill("AdSkill7", 140, 70, 30, 40, 1, 0, 0));
        AdSkillsList.add(new AdSkill("AdSkill8", 160, 80, 35, 30, 0, 3, 0));

        AdSkillsList.add(new AdSkill("AdSkill9", 60, 60, 10, 0, 0, 0, 0));
        AdSkillsList.add(new AdSkill("AdSkill10", 70, 70, 10, 0, 0, 0, 0));
        AdSkillsList.add(new AdSkill("AdSkill11", 80, 80, 10, 0, 0, 0, 0));
        AdSkillsList.add(new AdSkill("AdSkill12", 90, 90, 10, 5, 0, 0, 0));

        // AdSkillsList.add(new AdSkill("AdSkill13", 160, 160, 20, OriginalDamage, Stun, Weaken, Slow));
        // AdSkillsList.add(new AdSkill("AdSkill14", 180, 90, 20, OriginalDamage, Stun, Weaken, Slow));
        // AdSkillsList.add(new AdSkill("AdSkill15", 200, 200, Income, OriginalDamage, Stun, Weaken, Slow));
        // AdSkillsList.add(new AdSkill("AdSkill16", 240, 240, Income, OriginalDamage, Stun, Weaken, Slow));

        // 16개 만들기
    }

    private void intiApSkills() {
        ApSkillsList = new ArrayList<ApSkill>();
        // ApSkillsList.add(new ApSkill(Name, MaxGauge, Gauge, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill1", 90, 30, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill2", 120, 40, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill3", 150, 50, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill4", 160, 40, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));

        // ApSkillsList.add(new ApSkill("ApSkill5", 100, 50, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill6", 120, 60, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill7", 150, 50, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill8", 180, 60, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));

        // ApSkillsList.add(new ApSkill("ApSkill9", 80, 80, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill10", 100, 50, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill11", 120, 40, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill12", 150, 50, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));

        // ApSkillsList.add(new ApSkill("ApSkill13", 200, 100, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill14", 250, 50, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill15", 280, 70, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // ApSkillsList.add(new ApSkill("ApSkill16", 300, 300, Income, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        //16개 만들기
    }

    public AdSkill getAdSkill(int i) {
        return AdSkillsList.get(i);
    }

    public ApSkill getApSkill(int i) {
        return ApSkillsList.get(i);
    }
}
