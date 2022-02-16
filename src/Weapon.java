package src;

public class Weapon extends Item {
    private enum WeaponTypes {
        Axe,
        Bow,
        Dagger,
        Hammer,
        Staff,
        Sword,
        Wand
    }

    private String weaponType;
    private int damage;
    private double attacksPerSecond;
    private double damagePerSecond;

    public Weapon() {
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttacksPerSecond() {
        return attacksPerSecond;
    }

    public void setAttacksPerSecond(double attacksPerSecond) {
        this.attacksPerSecond = attacksPerSecond;
    }

    public double getDamagePerSecond() {
        return damagePerSecond;
    }

    public void setDamagePerSecond(int damage, double attacksPerSecond) {
        this.damagePerSecond = damage * attacksPerSecond;
    }

    public void generateStartingWeapon(Job characterJob) {

    }
}
