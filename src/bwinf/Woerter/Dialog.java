/**
 * 
 */
package bwinf.Woerter;

import java.util.*;
/**
 *
 */
public class Dialog {
    /**
     * Attribute
     */
    private Scanner input = new Scanner(System.in);
    private String filename = "";
    private String usedPath = "";
    private String pathWindows = "C:/Dokumente/Wörter_aufräumen/Beipiele/";
    private String pathMac = "/Users/Beng/Desktop/Wörter_aufräumen/Beispiele/";

    /**
     * Konstanten für die Funktionen
     */
    private static final int MACOS = 1;
    private static final int WINDOWS = 2;
    private static final int READ = 3;
    private static final int ENDE = 0;
    /**
     * Konstanten Fehlermeldungen
     */
    private static final String WRONG_OS = "Ungueltige Zahl eingegeben (Möglich 1 oder 2)";
    /**
     * Die Start-Methode wird von main aufgerufen
     * Fängt die Fehler ab und gibt sie aus
     */
    public void start() {
        int funktion = -1;
        int OS = 0;
        System.out.print(
                MACOS + " : Mac OS \n" +
                        WINDOWS + " : Windows \n");
        OS = input.nextInt();
        check(OS == MACOS || OS == WINDOWS, WRONG_OS);
        if (OS == MACOS) {
            usedPath = pathMac;
        } else {
            usedPath = pathWindows;
        }
        while (funktion != ENDE) {
            try {
                funktion = einlesenFunktion();
                ausfuehrenFunktion(funktion);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } catch (InputMismatchException e) {
                System.out.println(e);
                input.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace(System.out);
            }
        }
    }
    /**
     * @return funktion Ein Integer der die naechste Funktion die durchgeführt wird bestimmt
     */
    private int einlesenFunktion() {
        int funktion;
       
        System.out.print("\n\n" +
                        READ + ": File einlesen \n" +
                        ENDE + ": Beenden -> ");

        funktion = input.nextInt();
        return funktion;
    }
    /**
     * Ausführen-Funktion Führt die in einlesenFunktion ausgewaehlte Funktion durch
     *
     * @param funktion Integer der der ausgewaehlten Funktion entspricht und bestimmt
     */
    private void ausfuehrenFunktion(int funktion) throws Exception {
        if (funktion == ENDE) {
            System.out.println("Programm Ende!\n");
            return;
        }
        switch (funktion) {
            case READ:
                readFile();
                break;
            case ENDE:
                System.out.println("Programm Ende!\n");
                return;
            default:
                System.out.println("Falsche Funktion!\n");
                break;
        }
        System.out.println("\n-----------------------------------");
    }
    private void readFile() throws Exception {
        ReadFile file = new ReadFile();
        System.out.println("what is the name of your file-name.txt ?");
        filename=input.next();
        file.read(usedPath, filename);
        System.out.println(file.getFinalText());
    }

    /**
     * Methode zur Fehlerbehandlung. Ueberprueft Bedingung und gibt eine Nachricht aus.
     *
     * @param bedingung Die Bedingung die bei nicht erfuellung eine Nachricht ausgibt.
     * @param message   Nachricht die bei nicht erfuellung ausgegeben wird
     */
    public void check(boolean bedingung, String message) {
        if (!bedingung) {
            throw new IllegalArgumentException(message);
        }
    }
}
