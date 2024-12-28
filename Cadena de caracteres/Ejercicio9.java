package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio9 {
    static public void main(String[] args){
        /*Actividad 9.
Introducir por teclado una frase, palabra por palabra, y mostrar la frase completa separando las
palabras introducidas con un espacio en blanco. Terminar de leer la frase cuando algunas de las
palabras introducidas sea la cadena “fin” escrita con cualquier combinación de mayúsculas y
minúsculas. La cadena “fin” no aparecerá en la frase final.*/
        //Valores
        String frase=" ",palabra;
        //Adquisición de datos
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Introduzca una palabra: ");
            palabra=sc.nextLine();
            if(!palabra.equals("fin")){
                if(!palabra.isEmpty()){
                    frase+=" ";
                }
                frase+=palabra;
            }          
        }while(!palabra.equals("fin"));
        frase=frase.strip();
        System.out.println("La frase completa es: ");
        System.out.println(frase);
    }
}