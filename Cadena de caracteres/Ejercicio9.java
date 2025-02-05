package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio9 {
    /*Actividad 9.
Introducir por teclado una frase, palabra por palabra, y mostrar la frase completa separando las
palabras introducidas con un espacio en blanco. Terminar de leer la frase cuando algunas de las
palabras introducidas sea la cadena “fin” escrita con cualquier combinación de mayúsculas y
minúsculas. La cadena “fin” no aparecerá en la frase final.*/
    static public void main(String[] arg){
        //valores
        String frase="";
        String palabra;
        
        //adquisicion de datos
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Introduzca una palabra: ");
            palabra=sc.nextLine();
            if(!palabra.equalsIgnoreCase("fin")){
                if(palabra.isEmpty()){
                    frase+=" ";
                }
                frase+=" ";
                frase+=palabra;
                frase=frase.strip();
            }
        }while(!palabra.equalsIgnoreCase("fin"));
        System.out.println(frase);
    }
}
