import java.util.*;

public class Array2d {

    public static void main(String[] agrs){
        int sloupec = 0;//pointer na nachazející se sloupec
        int pocetSloupcu;
        int radek = 0;//pointer na nachazející se řádek
        int pocetRadku;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej počet sloupců (int)");
        pocetSloupcu = sc.nextInt();

        System.out.println("Zadej počet řádků (int)");
        pocetRadku = sc.nextInt();

        int pole[][] = new int[pocetSloupcu][pocetRadku];


        while (radek < pocetRadku){

            while (sloupec < pocetSloupcu){
                System.out.println("Zadej hodnotu se souřadnicí pole["+sloupec+"]["+radek+"]");
                pole[sloupec][radek] = sc.nextInt();
                sloupec++;
            }

            radek++;
            sloupec = 0;
        }

        System.out.print(vypis(pole));


    }


    public static String vypis(int[][] pole){
        String vypis = "";
        for (int[] element: pole){
            vypis += "[";
            for (int elementb: element){
                vypis += " "+elementb+" ";
            }
            vypis += "]\n";
        }
        return vypis;
    }




}
