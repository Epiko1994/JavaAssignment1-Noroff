package src;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Setting up scanner and character
        Scanner playerInput = new Scanner(System.in);
        Character playerCharacter = new Character();

        runGame(playerCharacter, playerInput);
    }

    private static void runGame(Character playerCharacter, Scanner playerInput) {
        //Run character setup
        setupCharacter(playerCharacter, playerInput);
        //Sets playerJob for shorter calls
        Job playerJob = playerCharacter.getJob();

        playerJob.levelUp();
        playerJob.levelUp();

        //Print player info after creation
        System.out.println("Character name: " + playerCharacter.getName());
        System.out.println("Job: " + playerJob.getJobName());
        System.out.println("Strength: " + playerJob.getStrength());
        System.out.println("Dexterity: " + playerJob.getDexterity());
        System.out.println("Intelligence: " + playerJob.getIntelligence());
        System.out.println("Primary Stat: " + playerJob.getPrimaryStat());
        System.out.println("Current Level: " + playerJob.getLevel());
        System.out.println("Weapon: " + playerCharacter.getWeapon().getItemName());
        System.out.println("Damage: " + playerCharacter.getTotalDamage());
        System.out.println("Damage per second: " + playerCharacter.getTotalDamagePerSecond());
    }

    private static void setupCharacter(Character playerCharacter, Scanner playerInput) {
        System.out.println("Welcome to the game, please enter the name of your character: ");
        String characterName = playerInput.nextLine();
        playerCharacter.setName(characterName);


        System.out.println("Please pick your character's Job");
        System.out.println("'Bard', 'Black Mage', 'Ninja', 'Warrior'");
        System.out.println("(Job has to be written exactly as presented)");
        String jobName = playerInput.nextLine();
        if(validateJobInput(jobName) != null) {
            playerCharacter.setJob(setupJob(jobName));
            playerCharacter.setWeapon(setupStartingWeapon(playerCharacter));
        }
        //Checks which primary stat current character has
        switch (playerCharacter.getJob().getPrimaryStat()) {
            case "Strength" -> playerCharacter.setTotalDamage(playerCharacter.getWeapon(), playerCharacter.getJob().getStrength());
            case "Dexterity" -> playerCharacter.setTotalDamage(playerCharacter.getWeapon(), playerCharacter.getJob().getDexterity());
            case "Intelligence" -> playerCharacter.setTotalDamage(playerCharacter.getWeapon(), playerCharacter.getJob().getIntelligence());
        }

        //Sets total DPS with primary stat bonus
        playerCharacter.setTotalDamagePerSecond(playerCharacter, playerCharacter.getWeapon());
    }

    private static Job setupJob(String jobName) {
        Job characterJob = new Job();
        characterJob.setJobName(jobName);
        switch (jobName) {
            case "Bard" -> {
                characterJob.setStrength(1);
                characterJob.setDexterity(7);
                characterJob.setIntelligence(1);
                characterJob.setStrengthPerLevel(1);
                characterJob.setDexterityPerLevel(5);
                characterJob.setIntelligencePerLevel(1);
                characterJob.setPrimaryStat("Dexterity");
            }
            case "Black Mage" -> {
                characterJob.setStrength(1);
                characterJob.setDexterity(1);
                characterJob.setIntelligence(8);
                characterJob.setStrengthPerLevel(1);
                characterJob.setDexterityPerLevel(1);
                characterJob.setIntelligencePerLevel(5);
                characterJob.setPrimaryStat("Intelligence");
            }
            case "Ninja" -> {
                characterJob.setStrength(2);
                characterJob.setDexterity(6);
                characterJob.setIntelligence(1);
                characterJob.setStrengthPerLevel(1);
                characterJob.setDexterityPerLevel(4);
                characterJob.setIntelligencePerLevel(1);
                characterJob.setPrimaryStat("Dexterity");
            }
            case "Warrior" -> {
                characterJob.setStrength(5);
                characterJob.setDexterity(2);
                characterJob.setIntelligence(1);
                characterJob.setStrengthPerLevel(3);
                characterJob.setDexterityPerLevel(2);
                characterJob.setIntelligencePerLevel(1);
                characterJob.setPrimaryStat("Strength");
            }
        }
        return characterJob;
    }

    private static Weapon setupStartingWeapon(Character playerCharacter) {
        Random rand = new Random();
        int randomDamage = rand.nextInt(4 - 2) + 2;
        Weapon startingWeapon = new Weapon();
        startingWeapon.setItemType("Weapon");
        startingWeapon.setRequiredLevel(1);
        startingWeapon.setItemEquipSlot("Weapon");
        startingWeapon.setDamage(randomDamage);

        switch (playerCharacter.getJob().getJobName()) {
            case "Bard" -> {
                startingWeapon.setItemName("Wooden Bow");
                startingWeapon.setWeaponType("Bow");
                startingWeapon.setAttacksPerSecond(0.5);
                startingWeapon.setDamagePerSecond(startingWeapon.getDamage(), startingWeapon.getAttacksPerSecond());
            }
            case "Black Mage" -> {
                startingWeapon.setItemName("Wooden Staff");
                startingWeapon.setWeaponType("Staff");
                startingWeapon.setAttacksPerSecond(0.5);
                startingWeapon.setDamagePerSecond(startingWeapon.getDamage(), startingWeapon.getAttacksPerSecond());
            }
            case "Ninja" -> {
                startingWeapon.setItemName("Worn Dagger");
                startingWeapon.setWeaponType("Dagger");
                startingWeapon.setAttacksPerSecond(0.5);
                startingWeapon.setDamagePerSecond(startingWeapon.getDamage(), startingWeapon.getAttacksPerSecond());
            }
            case "Warrior" -> {
                startingWeapon.setItemName("Worn Axe");
                startingWeapon.setWeaponType("Axe");
                startingWeapon.setAttacksPerSecond(0.5);
                startingWeapon.setDamagePerSecond(startingWeapon.getDamage(), startingWeapon.getAttacksPerSecond());
            }
        }
        return startingWeapon;
    }
    
    private static String validateJobInput(String jobName) {
        if(jobName.equals("Black Mage") || jobName.equals("Bard") || jobName.equals("Ninja") || jobName.equals("Warrior")) {
            return jobName;
        } else {
            System.out.println("Please pick one of the available classes, try again!");
            return null;
        }
    }
}
