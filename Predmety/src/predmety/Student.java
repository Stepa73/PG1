/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predmety;


public class Student extends Osoba {
    private String trida;
    private String studentskeCislo;
    
    
    
    public void setTrida(String trida) {
        this.trida = trida;
    }
    
    public void setStudentskeCislo(String studentskeCislo) {
        this.studentskeCislo = studentskeCislo;
    }
    
    public String getTrida() {
        return this.trida;
    }
    
    public String getStudentskeCislo() {
        return this.studentskeCislo;
    }
    
    public int getVek() {
        // super.rodneCislo;
        return 0;
    }
@Override
    public String predstavSe(){
        return super.predstavSe() + "a chodí do třídy" + this.trida;
}

}
