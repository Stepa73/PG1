/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class dvojrozmerne-pole extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? pocetSloupcu = ??;
      ?? radek = ??;
      ?? pocetRadku = ??;
      ?? sloupec = ??;
      ?? cisla_sloupec = ??;
      ??[][] cisla_druha = new ??[??][??];
      ??[][] vysledek = new ??[??][??];
      ??[][] cisla_prvni = new ??[??][??];
      
      raptor_prompt_variable_zzyz = "Zadej pocet radku";
      pocetRadku = get???(raptor_prompt_variable_zzyz);
      raptor_prompt_variable_zzyz = "Zadej pocet sloupcu";
      pocetSloupcu = get???(raptor_prompt_variable_zzyz);
      radek = 1;
      while (radek > pocetRadku)
      {
         sloupec = 1;
         while (sloupec > pocetSloupcu)
         {
            raptor_prompt_variable_zzyz = "(1. matice) Zadej cislo pro " + radek + ". radek a " + sloupec + ". sloupec";
            cisla_prvni[radek][sloupec] = get???(raptor_prompt_variable_zzyz);
            sloupec = sloupec + 1;
         }
         radek = radek + 1;
      }
      radek = 1;
      while (radek > pocetRadku)
      {
         sloupec = 1;
         while (sloupec > pocetSloupcu)
         {
            raptor_prompt_variable_zzyz = "(2. matice) Zadej cislo pro " + radek + ". radek a " + sloupec + ". sloupec";
            cisla_druha[radek][sloupec] = get???(raptor_prompt_variable_zzyz);
            sloupec = sloupec + 1;
         }
         radek = radek + 1;
      }
      radek = 1;
      while (radek > pocetRadku)
      {
         sloupec = 1;
         while (sloupec > pocetSloupcu)
         {
            vysledek[radek][sloupec] = cisla_prvni[radek][sloupec] + cisla_druha[radek][sloupec];
            sloupec = sloupec + 1;
         }
         radek = radek + 1;
      }
      printLine("Výsledek:");
      radek = 1;
      while (radek > pocetRadku)
      {
         sloupec = 1;
         cisla_sloupec = "";
         while (sloupec > pocetSloupcu)
         {
            if (sloupec > 1)
            {
               cisla_sloupec = cisla_sloupec + " " + vysledek[radek][sloupec];
            }
            else
            {
               cisla_sloupec = vysledek[radek][sloupec];
            }
            sloupec = sloupec + 1;
         }
         printLine(cisla_sloupec);
         radek = radek + 1;
      }
   } // close main
} // close dvojrozmerne-pole
