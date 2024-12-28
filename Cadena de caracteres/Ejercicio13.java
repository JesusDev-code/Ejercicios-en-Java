package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio13 {
    static public void main(String[] args){
        /*Actividad 13.
Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que aparece en la
frase, cuántas veces se repite.
Se consideran iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un ejemplo
sería:
Frase: En un lugar de La Mancha.
Resultado:
‘a’ = 4 veces.
‘c’ = 1 vez.
‘d’ = 1 vez.
‘e’ = 2 veces.
...*/
     //Valores
     String frase;
     int[] repeticion=new int[26];
     char letra;
     //Adquisición de datos
     Scanner sc=new Scanner(System.in);
     System.out.println("Introduzca una frase: ");
     frase=sc.nextLine();
     frase=frase.toLowerCase();
     for(int i=0;i<frase.length();i++){
         letra=frase.charAt(i);
         if(letra>='a' && letra<='z'){
             repeticion[letra-'a']++;
         }
     }
     for(int i=0;i<repeticion.length;i++){
         if(repeticion[i]>0){
             letra=(char)(i+'a');
             System.out.println(letra+" se ha repetido "+repeticion[i]+" veces");
         }
     }
    }
}
