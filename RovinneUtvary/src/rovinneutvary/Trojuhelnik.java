/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rovinneutvary;

/**
 *
 * @author Tomáš
 */
public class Trojuhelnik extends RvinnýÚtvar {
    private double a, b, c, s;
    public Trojuhelnik(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.s= (a + b + c)/2;
    }
     @Override
        public double obvod(){
            return a+b+c;
        }
         @Override
        public double obsah(){
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));                  
        }
}
