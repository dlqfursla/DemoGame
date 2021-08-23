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
        //AdSkillsList.add(new AdSkill(Name, MaxGauge, Gauge, OriginalDamage, Stun, Weaken, Slow));
        // 16개 만들기
    }

    private void intiApSkills() {
        ApSkillsList = new ArrayList<ApSkill>();
        //ApSkillsList.add(new ApSkill(Name, MaxGauge, Gauge, OriginalDamage, OriginalHeal, Stun, Weaken, Slow));
        // 16개 만들기
    }

    public AdSkill getAdSkill(int i) {
        return AdSkillsList.get(i);
    }

    public ApSkill getApSkill(int i) {
        return ApSkillsList.get(i);
    }
}
