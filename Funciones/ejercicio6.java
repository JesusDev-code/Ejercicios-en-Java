/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciounidad4;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class ejercicio6 {
    static public void main(String[] args){
        /*Actividad 6.
Desarrolla un programa que indique si un número “n” es primo o no.
        
Pasos para saber si un número es primo:
Un número menor que 2 no es primo (el número primo más pequeño es 2).
El número 2 es primo (es el único número par que es primo).
Para otros números, tienes que verificar si tienen algún divisor distinto de 1 y de sí mismo.*/
        //Valores
        int numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero y te diré si es primo o no: ");
        numero = sc.nextInt();
        if(primoh(numero)){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
        
        
    }
    static boolean primoh(int valor){ 
         boolean resultado=true;
        if(valor<2){
            resultado=false;
           
        }
        if(valor==2){
            resultado=true;
        }
        if(valor>2){
           
            for(int i=2;i<=Math.sqrt(valor);i++){   // Sería desde 2 hasta la raiz cuadrada del numero
                if(valor%i==0){                    // Si el numero dado al dividirlo con 2 es 0 no es primo porque hay más de 2
                    resultado=false;
                }
            }
        
        }
        return resultado;
        
    }
    
}
