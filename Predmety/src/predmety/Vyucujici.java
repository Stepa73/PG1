/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predmety;

import java.util.Arrays;


public class Vyucujici extends Osoba {
    private String kodZamestnance;
    private Predmet[] coUci;
    
    private final int VYCHOZI_POCET_PREDMETU = 3;
    private int indexPredmetPrvniVolny;
    
    
    
    public Vyucujici() {
        this.coUci = new Predmet[VYCHOZI_POCET_PREDMETU];
    }
    
    public void setKodZamestnance(String kodZamestnance) {
        this.kodZamestnance = kodZamestnance;
    }
    public String getKodZamestnance() {
        return this.kodZamestnance;
    }
    
    public void pridatPredmet(Predmet predmet) {
        // Funguje stejně jako metoda pridatStudenta ve třídě Predmet
        if(this.indexPredmetPrvniVolny >= this.coUci.length)
            Arrays.copyOf(this.coUci, this.coUci.length * 2);
        
        this.coUci[indexPredmetPrvniVolny++] = predmet;
    }
@Override
    public String predstavSe(){
        return super.predstavSe() + "a uci" + this.coUci.length + "predmet";
}
}
