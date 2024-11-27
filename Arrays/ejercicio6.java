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
public class ejercicio6 {
    static public void main(String[] args){
        /*Actividad 6.
Desarrolla una función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla
ordenada de la longitud especificada, que se encuentre rellena con números pares aleatorios
comprendidos en el rango desde 2 hasta fin (inclusive).
        (int) (Math.random() * (max - min + 1)) + min */
        //Valores
        int longitud,fin,resultado[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el inicio: ");
        longitud =sc.nextInt();
        System.out.println("Dame el fin: ");
        fin =sc.nextInt();
        resultado=rellenaPares(longitud,fin);
        for(int resultadoh:resultado){
            System.out.println(resultadoh);
        }
       
        
    }
   static int[] rellenaPares(int longitud, int fin){
        int longituh[]=new int[longitud];
        int aleatorio;
        for(int i=0;i<longituh.length;i++){
            aleatorio=(int)(Math.random()*(fin-2+1)+2);
            if(aleatorio%2==0){
                longituh[i]=aleatorio;
            }
            else{
                i--;
            }
            
        }
        return longituh;
    }
}
