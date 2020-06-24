/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocnina;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Mocnina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int cislo;
        System.out.println("Napiš číslo");//načtení čísla
        cislo = sc.nextInt();

        int mocnina;
        System.out.println("Napiš mocninu (pouze kladný)");//načtení exponetu pouze kladného !!
        mocnina = sc.nextInt();

        int vysledek = mocnina(cislo, mocnina); //vyvolání metody port řadek 33 po vykonání řádek 30
        System.out.println(cislo+ " na " +mocnina+ " = " +vysledek);
    }

    static int mocnina(int cislo, int mocnina){ //pozor nebude fungovat u záporného exponentu

        int vysledek = 1;
        for (int i=0; i<mocnina;i++){
            vysledek *= cislo;
        }

        return vysledek; //vrátí se na řádek 30
    }
    static double mocnina2(double cislo, double mocnina){ //Funkce funguje i s desetinnými čílsi a záporným exponentem
        return Math.pow(cislo, mocnina);
    }

    static int absolutniHodnota(int cislo){
         if (cislo < 0){
             cislo *= -1;
         }
         return cislo;
    }
         
}
