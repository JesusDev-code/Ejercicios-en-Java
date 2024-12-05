package com.mycompany.enunciadoscompletosu5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio12 {
        static public void main(String[] args){
        /*Actividad 12.
Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma: el elemento de
la posición[n][m] debe contener el valor 10*(n+m). Mostrad después su contenido.*/
        //Valores
        int tabla[][]=new int[5][5];
        
        for(int n=0;n<tabla.length;n++){
            for(int m=0;m<tabla.length;m++){
                tabla[n][m]=10*(n+m);
            }
        }
        for(int[]fila:tabla){
            for(int elemento:fila){
                System.out.println(elemento+" ");
            }
        }
        System.out.println(" ");
    }
}
