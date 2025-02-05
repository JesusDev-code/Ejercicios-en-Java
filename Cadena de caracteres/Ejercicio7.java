package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio7 {
    /*Actividad 7.
Diseñar un programa que solicite al usuario una frase y una palabra. A continuación, buscará e
indicará cuantas veces aparece la palabra en la frase.*/
    static public void main(String[] args){
        //Valores
        String frase,palabra;
        String[] palabras;
        int contador=0;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase; ");
        frase=sc.nextLine();
        System.out.println("Dame una palabra: ");
        palabra=sc.nextLine();
        palabras=frase.split(" ");
        for(int i=0;i<palabras.length;i++){
          if(palabras[i].equalsIgnoreCase(palabra)){
              contador++;
          }
        }
        System.out.println("La palabra "+ palabra + " se repite "+ contador + " veces.");
    }
}