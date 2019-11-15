/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;
/**
 *
 * @author stopk
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[][] pole = nacti2dPole();
    vypis2dPole(pole);
    
    }
    
    static int[][] nacti2dpole() {
    Scanner sc = new Scanner(System.in);
            int pocetRadku, pocetSloupcu;
            
            System.out.println("Zadej počet řádků");
            pocetRadku = sc.nextInt();
            
            System.out.println("zadej pocet sloupců");
            pocetSloupcu = sc.nextInt();
            
            int[][] pole = new int[pocetRadku][pocetSloupcu];
            
            for (int i = 0; i< pocetRadku; i++){
                for(int j=0; j< pocetSloupcu; j++){
                    System.out.println("Zadej číslo " + (i + 1) + ". řádkudku a " + (j + 1) + ". sloupce: ");
                    pole [i][j] = sc.nextInt();
                    
                }
            }
   return pole;} 

}
