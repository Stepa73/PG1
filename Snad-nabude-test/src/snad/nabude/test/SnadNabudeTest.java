/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snad.nabude.test;
import java.util.*;
/**
 *
 * @author stopk
 */
public class SnadNabudeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1234545; //operátor přiřazení
        float f = i;
        double j =(int) f;
     
     System.out.println(i);
     System.out.println(j);
                
    int x,y,z;
    x = y = z = 5;
    System.out.println("x =" +x+ "y =" +y+ "z =" +z);
    y=6;
    z+=5;
    System.out.println("x = " + x+ ",y = " +y+ ",z = " +z);
    x=y * ++y;
    System.out.println("x = " +x+ ",y = " +y+ "z = " +z);
    x= z * z++;
    System.out.println("x = " +x+ ",y = " +y+ ",z = " +z);
    
    int[] pole = {5,7,9,1,4,11};
    int index = 0;
    //System.out.println(pole[index++]);
    //System.out.println(pole[++index]);
    
    while (index < pole.length)
        //System.out.println(pole[++index]);
    System.out.println(pole[index++]);
    
    byte b = (byte)255;
    System.out.println(b);
    
    int cislo = 71;
    float cisloF = cislo;
    int vysledekI = cislo /4;
    //float vysledekF = cislo /4;
    int vysledekF = (int) (cisloF/4);
    int modulo = cislo % 4;
    
    
    System.out.println(vysledekI + " zbytek " + modulo);
    System.out.println(vysledekF);
    
    int g = 5;
    int h;
    if(g == (h = 3))
    { System.out.println("ANO g=" + g + " h=" + h );
    
    }
    else{
    System.out.println("NE g=" + g + " ,h=" +h);
    
            
    }
    boolean T = true/*false*/, F;
    if(T ==(F = false)){
    System.out.println("ANO");
    }else{
    System.out.println("NE");
    }
    
    boolean maDite = false;
    float vekDitete = 0;
    int plat = 20000;
    if(maDite == true && vekDitete <18 && maDite);
    
    
    
    
    }
    
}
