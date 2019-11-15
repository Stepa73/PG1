/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukolc3;
import java.util.*;
/**
 *
 * @author stopk
 */
public class Ukolc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Zadej znaky?");
       String s1 = sc.nextLine();
       String vystup = null;
                    if (s1.endsWith("L")||(s1.endsWith("l"))){
                    vystup = s1.toLowerCase();
                }
                else if (s1.endsWith("U")||(s1.endsWith("u"))){
               vystup = s1.toUpperCase();
                }
               else if (s1.endsWith("X")||(s1.endsWith("x"))){

                   StringBuffer s = new StringBuffer(s1);
                        for (int i = 0; i < s.length(); i++){
                            char a = s.charAt(i);
                            if (Character.isLowerCase(a)){
                                    s.setCharAt (i, Character.toUpperCase(a));}
                            else { 
                                    s.setCharAt(i, Character.toLowerCase(a));

                                    }
                        vystup = s.toString();
                        }}

               else{
                  vystup = "Chyba nekončí na X, L, U";
              
               }
                System.out.println(vystup);
            }
            }
    

