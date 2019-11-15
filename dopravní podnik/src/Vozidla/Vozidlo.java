/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vozidla;

/**
 *
 * @author stopk
 */
public abstract class Vozidlo {
 private int kapacita;
 private int rokVyroby;

    /**
     * @return the kapacita
     */
    public int getKapacita() {
        return kapacita;
    }

    /**
     * @param kapacita the kapacita to set
     */
    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    /**
     * @return the rokVyroby
     */
    public int getRokVyroby() {
        return rokVyroby;
    }

    /**
     * @param rokVyroby the rokVyroby to set
     */
    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }
}
