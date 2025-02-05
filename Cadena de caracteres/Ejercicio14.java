package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
import java.util.Random;
public class Ejercicio14 {
    /*Actividad 14.
Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra y la
aplicación muestra un anagrama (cambio del orden de los caracteres) generado al azar.
A continuación, otro jugador tiene que acertar cual es el texto original.
La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena vacía.
Por ejemplo, si el jugador 1 introduce “teclado”, la aplicación muestra como pista un anagrama
al azar como, por ejemplo: “etcloda”.*/
    static public void main(String[] args){
        //Valores
        String palabra,respuesta;
        Random random=new Random();
        char[] letras;
        int x;
        char temp;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        palabra=sc.nextLine();
        letras=palabra.toCharArray();
        //desordenar palabra
        for(int i=0;i<letras.length;i++){
            x=random.nextInt(letras.length);
            temp=letras[i];
            letras[i]=letras[x];
            letras[x]=temp;
        }
        System.out.println("Adivina la palabra: ");
        System.out.println(letras);
        
        System.out.print("Respuesta: ");
        respuesta=sc.nextLine();
        if(respuesta.equalsIgnoreCase(palabra)){
            System.out.println("FelicidadeS! has acertado!");
        }
        else{
            System.out.println("Vaya, no has acertado");
        }
        
    }
}