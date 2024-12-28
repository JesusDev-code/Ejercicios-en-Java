package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio5 {
    static public void main(String[] args){
       /*Actividad 5.
Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. Un
ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.*/
       //Valores
       String frase;
       String fraseinvertida="";
       //Adquisición de datos
       Scanner sc=new Scanner(System.in);
       System.out.println("Escriba una frase: ");
       frase=sc.nextLine();
       for(int i=frase.length()-1;i>=0;i--){
           fraseinvertida+=frase.charAt(i);
       }
        System.out.println(fraseinvertida);
    }
}