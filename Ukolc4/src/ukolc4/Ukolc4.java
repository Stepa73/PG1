/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukolc4;
import java.util.*;

/**
 *
 * @author stopk
 */
public class Ukolc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Zadej počet desetinných míst: ");
     Scanner sc = new Scanner (System.in);
    
     
        StringBuffer b;
       double x = Math.PI;
       String x1 = Double.toString(x);
        b = new StringBuffer(x1);
        String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11;
        String pocetMist = sc.nextLine();
        s1=b.toString();
        s2=b.substring(0,4);
         s3=b.substring(0,5);
          s4=b.substring(0,6);
           s5=b.substring(0,7);
            s6=b.substring(0,8);
             s7=b.substring(0,9);
              s8=b.substring(0,10);
               s9=b.substring(0,11);
               s11=b.substring(0,2);
               s10=b.substring(0,12);
        switch (pocetMist) {
           case "0":{
        System.out.println("3");
            break;
        }
             case "1":{
        System.out.println(s11);
            break;
        }
               case "2":{
        System.out.println(s2);
            break;
        }
                       case "3":{
        System.out.println(s3);
            break;
        }  
               case "4":{
        System.out.println(s4);
            break;
        }
                   case "5":{
        System.out.println(s5);
            break;
        }
                     case "6":{
        System.out.println(s6);
            break;
        }
                       case "7":{
        System.out.println(s7);
            break;
        }
                         case "8":{
        System.out.println(s8);
            break;
        }
                           case "9":{
        System.out.println(s9);
            break;
        }
                             case "10":{
        System.out.println(s10);
            break;
        }
                             default:{
                                 System.out.println(Math.PI);
       
            break;
        }      
       
        }}}
