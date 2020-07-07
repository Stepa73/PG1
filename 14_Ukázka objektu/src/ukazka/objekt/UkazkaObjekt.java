/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukazka.objekt;

import java.util.*;

/**
 * @author GAZi
 */
public class UkazkaObjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto[] auto = new Auto[5];
        Scanner sc = new Scanner(System.in);
        auto[0] = new Auto("IMBG", "9I116619646", 1944, "191649464ER64");
        final int pocetAut = 2;
        for (int i = 1; i < pocetAut; i++) {
            auto[i] = new Auto();

            System.out.println("Zadej vin kód: ");
            auto[i].setVin(sc.nextLine());
            System.out.println("Zadej registrační značku: ");
            auto[i].setRegistracniZnacka(sc.nextLine());
            System.out.println("Zadejte rok výroby: ");
            auto[i].setRokVyroby(sc.nextInt());

            sc.nextLine();

            System.out.println("Zadejte číslo motoru: ");
            auto[i].setCisloMotoru(sc.nextLine());
            System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");


        }
        for (int i = pocetAut - 1; i >= 0; i--) {
            System.out.println("Auto č: " + (i + 1));
            System.out.println(auto[i].getVin());
            System.out.println(auto[i].getRegistracniZnacka());
            System.out.println(auto[i].getRokVyroby());
            System.out.println(auto[i].getCisloMotoru());
        }


    }


}
