package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Random;
import java.util.Scanner;
public class Ejercicio15 {
    /*Actividad 15.
Modificar la actividad 14 para que el programa indique al jugador 2 cuántas letras coinciden (son
iguales y están en la misma posición) entre el texto introducido por él y el original.*/
    static public void main(String[] args){
                //Valores
        String palabra,respuesta;
        Random random=new Random();
        char[] letras;
        int x,contador=0;
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
        while(!respuesta.equalsIgnoreCase(palabra)){
                    //Mostrar el anagrama           
                    for(int i=0;i<letras.length;i++){
                        if(respuesta.charAt(i)==palabra.charAt(i)){
                            contador++;
                        }
                    }
                    System.out.println("Vaya no has acertado,de las palabras que has colocado ha coincididio "+contador+" letras, intentalo"
                            + "de nuevo");  
                    contador=0;
                    System.out.println("¿que palabra quieres introducir?");
                    respuesta=sc.nextLine();    
                }
                    System.out.println("Felicidades!");
    }
}
