/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author stopk
 */
public class Jednotka {

    public Jednotka(String nazev) {
        this.nazev = nazev;
        this.pomerNaZakladni = 1;
        this.jeZakladni = true;
    }
    
    public Jednotka(String nazev, double pomerNaZakladni) {
        this.nazev = nazev;
        this.pomerNaZakladni = pomerNaZakladni;
        this.jeZakladni = false;
    }

    public String getNazev() {
        return nazev;
    }

    public double getPomerNaZakladni() {
        return pomerNaZakladni;
    }

    public boolean isJeZakladni() {
        return jeZakladni;
    }
    
    
    String nazev;
    double pomerNaZakladni;    
    boolean jeZakladni;
    
    
    public String toString() {
        return nazev;
    }
}
