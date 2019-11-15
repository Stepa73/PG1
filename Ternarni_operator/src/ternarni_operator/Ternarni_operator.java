/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternarni_operator;

import java.util.*;
/**
 *
 * @author stopk
 */
public class Ternarni_operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String otazka;
        byte hodiny;
        otazka = "Kolik je hodin?";
        
        System.out.println(otazka);
        
        Scanner vstupByte = new Scanner(System.in);
        
        hodiny = vstupByte.nextByte();
        
        if(hodiny >= 0 && hodiny < 24){
          String vypis = (hodiny == 1)?"prvě je 1 hodina":
                 (hodiny >=2 && hodiny <=4)? "pravě jsou " +hodiny+ " hodiny":"pravě je " +hodiny+ " hodin";
       System.out.println(vypis);
       }}}
