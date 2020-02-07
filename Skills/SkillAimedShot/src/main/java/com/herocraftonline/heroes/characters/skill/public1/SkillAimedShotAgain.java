package com.herocraftonline.heroes.characters.skill.public1;
import com.herocraftonline.heroes.Heroes;

import com.herocraftonline.heroes.api.SkillResult;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.skill.TargettedSkill;

public class SkillAimedShotAgain extends TargettedSkill {
    public SkillAimedShotAgain(Heroes plugin, String name) {
        super(plugin, "AimedShotAgain");
        System.out.println("Constructed!");
    }

    @Override
    public SkillResult use(Hero hero, org.bukkit.entity.LivingEntity livingEntity, String[] strings) {
        return SkillResult.FAIL;
    }

    @Override
    public String getDescription(Hero hero) {
        return "This is a test, it does not work at ALL";
    }
}
