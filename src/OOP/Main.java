package OOP;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        System.out.println(chair.length);
        chair.setGender("male");
        String test = chair.getGender();

        System.out.println(test);

    }
}
