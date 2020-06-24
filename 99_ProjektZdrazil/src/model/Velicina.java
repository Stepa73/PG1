/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author stopk
 */
public class Velicina {

    public Velicina(Jednotka zakladniJednotka) {
        this.zakladniJednotka = zakladniJednotka;
    }
    
    
    Jednotka zakladniJednotka;
    List<Jednotka> ostatniJednotky = new ArrayList<>();
    
    public void pridejJednotku(Jednotka jednotka) {
        ostatniJednotky.add(jednotka);
    }
}
