package src;

import java.util.HashMap;

public class Character {
    private String characterName;
    private Job job;
    private Weapon weapon;
    private Armour headArmour;
    private Armour bodyArmour;
    private Armour legArmour;
    private double totalDamage;
    private double totalDamagePerSecond;


    public Character() {
    }

    public String getName() {
        return characterName;
    }

    public void setName(String name) {
        this.characterName = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(Weapon currentWeapon, int primaryStat) {
        this.totalDamage = currentWeapon.getDamage() * (((double)primaryStat / 100) + 1);
    }

    public double getTotalDamagePerSecond() {
        return totalDamagePerSecond;
    }

    public void setTotalDamagePerSecond(Character playerCharacter, Weapon currentWeapon) {
        this.totalDamagePerSecond = playerCharacter.getTotalDamage() * currentWeapon.getAttacksPerSecond();
    }
}
