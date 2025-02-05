package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio12 {
    /*Actividad 12.
Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra.
Ejemplos de anagramas para la palabra “roma” son: amor (♡), ramo o mora.
Debéis construir un programa que solicite al usuario dos palabras e indique si son
anagramas una de la otra.
Solución actividad 12.*/
    static public void main(String[] args){
        //Valores
        String palabra,palabra2;
        char [] palabrah,palabrah2;
        //Adquisicion de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una palabra: ");
        palabra=sc.nextLine().toLowerCase();
        palabrah=palabra.toCharArray();
        System.out.println("Dame una segunda palabra: ");
        palabra2=sc.nextLine().toLowerCase();
        palabrah2=palabra2.toCharArray();
        
        if(palabra.length()!= palabra2.length()){
            System.out.println("No es anagrama");
        }
        else{
            
        Arrays.sort(palabrah);
        Arrays.sort(palabrah2);
        
        if(Arrays.equals(palabrah, palabrah2)){
            System.out.println("Es anagrama");
        }
        else{
            System.out.println("No lo es");
        }
        
        }  
        
    }
}
