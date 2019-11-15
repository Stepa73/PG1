/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkouška;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Zkouška {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Zadej jméno hrdiny");
        String jméno = sc.nextLine();
        
        System.out.println("Vítej ve hře "+ jméno.toUpperCase() + ". Teď si zvol povolání a) lučišník b) Rytíř c) Mág \n(vždy vol jen a,b nebo c)");
        
        String povolání = sc.nextLine();
        switch(povolání) {
            case "a":{
            System.out.println("Vybral jsis Lučišníka \nStaty:\tživoty = 10hp \n\tútok = -0,5hp/střela\n\t");
                
                break;
            } 
             case "b":{
            System.out.println("Vybral jsis Rytíře \nStaty: \tživoty = 20hp\n\tútok = -0,25hp/uder\n\t");
                
                break;  
           
        } 
         case "c":{
            System.out.println("Vybral jsis Mága \nStaty: \tživoty = 7hp\n\tútok = -1hp/hod\n\t");
                
                break;    
        }
         default:{
        System.out.println("Špatná odpověď pro příště odpovídej pouze malími písmeny a,b nebo c");
        
            break;
        } 
}
    
    
    
    
    
    
    }}
