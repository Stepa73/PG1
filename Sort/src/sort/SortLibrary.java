package sort;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stopk
 */
public class SortLibrary {
  public static int[] mergeSort(int[] pole) {
  
  if(pole.length <= 2)
  {
      if(pole.length > 1 && pole[0] > pole [1])
      {
          int pom = pole [1];
          pole [1] = pole [0];
          pole[0] = pom;
      
      }
  return pole;
  }
 
  int indexStred = (pole.length / 2);
  int [] polePrvni, poleDruhe;
  
  polePrvni = mergeSort(Arrays.copyOfRange(pole, 0, indexStred));
  poleDruhe = mergeSort(Arrays.copyOfRange(pole, indexStred, pole.length));
 return slouciMS(polePrvni, poleDruhe);
  }  
private static int[] slouciMS(int[] polePrvni, int[] poleDruhe){
 int[] poleVysledne = new int[polePrvni.length + poleDruhe.length];
 
 
 for ( int indexVysledek = 0, indexPrvni = 0, indexDruhe = 0;
         indexVysledek < poleVysledne.leigth indexVysledek++) {
     if (polePrvni (indexPrvni) < poleDruhe[indexDruhe])(
             poleVsledne (indexVysledek ))
         )

}

   
}}