/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author stopk
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[][] a =new int[4][];
    for (int i = 0; i < a.length; i++){
        a[i] = new int [i + 1];
        for (int j = 0; j < a[i].length; j++){
            a[i][j] = i * 10 + j;
            System.out.print(a[i][j]+"  ");
        }
    System.out.println();
    }
    }
    
}
