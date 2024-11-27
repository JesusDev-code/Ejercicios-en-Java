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
public class ejercicio11 {
    static public void main(String[] args){
        /*Diseñar una función que calcule an

, donde a es real y n es un entero no negativo. Realizar una

versión iterativa y otra recursiva.*/
        //Valores
        int numero;
        double a,resultado;
        //Adquisición de datos
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame un numero: ");
        a =sc.nextDouble();
        System.out.println("Dame ahora el numero con el que quieres que se nultiplique X veces: ");
        numero= sc.nextInt();
        resultado=recursiva(a,numero);
        
        System.out.println("El resultado es: "+resultado);
        
    }
    static double iterativa(double valor1,int valor2){
        double resultado=1;
        for(double i=1;i<=valor2;i++){
            resultado*=valor1;
        }
        return resultado;
    }
    static double recursiva(double valor1,int valor2){
        if(valor2==0){
            return 1;
        }
        return valor1*recursiva(valor1,valor2-1);
    }
    
}
