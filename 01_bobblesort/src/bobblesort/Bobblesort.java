/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bobblesort;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Bobblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Zadejte počet čísel.");
        int pocetCisel = sc.nextInt();
        int[] cisla = new int [pocetCisel];

        for (int i = 0; i < pocetCisel; i++) {
            System.out.println("Zadej číslo " + (i + 1) );
            cisla[i] = sc.nextInt();
        }

        System.out.print("Neseřazené pole"+Arrays.toString(cisla));

         for (int i = 0; i < cisla.length - 1; i++) {
             for (int j = 0; j < cisla.length - i - 1; j++) {
                if(cisla[j] < cisla[j+1]){
                    int b = cisla[j];
                        cisla[j] = cisla[j+1];
                            cisla[j+1] = b;

                }

             }

         }

        System.out.print("Seřazené pole"+Arrays.toString(cisla));
    }
    
}