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
public class ejercicio2 {
    static public void main(String[] args){
        /*Escribir una aplicación en la que introduzcamos un número “n”; a continuación, que solicite los
n números. Realiza la media de los números positivos, la media de los negativos y que cuente el
número de 0 introducidos.*/
        //Valores
        int n,valor,positivo=0,negativo=0,cero=0,sumapositivo=0,sumanegativo=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el numero de tabla que deseas tener: ");
        n = sc.nextInt();
        int tabla[]=new int[n];
        
        for(int i=0;i<tabla.length;i++){
            System.out.println("Dime un numero= ");
            valor=sc.nextInt();
            tabla[i]=valor;
            if(valor==0){
                cero++;
            }
            else if(valor<0){
         
                negativo++;
            }
            else if(valor>0){
                positivo++;
            }
        }
        for(int i=0;i<tabla.length;i++){
            if(tabla[i]>0){
                sumapositivo=sumapositivo+tabla[i];
            }
            if(tabla[i]<0){
                sumanegativo=sumanegativo+tabla[i];
            }
            
        }
        if(cero>0){
            System.out.println("Se ha introducido "+cero+ " ceros");
        }
        else{
            System.out.println("No se han introducidos ceros");
        }
        if(negativo>0){
            System.out.println("La media de los numeros negativos es "+sumanegativo/negativo);
        }
        else{
            System.out.println("No se han introducidos numeros negativos.");
        }
        if(positivo>0){
            System.out.println("La media de los numeros positivos es "+sumapositivo/positivo);
        }
        else{
            System.out.println("No se han introducidos numeros positivos");
        }
       
    
    }
}
