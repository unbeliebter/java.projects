package saarCraft;

public class Hero extends Monster {

    public static String[] inventory = new String[9];

    public Hero(int healthPoints, int armor, int strength, int intelligence, String name, String[] inventory) {
        Hero.healthPoints = healthPoints;
        Hero.armor = armor;
        Hero.strength = strength;
        Hero.intelligence = intelligence;
        Hero.name = name;
        Hero.inventory = inventory;
    }

    public static void attackOfHero(Monster monster, Hero hero) {
        if (monster.armor > hero.strength) {
            monster.healthPoints =- (hero.strength - monster.armor);

            if (monster.healthPoints < 0) {
                monster.healthPoints = 0;
            }
        }
    }
}
