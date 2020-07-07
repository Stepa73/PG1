/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectení.dvou.polí;

import java.util.*;

/**
 * @author GAZi
 */

public class SecteníDvouPolí {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("zadej počet řádků:");
        int pocetRadku = sc.nextInt();

        System.out.println("zadej počet sloupců:");
        int pocetSloupcu = sc.nextInt();

        int[][] prvniMatice = nacti2dPole(pocetSloupcu, pocetRadku);

        int[][] druhaMatice = nacti2dPole(pocetSloupcu, pocetRadku);

        int[][] vyslednaMatice = secti2dPole(prvniMatice, druhaMatice);

        System.out.print(vypis2dPole(prvniMatice));
        System.out.println("           +              ");
        System.out.print(vypis2dPole(druhaMatice));
        System.out.println("           =              ");
        System.out.print(vypis2dPole(vyslednaMatice));

    }


    static int[][] nacti2dPole(int pocetSloupcu, int pocetRadku) {

        int radek = 0, sloupec = 0;
        int[][] pole = new int[pocetRadku][pocetSloupcu];

        while (radek < pocetRadku){
            while (sloupec < pocetSloupcu){
                System.out.println("Zadej hodnotu se souřadnicí pole["+sloupec+"]["+radek+"]");
                pole[sloupec][radek] = sc.nextInt();
                sloupec++;
            }
            radek++;
            sloupec = 0;
        }
        return pole;
    }

    public static String vypis2dPole(int[][] pole){
        String vypis = "";
        for (int[] element: pole){
            vypis += "[";
            for (int elementb: element){
                vypis += " "+elementb+" ";
            }
            vypis += "]\n";
        }
        return vypis;
    }

    static int[][] secti2dPole(int[][] prvniPole, int[][] druhePole) {
        int pocetRadku = prvniPole.length;

        int[][] vyslednePole = new int[pocetRadku][];

        for (int i = 0; i < pocetRadku; i++) {
            int pocetSloupcu = prvniPole[i].length;

            vyslednePole[i] = new int[pocetSloupcu];
            for (int j = 0; j < pocetSloupcu; j++) {
                vyslednePole[i][j] = prvniPole[i][j] + druhePole[i][j];
            }
        }
        return vyslednePole;
    }


}
