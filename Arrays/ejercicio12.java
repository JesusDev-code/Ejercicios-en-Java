/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;

/**
 *
 * @author er_pi
 */
public class ejercicio12 {
    static public void main(String[] args){
        /*Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma: el elemento de
        la posición[n][m] debe contener el valor 10*(n+m). Mostrad después su contenido.*/
        //valores
        int tabla [][]=new int[5][5];
        
        for(int n=0;n<5;n++){
            for(int m=0;m<5;m++){
                tabla[n][m]= 10*(n+m);
                
            }
        }
        //for each para bidimensionelh
        for(int []fila:tabla){
            for(int elemento:fila){
                System.out.println(elemento+" ");
            }
        }
        System.out.println("");
    }
}
