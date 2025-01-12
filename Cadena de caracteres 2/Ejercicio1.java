package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        /*Actividad 1.
Teniendo realizada la actividad 11, escribe un programa descodificador que muestre el texto
codificado con el anterior programa.
ENUNCIADO ACTIVIDAD 11.
Dada la necesidad de crear un nuevo sistema de codificación en nuestra clase (debido a
que el profesor ya nos descubrió el anterior y así sabe lo que hablamos por el Whatsapp)
se ha decidido crear las siguientes tablas y correspondencias para así poder seguir
diciendo cosas de nuestro maravilloso profesor...:
letras1 = {‘e’,’i’,’k’,’m’,’p’,’q’,’r’,’s’,’t’,’u’,’v’};
letras2 = {‘p’,’v’,’i’,’u’,’m’,’t’,’e’,’r’,’k’,’q’,’s’};
Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su
correspondiente del conjunto 2. El resto de las letras no se modifica.
Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando
siempre la codificación en minúsculas.*/
                //Valores
        String frase,frasedescodificada="";
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
            for(int j=0;j<letras2.length;j++){
                if(letra==letras2[j]){
                    frasedescodificada+=letras1[j];
                    encontrado=true;
                }
            }
            if(!encontrado){
                frasedescodificada+=letra;
            }
        }
        System.out.println("La frase descodificada es: ");
        System.out.println(frasedescodificada);
    }
}