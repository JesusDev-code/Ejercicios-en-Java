/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;

/**
 *
 * @author er_pi
 */
public class ejercicio7 {
    static public void main(String[] args){
        /*Actividad 7.
        Definir una función que tome como parámetros dos tablas, la primera con los 6 números de una
        apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la combinación ganadora.
        Debes devolver el número de aciertos.*/
        //valores
        int ganadora[]={52,1,98,23,75,6};
        int apuesta[]={1,96,75,6,56,74};
        int resultado=aciertos(ganadora,apuesta);
        System.out.println("Has acertado: "+resultado+ " otra vez sera cojoneh.");
    }
    static int aciertos(int valor[],int valor2[]){
        int aciertos=0;
        for(int i=0;i<valor.length;i++){
            for(int j=0;j<valor2.length;j++){
                if(valor[i]==valor2[j]){
                    aciertos++;
                    
                }
            }
        }
        return aciertos;
    }
 

}
