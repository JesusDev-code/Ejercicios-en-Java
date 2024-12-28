package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio2 {
    static public void main(String[] args){
        /*Actividad 2.
Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene
menos caracteres.*/
        //valores
        String frase;
        String frase2;
        //Adquisucuón de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        frase =sc.nextLine();
        System.out.println("Escriba una segunda frase: ");
        frase2=sc.nextLine();
        if(frase.length()>frase2.length()){
            System.out.println("Parece que la frase: "+frase2+" es la más corta ");
        }
        else{
            System.out.println("Parece que la frase: "+frase+" es la más corta");
        }
    }
}