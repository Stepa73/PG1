/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nova.hodina;

import java.util.*;

/**
 *
 * @author stopk
 */
public class NovaHodina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc;
        sc = new Scanner (System.in);
    System.out.println("Zadej spodní hranici");
    int spodni ;
    spodni = sc.nextInt();
    System.out.println("Zadej horni hranici");
    int horni;
    horni = sc.nextInt();
    for (;spodni > horni; spodni++){
           int prvocislo;
           int vysledek;
        vysledek = prvocislo (spodni);
        System.out.println(vysledek);
    
    }}
    static boolean prvocislo (int spodni){
    
    for (int i = 2; i <= Math.sqrt(spodni); i++){
    if (spodni % i != 0)
        return (false);
    }

return (true);
    }}
