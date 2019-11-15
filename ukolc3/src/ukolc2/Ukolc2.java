/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukolc2;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Ukolc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner sc = new Scanner (System.in);
      System.out.println("Zadej znaky?");
       String s1 = sc.next();
       int cislo;
       if(s1.toLowerCase().startsWith("0x")){
       cislo = Integer.parseInt(s1.substring(2), 16);
       }
       else if (s1.startsWith("0")){
       cislo = Integer.parseInt(s1.substring(1), 8);
       }
       else {
       cislo = Integer.parseInt(s1);
       }
    System.out.println(Integer.toBinaryString(cislo));
    }
    
}
