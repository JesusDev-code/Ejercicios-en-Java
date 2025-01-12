package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio5 {
    static public void main (String[] args){
        /*Actividad 5.
Construir un programa que convierta una palabra en secuencias de n letras. Por ejemplo, la
palabra “destornillador”, dividida en secuencias de 4 letras, se mostrará de la siguiente forma:
dest
orni
llad
or*/
        //Valores
        String palabra,salida;
        int n;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Ponga una palabra: ");
        palabra=sc.nextLine();
        System.out.println("Cuantas letras quiere que se divida: ");
        n=sc.nextInt();
        if(n<0){
            System.out.println("No puede ser negativo.");
        }
        else{
            System.out.println("Dividiendo la palabra en secuencias de " + n + " letras:");
            while(!palabra.isEmpty()){
                if(palabra.length()>n){
                    System.out.println(palabra.substring(0, n));
                    palabra=palabra.substring(n);
                }
                else{
                    System.out.println(palabra);
                    palabra="";
                }
            }
        }
    }
}