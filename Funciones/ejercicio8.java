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
public class ejercicio8 {
    static public void main(String[] args){
        /*Actividad 8.
Implementar una aplicación que se denomine calculadora(), a la que se le pasan dos números
reales (operandos) y qué operación se desea realizar con ellos.
Las operaciones disponibles son: 1 para la suma, 2 para la resta, 3 para la multiplicación y 4 para
la división.
La función devolverá el resultado de la operación mediante un número real.*/
        //Valores
        double numero1,numero2,resultado=0;
        int operador;
        //Adquisición de numeros
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame un numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Dame otro numero: ");
        numero2 = sc.nextDouble();
        System.out.println("¿que calculos quieres realizar?");
        System.out.println("1-suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        operador =sc.nextInt();
        //calculos
        switch(operador){
                case 1:
                    resultado=suma(numero1,numero2);
                    System.out.println("El resultado de tu suma es "+resultado);
                    break;
                case 2:
                    resultado=resta(numero1,numero2);
                    System.out.println("El resultado de tu resta es "+resultado);
             
                    break;
                case 3:
                    resultado=multi(numero1,numero2);
                    System.out.println("El resultado de tu multiplicacion es "+resultado);
                    break;
                case 4 :
                    resultado=divi(numero1,numero2);
                    System.out.println("El resultado de tu division es "+resultado);
                    break;
                    
                default:
                    System.out.println("Comando erroneo");
                    break;
                
            } 
        
    }
    static double suma(double valor1,double valor2){
        double resultado;
        resultado=valor1+valor2;
        return resultado;
    }
       static double resta(double valor1,double valor2){
        double resultado;
        resultado=valor1-valor2;
        return resultado;
    }
          static double multi(double valor1,double valor2){
        double resultado;
        resultado=valor1*valor2;
        return resultado;
    }
             static double divi(double valor1,double valor2){
        double resultado;
        resultado=valor1/valor2;
        return resultado;
    }
    
}
