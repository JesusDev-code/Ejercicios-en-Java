/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author er_pi
 */
public class ejercicio9 {
    static public void main(String[] args){
        /*Actividad 9.
        Leer y almacenar “n” números enteros en una tabla, a partir de la que construirán otras dos
        tablas con los elementos con valores pares e impares de la primera, respectivamente. Las tablas
        pares e impares deben mostrarse ordenadas, ya que la tabla primera tenía sus valores
        introducidos ordenados.*/
        //valores
        int n;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("¿De qué tamaño quieres que sea las tablas?");
        n =sc.nextInt();
        
        int numeros[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Dame un numero:");
            numeros[i]=sc.nextInt();
        }
        
        int par[]=new int[n];
        int impar[]=new int[n];
        int Contadorpar=0;
        int Contadorimpar=0;
        
        for(int i=0;i<n;i++){
            if(numeros[i]%2==0){
                par[Contadorpar]=numeros[i];
                Contadorpar++;
            }
            else{
                impar[Contadorimpar]=numeros[i];
                Contadorimpar++;
            }
        }
        //MUY IMPORTANTE
        
        par = Arrays.copyOf(par, Contadorpar);
        impar = Arrays.copyOf(impar, Contadorimpar);
        Arrays.sort(par);
        Arrays.sort(impar);
        
        System.out.println("Numeros pares ordenados: ");
        for(int pareh:par){
            System.out.println(pareh);
        }
        System.out.println("Numeros impares odernados: ");
        for(int impareh:impar){
            System.out.println(impareh);
        }
      
        
    }
}
