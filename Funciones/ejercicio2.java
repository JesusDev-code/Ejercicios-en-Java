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
public class ejercicio2 {
    static public void main (String[] args){
        /*Escribir una aplicación con una función a la que se le pasen dos enteros y muestre todos sus
números comprendidos entre ellos*/
        int numero1,numero2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame un valor: ");
        numero1 =sc.nextInt();
        System.out.println("Dame un segundo valor: ");
        numero2 =sc.nextInt();
        numeroh2(numero1,numero2);
        
        
    }
    static void numeroh2(int valor1, int valor2){
         if(valor1<valor2){
              for(int i = valor1;i<valor2;i++){
            System.out.println(i+1);}
              
         }
         else{
              for(int i = valor2;i<valor1;i++){
            System.out.println(i-1);
              }
             
         }
    }
    
}
