/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;

/**
 *
 * @author er_pi
 */
public class ejercicio8 {
    static public void main(String[] args){
        /*Actividad 8.
Implementar una función: int[] sinRepetidos(int t[]), que construye y devuelve una tabla de la
longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos.*/
        int t[]={1,2,2,3,4,4,5,5,6};
        int resultado[];
        resultado=sinRepetidos(t);
        for(int rep:resultado){
            System.out.println(rep);
        }
    }
    static int [] sinRepetidos(int t[]){
        int provisional[]=new int[t.length];
        int norep=0;
        boolean repetido=false;
        for(int i=0;i<t.length;i++){
            repetido=false;
            for(int j=0;j<norep;j++){
                if(t[i]==provisional[j]){
                    repetido=true;
                }
            }
            if(!repetido){
                    provisional[norep]=t[i];
                    norep++;
                }
        }
         int resultado[] = new int[norep]; // este arreglo tendrá solo los números no repetidos
        for(int i=0; i<norep; i++){
            resultado[i] = provisional[i];
            }
         return resultado;
    }
}