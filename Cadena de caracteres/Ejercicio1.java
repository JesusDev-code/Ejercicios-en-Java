package com.mycompany.ejerciciounidad6repaso;
/**
 *
 * @author Jesus
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        /*Actividad 1.
Escribir un programa que muestre todos los caracteres Unicode junto a su Code Point, cuyo valor
esté comprendido entre \u0000 y \uFFFF.*/
        //bucle 
        for(int i='\u0000';i<='\uFFFF';i++){
            System.out.println(i);
        }
    }
}