package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio4 {
    static public void main(String[] args){
        /*Actividad 4.
Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique
cuantos espacios en blanco tiene.*/
        //Valores
        String frase;
        int contador=0;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        frase=sc.nextLine();
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)==' '){
                contador++;
            }
        }
        System.out.println("En tu frase hay "+contador+" espacios.");
    }
}