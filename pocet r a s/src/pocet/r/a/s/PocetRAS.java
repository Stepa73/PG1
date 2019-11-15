/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocet.r.a.s;

import java.util.*;

/**
 *
 * @author stopk
 */
public class PocetRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String otazka1;
        byte radek;
        otazka1 = "Kolik je řádků?";
        System.out.println(otazka1);
    
    Scanner vstup1Byte = new Scanner(System.in);
        radek = vstup1Byte.nextByte();
    
        String otazka2;
        byte sloupec;
    otazka2 = "Jaký je sloupec?";
    System.out.println(otazka2);
    
     Scanner vstup2Byte = new Scanner(System.in); 
        sloupec = vstup2Byte.nextByte();
     int[][] cisla =new int[radek][sloupec];
     for(int i = 0; i <radek; i++){
     
     for(int j = 0; j <sloupec; j++){    
         System.out.println("zadej cislo");
         cisla [i][j] = vstup1Byte.nextInt();
       
     }
     
     }
     
     for(int i = 0; i <radek; i++){
      
         for(int j = 0; j <sloupec; j++){
          if(i < sloupec - 1)
                   System.out.print(cisla[i][j] + '\n');
                else    
                    System.out.print(cisla[i][j] + '\t');   
         }
         }

     }
}
    
    

