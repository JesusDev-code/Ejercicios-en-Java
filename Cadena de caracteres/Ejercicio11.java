package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio11 {
    static public void main(String[] args){
        /*Actividad 11.
Dada la necesidad de crear un nuevo sistema de codificación en nuestra clase (debido a que el
profesor ya nos descubrió el anterior y así sabe lo que hablamos por el Whatsapp)se ha decidido
crear las siguientes tablas y correspondencias para así poder seguir diciendo cosas de nuestro
maravilloso profesor...:
letras1 = {‘e’,’i’,’k’,’m’,’p’,’q’,’r’,’s’,’t’,’u’,’v’};
letras2 = {‘p’,’v’,’i’,’u’,’m’,’t’,’e’,’r’,’k’,’q’,’s’};
Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su
correspondiente del conjunto 2. El resto de las letras no se modifica.
Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre
la codificación en minúsculas.*/
        //Valores
        String frase,frasecodificada="";
        char[] letras1 = {'e','i','k','m','p','q','r','s','t','u','v'};
        char[] letras2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char letra;
        boolean encontrado=false;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase: ");
        frase = sc.nextLine();
        for(int i=0;i<frase.length();i++){
            letra=frase.charAt(i);
            encontrado=false;
            for(int j=0;j<letras1.length;j++){
                if(letra==letras1[j]){
                    frasecodificada+=letras2[j];
                    encontrado=true;
                }
            }
            if(!encontrado){
                frasecodificada+=letra;
            }
        }
        System.out.println("La frase codificada es: ");
        System.out.println(frasecodificada);
    }
}