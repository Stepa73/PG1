/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectení.dvou.polí;
import java.util.*;
/**
 *
 * @author stopk
 */
public class SecteníDvouPolí {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] prvniMatice = nacti2dPole();
       
       int[][]druhaMatice = nacti2dPole();
       
       int[][] vyslednaMatice = secti2dPole(prvniMatice, druhaMatice);
       
       vypis2dPole(vyslednaMatice);
    }
    

static int[][] nacti2dPole() { 
Scanner sc = new Scanner (System.in);

int pocetRadku, pocetSloupcu;

System.out.println("zadej počet řádků:");
pocetRadku = sc.nextInt();

System.out.println("zadej počet sloupců:");
pocetSloupcu = sc.nextInt();

int[][] pole = new int[pocetRadku][pocetSloupcu];

for (int i = 0; 1 < pocetRadku; i++) {
    for (int j = 0; j < pocetSloupcu; j++){
        System.out.println("zadej hodnotu na indexu [" +1+", "+j+"]");
        pole[i][j] = sc.nextInt();
    }
}
return pole;
}
static void vypis2dPole(int[][] pole) {
    int pocetRadku = pole.length;
    
    for (int i=0; i < pocetRadku; i++){
        int pocetSloupcu = pole[i].length;
        
    for (int j=0; j < pocetRadku; j++){
        System.out.println(pole[i][j]+"\t");
    }
    System.out.println();
}
}
static int[][] secti2dPole(int [][] prvniPole, int[][] druhePole){
    int pocetRadku = prvniPole.length;
    
    int[][] vyslednePole = new int [pocetRadku][];
    
    for (int i = 0; i < pocetRadku; i++) {
        int pocetSloupcu = prvniPole[i].length;
        
        vyslednePole[i] = new int [pocetSloupcu];
    for (int j=0; j< pocetSloupcu; j++){
        vyslednePole[i][j] = prvniPole[i][j] + druhePole[i][j];
    }  
    }
return vyslednePole;
}


}
