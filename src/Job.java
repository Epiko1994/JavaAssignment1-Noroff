package src;

public class Job extends Character {
    private String jobName;
    private int level = 1;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int strengthPerLevel;
    private int dexterityPerLevel;
    private int intelligencePerLevel;
    private String primaryStat;


    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrengthPerLevel(int strengthPerLevel) {
        this.strengthPerLevel = strengthPerLevel;
    }

    public void setDexterityPerLevel(int dexterityPerLevel) {
        this.dexterityPerLevel = dexterityPerLevel;
    }

    public void setIntelligencePerLevel(int intelligencePerLevel) {
        this.intelligencePerLevel = intelligencePerLevel;
    }

    public String getPrimaryStat() {
        return primaryStat;
    }

    public void setPrimaryStat(String primaryStat) {
        this.primaryStat = primaryStat;
    }

    public void levelUp() {
        level++;
        strength += strengthPerLevel;
        dexterity += dexterityPerLevel;
        intelligence += intelligencePerLevel;
    }
}
