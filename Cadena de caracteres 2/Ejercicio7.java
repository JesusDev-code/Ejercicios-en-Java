package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio7 {
    static public void main(String[] args){
        /*Actividad 7.
Implementa un sencillo editor de texto que, una vez que se ha introducido el texto, permita
reemplazar todas las ocurrencias de una palabra por otra.*/
        //Valores
        String frase,palabraAremplazar,palabraRemplazada,frasemodificada;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        frase=sc.nextLine();
        System.out.println("Escriba la palabra que quiere remplazar: ");
        palabraAremplazar=sc.nextLine();
        System.out.println("Escriba la palabra que va a reemplazar: ");
        palabraRemplazada=sc.nextLine();
        frasemodificada=frase.replaceAll(palabraAremplazar,palabraRemplazada);
        System.out.println(frasemodificada);
    }
}