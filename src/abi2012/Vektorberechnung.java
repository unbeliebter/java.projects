package abi2012;

import java.util.Scanner;

public class Vektorberechnung {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); 
    
    System.out.println("Gebe den ersten Vektor an!");
    double x1 = scanner.nextDouble(); 
    double x2 = scanner.nextDouble(); 
    double x3 = scanner.nextDouble(); 
    
    System.out.println("Gebe den zweiten Vektor an!");
    double y1 = scanner.nextDouble(); 
    double y2 = scanner.nextDouble(); 
    double y3 = scanner.nextDouble();
    
    Vektor vektorOne = new Vektor(x1, x2, x3); 
    Vektor vektorTwo = new Vektor(y1, y2, y3); 
    
    double result = skalarprodukt(vektorOne, vektorTwo); 
    boolean orthogonal = isOrthogonal(result); 
    
    String output = "________________________________" + "\n" +
                    "RESULT: " + result + "\n" +
                    "ORTHOGONAL: " + orthogonal + "\n" +
                    "________________________________";
                    
    System.out.println(output);
    }
    
    public static double skalarprodukt(Vektor vektorOne, Vektor vektorTwo) {
        double result = (vektorOne.x1 * vektorTwo.x1) + (vektorOne.x2 * vektorTwo.x2) + (vektorOne.x3 * vektorTwo.x3); 
        return result;
        }
    
    public static boolean isOrthogonal(double scalarproduct) {
        if(scalarproduct == 0) {
            return true; 
        } else {
            return false; 
        }
    }
}
