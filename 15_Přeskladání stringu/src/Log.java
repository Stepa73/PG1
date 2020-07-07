/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * @author stopk
 */


public class Log {
    private String retezec;
    private String retezecPrev;
    private int delka;

    public Log(String retezec) {
        this.retezec = retezec;
        this.delka = delka(this.retezec);
        this.retezecPrev = zpracuj(this.retezec);
    }

    private int delka(String a) {
        return a.length();
    }

    private String zpracuj(String a) {
        String pom = "";
        String[] slova = a.split(" ");
        for (int i = 0; i < slova.length; i++) {
            char[] znaky = slova[i].toCharArray();
            for (int j = znaky.length - 1; j >= 0; j--) {
                pom += znaky[j];
            }
            pom += " ";
        }
        return pom;
    }

    public String toString() {
        return "zadaný řetězec: "+this.retezec+", délka řetězce je "+this.delka+", upravený řetězec: "+this.retezecPrev;
    }

    public static void main(String[] args) {
        Log info = new Log("ABC FGH");


        System.out.println(info);
    }


}
