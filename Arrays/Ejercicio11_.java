/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;
import java.util.Scanner;
/**
 *
 * @author er_pi
 */
public class Ejercicio11_ {
    static public void main(String[] args){
        /*Actividad 11.
Escribir la función: int[] eliminarMayores(int t[], int valor), que crea y devuelve una copia de la
tabla t donde se han eliminado todos los elementos que son mayores que valor.*/
        //Valores
        int t[]={10,36,58,87};
        int valor;
        int resultado[];
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un valor:");
        valor =sc.nextInt();
        System.out.println("El valor minimo e igual de "+valor+ " es :");
        resultado=eliminarMayores(t,valor);
        
        for(int resultadoh:resultado){
            System.out.println(resultadoh);
        }
        
    }
    static int[] eliminarMayores(int t[], int valor){
        int contador=0;
        for(int i=0;i<t.length;i++){
            if(t[i]<=valor){
                contador++;
            }
        }
        int resultado[]=new int[contador];
        int posicion=0;
        for(int i=0;i<t.length;i++){
            if(t[i]<=valor){
                resultado[posicion]=t[i];
                posicion++;
            }
        }
        return resultado;
    }
}
