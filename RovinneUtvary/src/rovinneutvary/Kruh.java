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
public class Kruh extends RvinnýÚtvar{
    private double r;
    public Kruh(double r ){
        this.r=r;
        
    }
    @Override
    public double obvod(){
        return 2 * Math.PI * r;
    }
     @Override
    public double obsah(){
        return Math.PI * r*r;
    }
}