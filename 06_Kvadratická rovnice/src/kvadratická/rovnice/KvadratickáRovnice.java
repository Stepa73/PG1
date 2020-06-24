/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kvadratická.rovnice;
import java.util.*;
/**
 *
 * @author stopk
 */
public class KvadratickáRovnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("zadej A");//napověda CTRL+MEZERNÍK
        double a;
        a = sc.nextDouble();

        System.out.println("zadej B");
        double b;
        b = sc.nextDouble();

        System.out.println("zadej C");
        double c;
        c = sc.nextDouble();

        double D = dikriminant(a, b, c);
        double koreny[] = vypocti(a, b, D);

        int vel = koreny.length;
        if (vel == 2){
            System.out.println("Rovnice má dvě řešení. x1 = "+koreny[0]+", x2 = "+koreny[1]);
        }else if (vel == 1){
            System.out.println("Rovnice má jedno řešní. x1 = "+koreny[0]);
        }else {
            System.out.println("Rovnice nemá řešení.");
        }

    }

    static double dikriminant (double a, double b, double c){

        double pocetReseni = (byte) (b*b-4*a*c);
        return pocetReseni;
    }

    static final double[] NO_KOREN = {}; //?? zjistit jak to funguhe
    static double[] vypocti (double a, double b, double D){

        if (D < 0){
            return NO_KOREN;
        }
        else if (D == 0){
            //double vysledek = -b/(2*a);
            double[] v = {(-b)/(2*a)};
            return v;
        }
        else {
            //double vysledekA = (-b+Math.sqrt(D))/(2*a(;
            //double vysledekB = (-b-Math.sqrt(D))/(2*a);
            double[] v = {(-b+Math.sqrt(D))/(2*a), (-b-Math.sqrt(D))/(2*a)};
            return v;
        }

    }

}



