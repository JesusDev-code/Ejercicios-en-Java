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
public class ejercicio3 {
    static public void main(String[] args){
        /*Actividad 3.
        Realizar una aplicación que solicite al usuario 5 números decimales por teclado. Posteriormente
        que se muestren los números en el mismo orden en el que se han introducido.*/
        //Valores
        double numero[]=new double[5],valor=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<numero.length;i++){
            System.out.println("Dame un numero decimal: ");
            valor = sc.nextDouble();
            numero[i]=valor;
        }
        for(double resultado:numero){
            System.out.println("Los numeros que has introducido en el mismo orden es: "+resultado);
        }
        
    }
}
