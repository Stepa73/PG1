/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rovinneutvary;

import java.util.Scanner;

/**
 *
 * @author Tomáš
 */
public class RovinneUtvary {

    /**
     * @param args the command line arguments
     */
   private static Scanner skener = new Scanner (System.in);
    public static void main(String[] args) {
      final int POCET_OBRAZCU=2;
        byte volba;
        RvinnýÚtvar [] utvary = new RvinnýÚtvar[POCET_OBRAZCU];
     for(int index = 0; index < POCET_OBRAZCU; index++){ 
        System.out.print("Co chcete počítat? \n 1.Trojúhelník -> 1 \n 2.Obdélník -> 2 \n 3.Kruh -> 3");
        volba = skener.nextByte();
        switch(volba){ 
            case 1: 
                   
                    utvary[index] = nactiTrojuhelnik();
                    break;
                    
            case 2: 
                      utvary[index] = nactiObdelnik();
                    
                    break;
            case 3: 
                      utvary[index] = nactiKruh();
                    break;    
        }
     }
     for(int i = 0; i < POCET_OBRAZCU; i++){
     System.out.println("Obsah  je: "+utvary[i].obsah() + "Obvod je:" + utvary[i].obvod());
        }}
    static Trojuhelnik nactiTrojuhelnik (){
                    double a, b, c;
                    System.out.println("Zadejte strany trojúhelníku: ");
                    System.out.print("Strana a ="); a = skener.nextDouble();
                    System.out.print("Strana b ="); b = skener.nextDouble();
                    System.out.print("Strana c ="); c = skener.nextDouble();
                    Trojuhelnik tr = new Trojuhelnik (a,b,c);
                     
                    return tr;
    }
     static Kruh nactiKruh () {
                double r;
                    System.out.println("Zadej poloměr kruhu");
                    System.out.println("Poloměr"); r = skener.nextDouble();
                    return  new Kruh(r);
    }
      static Obdelnik nactiObdelnik () {
                    double a, b;
                    System.out.println("Zadejte délku a výšku obdelníku");
                    System.out.println("Délka a ="); a = skener.nextDouble();
                    System.out.println("Výška b ="); b = skener.nextDouble();
                    Obdelnik ob = new Obdelnik(a, b);
                    return ob;
    }}
            
            
    

