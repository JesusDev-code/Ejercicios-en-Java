/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;
import java.util.Scanner;
/**
 *
 * @author er_pi
 */
public class ejercicio4 {
    static public void main(String[] args){
        /*Actividad 4.
        Diseñar una aplicación que pida al usuario cuantos números dese introducir. Luego que
        introduzca esos valores por teclado y que se muestre por pantalla los datos en orden inverso al
        introducido.*/
        //Valores
        int n,valor;
        Scanner sc =new Scanner(System.in);
        System.out.println("¿cuantos numeros deseas introducir?");
        n=sc.nextInt();
        int numero[]=new int[n];
        
        for(int i=0;i<numero.length;i++){
            System.out.println("Dame un numero: ");
            valor =sc.nextInt();
            numero[i]=valor;
        }
        for(int i=numero.length-1;i>=0;i--){
            System.out.println("---------");
            System.out.println(numero[i]);
    }
    }
}
