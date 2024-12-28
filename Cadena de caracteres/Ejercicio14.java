package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jesus
 */
public class Ejercicio14 {
    static public void main(String[] args){
        /*Actividad 14.
Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra y la
aplicación muestra un anagrama (cambio del orden de los caracteres) generado al azar.
A continuación, otro jugador tiene que acertar cual es el texto original.
La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena vacía.
Por ejemplo, si el jugador 1 introduce “teclado”, la aplicación muestra como pista un anagrama
al azar como, por ejemplo: “etcloda”.*/
        //Valores
        String palabra,palabra2;
        char[]palabrah;
        char temp;
        int x;
        Random random=new Random();
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga una palabra que el segundo jugador tendrá que adivinar: ");
        palabra =sc.nextLine();
        palabra=palabra.strip();
        palabrah=palabra.toCharArray();
        for(int i=0;i<palabrah.length;i++){
            x=random.nextInt(palabrah.length);
            temp=palabrah[i];
            palabrah[i]=palabrah[x];
            palabrah[x]=temp;
        }
        do{
        System.out.println("Adivina la palabra: ");
        System.out.println(palabrah);
        palabra2=sc.nextLine();
        if(palabra2.equals(palabra)){
            System.out.println("Felicidades, ha acertado");
        }
        else{
            System.out.println("Vaya, no ha acertado");
        }
        }while(!palabra2.equals(palabra));      
    }
}
