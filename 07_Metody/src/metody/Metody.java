/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metody;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Metody {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Zadej číslo pro zapsání faktoriálu menší než 20");
        int cislo = sc.nextInt();
        if(cislo > 20) {
            return;
        }

        long vysledek = faktorial(cislo);
        System.out.println(cislo + "! = "+ vysledek);
      
    }
    static long faktorial(int fak_cislo){

        long fak_vysledek = 1;
            for (;fak_cislo>0;fak_cislo--){
                fak_vysledek *= fak_cislo;
            }
        return fak_vysledek;
  }
}
