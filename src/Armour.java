package src;

public class Armour extends Item {
    private enum armourClass {
        Cloth,
        Leather,
        Mail,
        Plate
    }
    private enum armourType {
        Head,
        Body,
        Legs
    }

    private int bonusStrength;
    private int bonusDexterity;
    private int bonusIntelligence;
    private String armourClass;
    private String armourType;

    public void generateStartingArmour() {

    }

    public Armour generateRandomArmour() {
        return null;
    }
}
