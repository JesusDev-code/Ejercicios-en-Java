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
public class ejercicio9 {
    static public void main(String[] args) {
        /*Repetir la actividad correspondiente a la actividad 4; pero realizando una sobrecarga de función
y resolviendo también si introducimos 3 valores enteros, que nos calcule el mayor de ellos*/
        //valores
        int numero1,numero2,numero3,resultado=0;
        //Adquisición de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        numero1 =sc.nextInt();
        System.out.println("Dame un segundo numero: ");
        numero2 =sc.nextInt();
        System.out.println("Dame un tercer  numero: ");
        numero3 = sc.nextInt();
        
        resultado=mayor(numero1,numero2,numero3);
        
        System.out.println("El numero mayor es "+resultado);
        
        
    }
    static int mayor(int valor1,int valor2){
        int mayor=valor1;
        if(valor2>valor1){
         mayor=valor2;   
        }
        return mayor;
        }
     static int mayor(int valor1,int valor2, int valor3){
         int mayor=valor1;
         if(valor2>valor1){
             mayor=valor2;
         }
         if(valor3>valor2){
             mayor=valor3;
         }
         return mayor;
       
        }
   
}
