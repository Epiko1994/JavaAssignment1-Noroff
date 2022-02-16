package src;

public class Item {
    String itemName;
    String itemType;
    int requiredLevel;
    String itemEquipSlot;

    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public String getItemEquipSlot() {
        return itemEquipSlot;
    }

    public void setItemEquipSlot(String itemEquipSlot) {
        this.itemEquipSlot = itemEquipSlot;
    }
}
