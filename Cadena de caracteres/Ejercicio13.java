package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio13 {
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
‘e’ = 2 veces.*/
    static public void main(String[] args){
        //Valores
        String frase;
        int [] conteoLetras=new int[26];
        char caracter;
        int indice;
        //Adquisisión de datos
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame una frase: ");
        frase=sc.nextLine().toLowerCase();
        for(int i=0;i<frase.length();i++){
            caracter=frase.charAt(i);
            if(caracter>='a' && caracter<='z'){
                indice=caracter-'a';
                conteoLetras[indice]++;
            }
        }
        System.out.println("Frecuencia de letras:");
        for (int i = 0; i < 26; i++) {
            if (conteoLetras[i] > 0) { // Solo imprimir letras que aparecen
                System.out.println("'" + (char) (i + 'a') + "' = " + conteoLetras[i] + " veces.");
            }
        }
    }
}
