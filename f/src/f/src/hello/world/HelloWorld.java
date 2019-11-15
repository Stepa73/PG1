/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.*;

/**
 *
 * @author ceskyDJ
 */
public class HelloWorld {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        String raptor_prompt_variable_zzyz;
        String pridat_hodiny;
        byte hodiny;
        
        raptor_prompt_variable_zzyz = "Kolik je hodin?";
        
        // Vytiskne text a zalomí řádek
        System.out.println(raptor_prompt_variable_zzyz);
        
//        byte[] pole = new byte[20];
//        
//        try {
//            System.in.read(pole);
//        } catch(IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        String nacteno = new String(pole).trim();
//        hodiny = Byte.valueOf(nacteno);

        Scanner vstupByte = new Scanner(System.in);
        
        hodiny = vstupByte.nextByte();
        
        if (hodiny >= 0 && hodiny < 24) {
            if (hodiny < 12) {
                if (hodiny == 1) {
                    pridat_hodiny = "právě je " + hodiny + " hodina.";
                } else if (hodiny < 5) {
                    pridat_hodiny = "právě jsou " + hodiny + " hodiny.";
                } else {
                    pridat_hodiny = "právě je " + hodiny + " hodin.";
                }
                
                System.out.println("Dobré ráno, " + pridat_hodiny);
            } else if (hodiny > 12) {
                System.out.println("Dobré odpoledne, právě je " + hodiny + " hodin.");
            } else {
                System.out.println("Dobré poledne.");
            }
        } else {
            System.out.println("Nemáš platný čas.");
        }
    }
    
}
