/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prvocislo;

import java.util.*;

/**
 *
 * @author stopk
 */
public class Prvocislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Zadej spodní hranici");
        int spodni = sc.nextInt();

        System.out.println("Zadej horni hranici");
        int horni = sc.nextInt();

        for (;spodni < horni; spodni++){

            if (prvocislo(spodni)){
                System.out.println(spodni);
            }

        }
    }

    static boolean prvocislo (int spodni){

        int i,m=0;
        m=spodni/2;
        if(spodni==0||spodni==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(spodni%i==0){
                    return false;
                }
            }
            return true;
        }

    }

}
