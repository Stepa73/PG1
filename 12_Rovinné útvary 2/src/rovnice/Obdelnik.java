/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rovnice;

/**
 * @author GAZi
 */
public class Obdelnik {
    public int sirka;
    public int vyska;

    public Obdelnik(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public int obvod() {
        int pom;
        pom = 2 * (sirka + vyska);
        return pom;
    }

    public int obsah() {
        return (sirka * vyska);
    }


}
