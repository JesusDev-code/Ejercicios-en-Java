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
public class ejercicio12 {
    static public void main(String[] args){
        /*Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci.
De esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie; es decir:
• Fibonacci(n)=Fibonacci(n-1) + Fibonacci(n-2).
• Fibonacci(0)=1
• Fibonacci(1)=1*/
        //Valores
        int numero,resultado;
        //Adquisición de datos
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame un numero:");
        numero =sc.nextInt();
        resultado=fibo(numero);
        System.out.println("El resultado es "+resultado);
        
    }
    static int fibo(int valor){
        if(valor==0){
            return 1;
        }
        if (valor==1){
            return 1;
        }
        return fibo(valor-1)+fibo(valor-2);
    }
    
}
