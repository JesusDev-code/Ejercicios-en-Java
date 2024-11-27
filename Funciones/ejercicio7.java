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
public class ejercicio7 {
    static public void main(String[] args){
        /*Desarrollar un programa que reciba un número entero y devuelva el número de divisores primos
que tiene. Nota: haced uso de la función anterior.*/
        //Valores 
        int numero,contadordivisores;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero entero");
        numero = sc.nextInt();
        
        contadordivisores=contador(numero);
        System.out.println("El numero "+ numero +" tiene "+contadordivisores +" divisores ");
        
    }
    static int contador(int valor){
        int contador=0;
        for (int i = 2; i <= valor; i++) {
            if (valor % i == 0) { // Verificamos si 'i' es un divisor de 'valor'
                if (primoh(i)) { // Verificamos si 'i' es primo
                    contador++; // Incrementamos el contador
                }
            }
        }
        return contador;
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
        return true;
        
    }
    
    
}
