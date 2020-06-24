/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odmocnina;

import java.util.*;
/**
 *
 * @author stopk
 */
public class Odmocnina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Zadej číslo pro vypočítání odmocniny.");
       double cislo;
       cislo = sc.nextDouble();

       if (cislo < 0){
           System.out.println("Zadané číslo pro vypočítání odmocniny je menší jak nula.");
           return;
       }

       
       System.out.println("Výsledek je "+Math.sqrt(cislo)+" .");
    }
    
}
