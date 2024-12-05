package com.mycompany.enunciadoscompletosu5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        /*Actividad 1.
        Diseñar un programa que cree una tabla de longitud 10 que se inicializará con números
        aleatorios comprendidos entre 1 y 100. Mostar la suma de todos los números que se guardan en
        la tabla.*/
        //Valores
        int tabla[]=new int[10];
        int aleatorio=0;
        for(int i=0;i<tabla.length;i++){
            aleatorio=(int)(Math.random()*100+1);
            tabla[i]=aleatorio;
        }
        System.out.println("Los numeros son: ");
        for(int imprimir:tabla){
            System.out.println(imprimir);
        }
    }
}
