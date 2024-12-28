package com.mycompany.ejerciciounidad6repaso;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio15 {
    static public void main(String[] args){
        /*Actividad 15.
Modificar la actividad 14 para que el programa indique al jugador 2 cuántas letras coinciden (son
iguales y están en la misma posición) entre el texto introducido por él y el original.*/
        //Valores
        String palabra,palabra2;
        char[]palabrah;
        char[]palabrah2;
        char temp;
        int x,contador=0;
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
            for(int i=0;i<palabra.length();i++){
                if(palabra2.charAt(i)==palabra.charAt(i)){
                    contador++;
                }
            }
            System.out.println("Vaya, no ha acertado, aunque de la palabra que has escrito coinciden "+contador+ " palabras");    
            }
        contador=0;
        }while (!palabra2.equals(palabra));
    }
}