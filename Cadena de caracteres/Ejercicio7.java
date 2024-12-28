package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio7 {
    static public void main(String[] args){
        /*Actividad 7.
Diseñar un programa que solicite al usuario una frase y una palabra. A continuación, buscará e
indicará cuantas veces aparece la palabra en la frase.*/
        //Valores
        String frase;
        String palabra;
        String [] palabras;
        int contador=0;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase: ");
        frase=sc.nextLine();
        frase=frase.toLowerCase();
        System.out.println("Dame una palabra: ");
        palabra=sc.nextLine();
        palabra=palabra.toLowerCase();
        palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                contador++;
            }
        }
        System.out.println("De la frase ");
        System.out.println(frase);
        System.out.println("Contiene "+contador+" veces la palabra"+palabra);
    }
}