package saarCraft;

public class Monster {

    public static int healthPoints;
    public static int armor;
    public static int strength;
    public static int intelligence;
    public static String name;
    public static String race;
    public static String description;

    public Monster() {

    }

    public Monster(int healthPoints, int armor, int strength, int intelligence, String name, String race, String description) {
        Monster.healthPoints = healthPoints;
        Monster.armor = armor;
        Monster.strength = strength;
        Monster.intelligence = intelligence;
        Monster.name = name;
        Monster.race = race;
        Monster.description = description;
    }
}
