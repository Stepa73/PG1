/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kobinační_číslo;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Kobinační_číslo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Zadej k");
        int k = sc.nextInt();
        double citatel = citatel(k,n);//(n-k)!
        double fak_vysledek = faktorial (n);//n!
        double fak_k = fak_k(k);//k!
        double vysledek = fak_vysledek/(fak_k*citatel);//n!/(n-k)!*k!
        System.out.println(vysledek);
      }
    public static double faktorial(int n){
    
    double faktorial = 1;
    
    for (int i = 1; i <= n;i++){
        faktorial= i*faktorial;
    
    }
    return faktorial;
    }
    public static double fak_k(int k){
    
    double fak_k = 1;
    
    for (int i = 1; i <= k;i++){
        fak_k= i*fak_k;
    
    }
    
    return fak_k;
    }
    public static double citatel(int k,int n){
    
    double citatel = 1;
    k=n-k;
    for (int i = 1; i <= k;i++){
        citatel= i*citatel;
    
    }
    
    return citatel;
    }
}
