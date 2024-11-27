/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;

/**
 *
 * @author er_pi
 */
public class ejercicio5 {
    static public void main(String[] args){
        /*Actividad 5.
        Crear una función int maximo(int t[]), que devuelva el valor máximo (mayor) de los elementos*/
        //Valores
        int numero[]={8,4,6,2,9},resultado=0;
        resultado=maximo(numero);
        System.out.println("El resultado maximo es: "+resultado);
        
        
    }
    static int maximo(int t[]){
        int mayor=0;
        for(int i=0;i<t.length;i++){
            if(t[i]>mayor){
                mayor=t[i];
            }
        }
        return mayor;
    }
}
