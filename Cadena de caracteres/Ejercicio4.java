package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio4 {
    /*Actividad 4.
Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique
cuantos espacios en blanco tiene.*/
    static public void main(String[] args){
        //Valores
        String frase;
        int contador=0;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase: ");
        frase=sc.nextLine();
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)==' '){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" espacios.");
    }
}
