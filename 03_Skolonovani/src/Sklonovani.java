/**
 *
 * @author GAZi
 *
 */

import java.util.Scanner;

public class Sklonovani {
    public static void main(String[] agrs) {
        String cas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik je hodin ? (formát [12:00], String)");
        cas = sc.nextLine();

        System.out.print(vypis(cas));


    }

    public static String vypis(String cas) {
        String[] casti = cas.split(":");
        String zprava = "";
        String hodiny = casti[0];
        String minuty = casti[1];
        int hod = Integer.parseInt(hodiny);
        int min = Integer.parseInt(minuty);

        if (hod >= 0 && hod < 24) {
            if (hod < 12) {
                if (hod == 1) {
                    zprava = "právě je " + hodiny + " hodina ";
                } else if (hod < 5 && hod > 0) {
                    zprava = "právě jsou " + hodiny + " hodiny ";
                } else {
                    zprava = "právě je " + hodiny + " hodin ";
                }

                zprava = "Dobré ráno, " + zprava;
            } else if (hod > 12) {
                zprava = "Dobré odpoledne, právě je " + hodiny + " hodin ";
            } else {
                zprava = "Dobré poledne ";
            }
        } else {
            zprava = "Nemáš platný čas ";
        }

        if (min == 1) {
            zprava += "a " + minuty + " minta.";
        } else if (min < 5 && min > 0) {
            zprava += "a " + minuty + " minty.";
        } else {
            zprava += "a " + minuty + " minut.";
        }

        return zprava;
    }
}
