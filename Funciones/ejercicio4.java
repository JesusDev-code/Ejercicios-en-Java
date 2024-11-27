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
public class ejercicio4 {
    static public void main(String[] args){
        /*Diseñar una función que recibe como parámetro dos números enteros y devuelve el máximo de
ambos.*/
        //valores
        int numero1, numero2;
        
        //Obtención de datos
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame un numero: ");
        numero1 = sc.nextInt();
        System.out.println("Dame un segundo numero");
        numero2 = sc.nextInt();
        
        numeromayor(numero1,numero2);
        
    }
    static void numeromayor(int valor1,int valor2){
       if(valor1<valor2){
           System.out.println("El numero máximo es: "+ valor2);
       }
       else{
           System.out.println("El numero máximo es: "+valor1);
       }
    }
    
}
