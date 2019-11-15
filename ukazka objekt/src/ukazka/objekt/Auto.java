/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukazka.objekt;

/**
 *
 * @author stopk
 */
public class Auto {
    private String vin;
    private String registracniZnacka;
    private int rokVyroby;
    private Motor motor;
    
    public Auto (){
        this.motor = new Motor();
    }
     public Auto (String vin, String registracniZnacka, int rokVyroby, String cisloMotoru){
        this();
        
        setVin(vin);
        setRegistracniZnacka(registracniZnacka);
        setRokVyroby(rokVyroby);
        
        motor.setCislaMotoru(cisloMotoru);
    }
    public void setVin(String vin){
    this.vin = vin;
    } 
    public void setRegistracniZnacka(String registracniZnacka){
    this.registracniZnacka=registracniZnacka;
    }
    public void setRokVyroby(int rokVyroby){
    this.rokVyroby=rokVyroby;
    }
    public String getVin(){
    return this.vin;
    }
    public String getRegistracniZnacka (){
    return this.registracniZnacka;
    }
    public int getRokVyroby(){
    return this.rokVyroby;
    }
    public void setCisloMotoru(String cisloMotoru){
    this.motor.setCislaMotoru(cisloMotoru);
    }
    public String getCisloMotoru(){
    return motor.getCislaMotoru();
    }
}
