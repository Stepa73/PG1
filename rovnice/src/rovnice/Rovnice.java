

package rovnice;
import java.util.*;

/**
 *
 * @author stopk
 */
public class Rovnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Zvol si výpočet a) Obdelník b) Kruh c) Trojúhelník \n(vždy vol jen a,b nebo c)");
       String rovnice = sc.nextLine();
      
      switch (rovnice){
     
          case "a":{
      System.out.println("-------OBDELNIK--------");
      System.out.println("Zadej A u obdelník.");
        int a = sc.nextInt();
      System.out.println("Zadej B u obdelníku.");
        int b = sc.nextInt();
        
      Obdelnik obd = new Obdelnik (a, b);
      
      System.out.println("obsah je: " + obd.obsah() + " cm2");
      System.out.println("obvod je: " + obd.obvod()+ " cm");
       break;}
       case "b" :{   
      System.out.println("-------KRUH--------");
      System.out.println("Zadej poloměr u kruhu.");
        int polomer = sc.nextInt();
        Kruh krh = new Kruh (polomer);
        
      System.out.println("obsah je: " + krh.obsah() + " cm2");
      System.out.println("obvod je: " + krh.obvod()+ " cm");
      break;}
       case "c":{
      System.out.println("-------TROJÚHELNÍK--------");
      System.out.println("Zadej stranu a u trojúhelníku.");
       double ak = sc.nextDouble();
      System.out.println("Zadej stranu b u trojúhelníku.");
        double bk = sc.nextDouble();
      System.out.println("Zadej stranu c u trojúhelníku.");
        double ck = sc.nextDouble();
      
       Trojuhelnik tro = new Trojuhelnik (ak, bk, ck);
        
        
      System.out.println("obsah je: " + tro.obsah() + " cm2");
      System.out.println("obvod je: " + tro.obvod()+ " cm");
      if(ak+bk>ck && ak+ck>bk && bk+ck>ak){
      System.out.println("Zadané rozměry u trojúhelníku byli sprívně.");
      }
      else {
      System.out.println("Zadané rozměry u trojúhelníku jsou špatně tdíž i výpočet. U trojúhelníku platí, že součet jakých koliv dvou stran v trojúhelníku musí být větší než třetí strana.");
      }
    break;}
       default : { System.out.println("Špatná odpověď pro příště odpovídej pouze malími písmeny a,b nebo c");}  
       }
    }
}
