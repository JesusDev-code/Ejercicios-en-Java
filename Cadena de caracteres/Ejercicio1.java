package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
public class Ejercicio1 {
    /*Actividad 1.
Escribir un programa que muestre todos los caracteres Unicode junto a su Code Point, cuyo valor
esté comprendido entre \u0000 y \uFFFF.*/
    static public void main(String[] args){
        for(int i='\u0000';i<'\uFFFF';i++){
            System.out.println(i);
        }
    }
}
