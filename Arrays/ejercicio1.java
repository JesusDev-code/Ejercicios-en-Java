/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasounidad5;

/**
 *
 * @author er_pi
 */
public class ejercicio1 {

    public static void main(String[] args) {
        /*Actividad 1.
Diseñar un programa que cree una tabla de longitud 10 que se inicializará con números
aleatorios comprendidos entre 1 y 100. Mostar la suma de todos los números que se guardan en
la tabla.*/
        //Valores
        int numero[]=new int[10],suma=0;
        
        for(int i=0;i<numero.length;i++){
            numero[i]=(int)(Math.random()*100)+1;
        }
        for(int i=0;i<numero.length;i++){
            suma=suma+numero[i];
        }
        System.out.println("Le suma total es: "+suma);
    }
}
