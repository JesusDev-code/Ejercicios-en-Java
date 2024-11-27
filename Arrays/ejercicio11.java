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
public class ejercicio11 {
    static public void main(String[] args){
        /*Actividad 11.
        Escribir la función: int[] eliminarMayores(int t[], int valor), que crea y devuelve una copia de la
        tabla t donde se han eliminado todos los elementos que son mayores que valor.*/
        //Valores
        int t[]={5,6,85,60};
        int valor;
        int resultado[];
        //Adquisición de datos
        Scanner sc =new Scanner(System.in);
        System.out.println("Dame un valor: ");
        valor =sc.nextInt();
        System.out.println("Aquí son los numeros menores a "+valor);
        
        resultado=eliminarMayores(t,valor);
        
        for(int valoreh:resultado){
            System.out.println(valoreh);
        }
        
        
    }
    static int[] eliminarMayores(int t[], int valor){
        //Creo el contador que me va a indicar el numeros de veces que será menor o igual al valor dado
        int contador=0;
        for(int i=0;i<t.length;i++){
            if(t[i]<=valor){
                contador++;
            }
        }
        //se crea otra tabla con el tamaño del contador que hemos obtenido anteriormente
        int resultado[]=new int[contador];
        //creo otro contador que va a recorrer <MUY IMPORTANTE> POSICIÓN <MUY IMPORTANTE> a posición si lo va a rellenar con el t[i]
        int contador2=0;
        for(int i=0;i<t.length;i++){
            if(t[i]<=valor){
                resultado[contador2]=t[i];
                contador2++;
            }
        }
        return resultado;
    }
}
