package saarCraft;

public class Items {

    public static String name;
    private static int weight;

    public Items(String name,int weight) {
        Items.name = name;
        setWeight(weight);
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Items.weight = weight;
    }
}
