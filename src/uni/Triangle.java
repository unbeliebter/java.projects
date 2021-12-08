//Kapitel 4 Ag.7
/*
Author: Sven Marcel Pradela, Pascal Günter Bürklin
 */
package uni;

public class Triangle {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String triangle = "";

        //n = 10
        for (int i = 0; i < 1000; i++) {
            triangle = triangle +  " * ";
            System.out.println(triangle);
        }


        long startTime = System.currentTimeMillis();
        StringBuilder triangleBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            triangleBuilder.append(" * ");
            System.out.println(triangleBuilder.toString());
        }


        System.out.println("Triangle with append only string took " + (System.currentTimeMillis() - startTime1) + " ms.");
        System.out.println("Triangle with Stringbuilder took " + (System.currentTimeMillis() - startTime) + " ms.");

    }
}
