package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio8 {
    static public void main(String[] args){
        /*Actividad 8.
Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma
alfabética. Supongamos que cada palabra de la frase se separa de otra por un único espacio.*/
        //Valores
        String frase;
        String[] palabras;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        frase=sc.nextLine();
        palabras=frase.split(" ");
        Arrays.sort(palabras);
        for(String orden:palabras){
            System.out.println(orden);
        }
    }
}