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
public class ejercicio10 {
    static public void main(String[] args){
        /*Implementar una aplicación que calcule el factorial de un número usando la recursividad.*/
        //Valores
        int numero,resultado;
        //Adquisición de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero y te daré su factorial: ");
        numero = sc.nextInt();
        
        resultado= factorial(numero);
        System.out.println("El factorial de "+numero+" es "+resultado);
        
    }
    static int factorial(int valor){
        int resultado;
        if(valor==0){
            resultado= 1;
        }
        else{
            resultado=valor*factorial(valor-1);
        }
        return resultado ;
    }
    
}
