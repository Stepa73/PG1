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
public class Kruh {
    public double polomer;

public Kruh (double polomer){
this.polomer = polomer;
}
public double obvod() {
double pom1;
pom1 = 2*Math.PI*polomer;
return  pom1;
}
public double obsah(){
return (Math.PI * polomer * polomer);
}


}