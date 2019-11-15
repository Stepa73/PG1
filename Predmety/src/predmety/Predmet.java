/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predmety;



import java.util.Arrays;


public class Predmet {
    private String zkratka;
    private String nazev;
    private Vyucujici garant;
    private Vyucujici[] vyucujici;
    private Student[] studenti;
    
    private final int VYCHOZI_POCET = 1;
    private int indexStudentiPrvniVolny;
    private int indexVyucujiciPrvniVolny;
    
    
    
    
    public Predmet(Vyucujici garant) {
        this.garant = garant;
        this.vyucujici = new Vyucujici[VYCHOZI_POCET];
        this.studenti = new Student[12 * VYCHOZI_POCET];
        
        this.indexStudentiPrvniVolny = 0;
        this.indexVyucujiciPrvniVolny = 0;
    }
    
    public String getZkratka() {
        return this.zkratka;
    }

    public void setZkratka(String zkratka) {
        this.zkratka = zkratka;
    }

    public String getNazev() {
        return this.nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    
    public String getJmenoGaranta() {
        return this.garant.getJmeno();
    }
    
    public void pridatStudenta(Student student) {
        /*
         * V pripade, ze index volneho prvku odkazuje
         *   mimo hranice pole zvetsim
         * 
         * V kazdem pripade potom na tento index
         *   zapisu noveho studenta a navysim
         *   hodnotu indexu
         */
        if(this.indexStudentiPrvniVolny >= this.studenti.length)
            // Zvětšení pole studentů na dvojnásobek
            this.studenti = Arrays.copyOf(studenti, studenti.length * 2);
            
        this.studenti[indexStudentiPrvniVolny++] = student;
    }
    
    public void pridatVyucijiciho(Vyucujici vyucujici) {
        if(this.indexVyucujiciPrvniVolny >= this.vyucujici.length)
            this.vyucujici = Arrays.copyOf(this.vyucujici, this.vyucujici.length * 2);
        
        this.vyucujici[indexVyucujiciPrvniVolny++] = vyucujici;
        
        // Rikame vyučujícímu, aby si tento předmět přidal
        // do svého seznamu předmětů, které učí
        vyucujici.pridatPredmet(this);
    }
    
    // DÚ - odebratStudenta(), odebratVyucujiciho()

    public void odebratStudenta(Student student) {
        String hledaneStudentskeCislo = student.getStudentskeCislo();

        for (int i = 0; i < this.indexStudentiPrvniVolny; i++) {
            // Na daném indexu existuje objekt a jedná se o daného studenta
            if(this.studenti[i] != null && this.studenti[i].getStudentskeCislo() == hledaneStudentskeCislo)
                this.studenti[i] = null;
        }
    }

    public void odebratVyucujiciho(Vyucujici vyucujici) {

    }

    public String getStudenti() {
        String seznamStudentu = "";

        for (int i = 0; i < this.indexStudentiPrvniVolny; i++) {
            // Na daném indexu je objekt
            if(this.studenti[i] != null)
                seznamStudentu += this.studenti[i].getJmeno();
        }

        return seznamStudentu;
    }
}
