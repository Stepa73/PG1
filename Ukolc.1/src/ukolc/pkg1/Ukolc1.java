/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukolc.pkg1;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Ukolc1 {
   
       public static void main(String[] args) {
        System.out.println("Napiš polovinu slova "); 
        
        Scanner sc = new Scanner(System.in); 
        
        String i = sc.nextLine(); 
        
        StringBuffer b = new StringBuffer(i);
        
        b.reverse(); 
        
        b.deleteCharAt(0);
        
        System.out.println(i + b); 
    }
}
    
    

