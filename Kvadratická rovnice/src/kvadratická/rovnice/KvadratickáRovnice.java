/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kvadratická.rovnice;
import java.util.*;
/**
 *
 * @author stopk
 */
public class KvadratickáRovnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
    System.out.println("zadej A");//napověda CTRL+MEZERNÍK
    double a;
    a = sc.nextDouble();
    System.out.println("zadej B");
    double b; 
    b = sc.nextDouble();
    System.out.println("zadej C");
    double c;
    c = sc.nextDouble();
    int D = pocetReseni(a, b, c);
    
    if (D < 0){
    System.out.println("Rovnice nemá řešení.");
    } 
    else if (D == 0){
    System.out.println("Rovnice má jedno řešní.");
    }
    else {
    System.out.println("Rovnice má dvě řešení.");
    }
    }
  static int pocetReseni (double a, double b, double c){

    int pocetReseni = (byte) (b*b-4*a*c);
    return pocetReseni;
} 
//static int vysledek (int a, int b,int c){
}



