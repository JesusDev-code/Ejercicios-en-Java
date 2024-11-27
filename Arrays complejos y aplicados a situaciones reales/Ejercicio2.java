/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enunciados_refuerzosu5;

import java.util.Random;

/**
 *
 * @author er_pi
 */
public class Ejercicio2 {
     static public void main(String[] args){
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
        for (int i = t.length - 1; i > 0; i--) {
            j = random.nextInt(i + 1);
            // Intercambiamos los elementos en las posiciones i y j
            temp = t[i];
            t[i] = t[j];
            t[j] = temp;
            
        }
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]+" ");
        }
   }
}
