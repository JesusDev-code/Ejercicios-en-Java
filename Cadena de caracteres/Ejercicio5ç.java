package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio5ç {
    /*Actividad 5.
Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. Un
ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
Solución actividad 5.*/
    static public void main(String[] args){
        //Valores
        String frase,contrario=" ";
        char []puta;

        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca una frase ");
        frase=sc.nextLine();
        frase=frase.strip();
        puta=frase.toCharArray();
        for(int i=frase.length()-1;i>=0;i--){
           contrario+=puta[i];
        }
        System.out.println(contrario);
    }
}
