package src;

public class Armour extends Item {
    private enum armourClass {
        Cloth,
        Leather,
        Mail,
        Plate
    }
    private enum armourSlot {
        Head,
        Body,
        Legs
    }

    private int bonusStrength;
    private int bonusDexterity;
    private int bonusIntelligence;
    private String armourClass;
    private String armourSlot;

    public int getBonusStrength() {
        return bonusStrength;
    }

    public void setBonusStrength(int bonusStrength) {
        this.bonusStrength = bonusStrength;
    }

    public int getBonusDexterity() {
        return bonusDexterity;
    }

    public void setBonusDexterity(int bonusDexterity) {
        this.bonusDexterity = bonusDexterity;
    }

    public int getBonusIntelligence() {
        return bonusIntelligence;
    }

    public void setBonusIntelligence(int bonusIntelligence) {
        this.bonusIntelligence = bonusIntelligence;
    }

    public String getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(String armourClass) {
        this.armourClass = armourClass;
    }

    public String getArmourSlot() {
        return armourSlot;
    }

    public void setArmourSlot(String armourSlot) {
        this.armourSlot = armourSlot;
    }

    public void generateStartingArmour() {

    }

    public Armour generateRandomArmour() {
        return null;
    }
}
