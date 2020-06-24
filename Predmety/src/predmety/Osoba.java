/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predmety;

/**
 *
 * 
 */

public class Osoba {
    private String jmeno;
    protected String rodneCislo;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        this.rodneCislo = rodneCislo;
    }

    public String predstavSe() {
    return "Ahoj, jmenuji se " +  this.jmeno;
    
    }
}

