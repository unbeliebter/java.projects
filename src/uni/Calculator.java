package uni;

public class Calculator {
    public static void main(String[] args) {
        double money = 15000;
        double percentage = 0.4;
        int rest = 100;

        double result;
        int counter = 1;

        while(money > rest) {
            result = percentage * money;
            money = result;
            System.out.println(counter + ". Jahr: " + money + "€ Buchwert");
            counter++;
        }
    }
}
