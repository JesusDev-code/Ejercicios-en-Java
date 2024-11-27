/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciounidad4;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int resultado,numero1,numero2;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Dame un numero: ");
        //int n = sc.nextInt();
        System.out.println("Dame un valor: ");
        numero1 = sc.nextInt();
        System.out.println("Dame un segundo valor: ");
        numero2 = sc.nextInt();
       
        //ejercicio1(n);
        resultado=ejercicio2(numero1,numero2);
        System.out.println(resultado);
        
        
        
 
        
    }
   static void ejercicio1(int n){
        /**Diseñar un programa que contenga la función eco() a la que se le pasa como parámetro un
número n, y muestra por pantalla n veces el mensaje “Eco...”.**/
        //Valores
        
        //Obtención de datos
        for (int i =0;i<n;i++){
            System.out.println("Eco... ");
            
        }
        
    }
    static int ejercicio2(int valor1,int valor2){
        int resultado=valor1;
        for(int i=valor1;i<valor2;i++){
            resultado=i+1;
        }
        return resultado;
    }
}
