/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rovinneutvary;

/**
 * @author GAZi
 */
public class Obdelnik extends RovinnyUtvar {
    private double a, b;

    public Obdelnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obvod() {
        return 2 * (a + b);
    }

    @Override
    public double obsah() {
        return a * b;
    }
}
