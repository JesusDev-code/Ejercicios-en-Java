package com.mycompany.ejerciciounidad6repaso;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio12 {
    static public void main(String[] args){
        /*Actividad 12.
Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra.
Ejemplos de anagramas para la palabra “roma” son: amor (♡), ramo o mora.
Debéis construir un programa que solicite al usuario dos palabras e indique si son
anagramas una de la otra.*/
        //Valores
        String palabra,palabra2;
        char[] palabrah,palabrah2;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        palabra=sc.nextLine();
        palabra=palabra.toLowerCase();
        System.out.println("Introduzca una segunda palabra: ");
        palabra2=sc.nextLine();
        palabra2=palabra.toLowerCase();
        if(palabra.length()==palabra2.length()){
            palabrah=palabra.toCharArray();
            palabrah2=palabra2.toCharArray();
            Arrays.sort(palabrah);
            Arrays.sort(palabrah2);
            if(Arrays.equals(palabrah, palabrah2)){
                System.out.println("Son anagramas");
            }
        }
        else{
            System.out.println("No es anagrama.");
        }
    }
}