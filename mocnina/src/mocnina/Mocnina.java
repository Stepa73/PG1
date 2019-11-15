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
    System.out.println("Napiš mocninu");//načtení exponetu
    mocnina = sc.nextInt();  
    
    int vysledek = mocnina(cislo, mocnina); //vyvolání metody port řadek 29 po vykonání řádek 27
    System.out.println(cislo+ " na " +mocnina+ " = " +vysledek);
    }
    static int mocnina(int cislo, int mocnina){
    
    int vysledek = 1;
    for (int i=0; i<mocnina;i++)
    { vysledek *= cislo;
            }
   
    return vysledek; //vrátí se na řádek 27
    }
 static int absolutnihodnota(int cislo){
 if (cislo < 0)
 {cislo *= -1;}
 return cislo;
 }
         
}
