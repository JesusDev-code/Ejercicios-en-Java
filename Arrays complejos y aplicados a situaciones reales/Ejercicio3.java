package com.mycompany.enunciados_refuerzosu5;

import java.util.Random;

/**
 *
 * @author er_pi
 */
public class Ejercicio3 {
     static public void main(String[] args){
        /*Actividad 3.
        Modifica la actividad anterior para que la función no modifique la tabla que se pasa como
        parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han desordenado los
        valores de los elementos.*/
         /*Actividad 2.
        Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos
        contenidos en la tabla t. si la tabla estuviera ordenada, dejaría de estarlo.*/
        //valores
        int tabla[]={1,2,3,4,5,6};
        desordenar(tabla);
        
    }
      static void desordenar(int t[]){
         Random random = new Random();
         int j=0;
         int temp=0;
         int provisional[]=new int[t.length];
         System.arraycopy(t, 0, provisional, 0, t.length);
         
        for (int i = t.length - 1; i > 0; i--) {
            j = random.nextInt(i + 1);
            // Intercambiamos los elementos en las posiciones i y j
            temp = provisional[i];
            provisional[i] = provisional[j];
            provisional[j] = temp;
        }
       for(int aro:provisional){
           System.out.println(aro);
       }
   }
}
