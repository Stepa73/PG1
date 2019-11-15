/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rovnice;

/**
 *
 * @author stopk
 */
public class Trojuhelnik {
    public double ak;
    public double bk;
    public double ck;
 public Trojuhelnik(double ak, double bk, double ck){
 this.ak = ak;
 this.bk = bk;
 this.ck =ck;
 } 

public double obvod() {
double pom2;
pom2 = ak+bk+ck;
return pom2;
}
public double v(){
return (ak/2-Math.sqrt((ak+bk+ck)/2*((ak+bk+ck)/2-ak)*((ak+bk+ck)/2-bk)*((ak+bk+ck)/2-ck))); 
}
public double obsah() {
return ((ak*v())/2);
}


}
