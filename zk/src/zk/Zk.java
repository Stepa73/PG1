/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zk;

import java.util.*;
/**
 *
 * @author Petr
 */
public class Zk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner numsc = new Scanner (System.in);
    
    
    System.out.println("kolik bude čísel");
    int numberCount = numsc.nextInt();
    
    int[] numbers = new int [numberCount];
    
    for (int i = 0; i < numberCount; i++) {
        numbers[i] = numsc.nextInt();
    }
            String writeRow = "";
            for (int i = 0; i < numberCount; i++) {
                if(i< numberCount - 1)
                    writeRow= writeRow + numbers[i] + '\t';
                else    
                    writeRow= writeRow + numbers[i] + '\n';
            }
            System.out.print(writeRow);
            int min = numbers[0];
            for (int i = 0;i < numberCount; i++){
       if (min > numbers[i]){
         min = numbers[i];
       }
     
    }
    
    System.out.println("Nejmenší číslo z pole je " + min);
    }
    
}
