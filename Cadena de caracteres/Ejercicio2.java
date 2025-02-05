package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio2 {
    /*Actividad 2.
Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene
menos caracteres.*/
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        String frase,frase2;
        System.out.println("Dime una frase: ");
        frase=sc.nextLine();
        System.out.println("Dime una segunda frase: ");
        frase2=sc.nextLine();
        if(frase.length()>frase2.length()){
            System.out.println("La frase: -"+frase2+" - es más corta");
        }
        else{
            System.out.println("La frase: -"+frase+ " - es más corta");
        }
    }
}
