/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predmety;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Program {
    static Scanner sc;
    static{
    Program.sc = new Scanner(System.in);
    }

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        final int POCET_PREDMETU = 3;
        
       Predmet[] predmety = new Predmet[POCET_PREDMETU];
        Predmet novyPredmet;
       /* for (int i = 0; i < POCET_PREDMETU; i++) {
           Vyucujici garant = new Vyucujici();
            
            System.out.println("Jméno garanta: ");
            garant.setJmeno(sc.next()); // nastaví garantovi jméno ze vstupu od uživatele
            
            System.out.println("Kód zaměstnance garanta: ");
            garant.setKodZamestnance(sc.next()); // nastaví garantovi kód zaměstnance ze vstupu od uživatele
            
            novyPredmet = new Predmet(garant);
            
            System.out.println("Zkratka předmětu: ");
            novyPredmet.setZkratka(sc.next()); // nastaví předmětu zkratku podle vstupu uživatele
            
            System.out.println("Název předmětu: ");
            novyPredmet.setNazev(sc.next()); // nastaví předmětu název podle vstupu uživatele
            
            predmety[i] = novyPredmet;
    

        Student prvniStudent = new Student();

        prvniStudent.setStudentskeCislo("s451fds15sdf14");
        prvniStudent.setTrida("1. F");
        prvniStudent.setJmeno("Michal ŠMAHEL");
        prvniStudent.setRodneCislo("010704/3200");

        Student druhyStudent = new Student();

        druhyStudent.setStudentskeCislo("g15f1s315fd21");
        druhyStudent.setTrida("1. F");
        druhyStudent.setJmeno("Ondřej Cach");
        druhyStudent.setRodneCislo("010713/3200");

        Vyucujici garant = new Vyucujici();
        garant.setJmeno("Libor Bajer");

        Predmet predmet = new Predmet(garant);

        predmet.pridatStudenta(prvniStudent);
        predmet.pridatStudenta(druhyStudent);

        System.out.println(predmet.getStudenti());

        predmet.odebratStudenta(prvniStudent);

        System.out.println(predmet.getStudenti());
    }*/ 
       Osoba[] osoby = new Osoba[3];
       
        
       
       
     for (int i = 0; i< 3; i++){
         System.out.println("Co budeme zadávat ? \n\t1 Osoba \n\t2 Studenta \n\t3 vyucujiciho");
         byte volba = Program.sc.nextByte();
         switch (volba) {
         case 2: osoby[i] = nactiStudenta();
            break;
         case 3: osoby[i] = nactiVyucujiciho();
            break;
         default: osoby [i] = nactiOsobu();
            break;
     }
     }               
       for (int i = 0; i< 3; i++){
       System.out.println(osoby[i].predstavSe());
       }            
                    
                    }
            static Vyucujici nactiVyucujiciho() {
            Vyucujici vyucujici = new Vyucujici();
            
            System.out.println("Jméno vyucujícího");
            vyucujici.setJmeno(Program.sc.next());
            System.out.println("Kod zamnestnance");
            vyucujici.setKodZamestnance(Program.sc.next());
            return vyucujici;
           


}
 static Student nactiStudenta() {
            Student student = new Student();
            
            System.out.println("Jméno studenta");
            student.setJmeno(Program.sc.next());
            System.out.println("Třída:");
            student.setTrida(Program.sc.next());
            return student;
            

}    
static Osoba nactiOsobu() {
Osoba osoba = new Osoba(); 
System.out.println("Jméno osoby: ");
osoba.setJmeno(Program.sc.next());
return osoba;
}

}
