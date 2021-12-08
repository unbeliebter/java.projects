//Kapitel 4, Aufgabe 14
package uni;

/* Recherche zum Schaltjahr:
 Ein Schaltjahr ist eine fest vorgegebene Jahresfolge, die alle 4 Jahre auftritt. 2020, 2024, 2028, 2032.
 */

public class Schaltjahr {
    public static void main(String[] args) {
        //Beispiel am Schaltjahr 2020
        int year = 2020;

        if (year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println("Das Jahr " + year + " ist ein Schaltjahr!");
        } else if (year % 400 == 0){
            System.out.println("Das Jahr " + year + " ist ein Schaltjahr!");
        } else {
            System.out.println("Das Jahr " + year + " ist kein Schaltjahr!");
        }
    }
}
