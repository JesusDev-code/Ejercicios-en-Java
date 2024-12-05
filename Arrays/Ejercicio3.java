package com.mycompany.enunciadoscompletosu5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio3 {
        static public void main(String[] args){
        /*Actividad 3.
        Realizar una aplicación que solicite al usuario 5 números decimales por teclado. Posteriormente
        que se muestren los números en el mismo orden en el que se han introducido.*/
        //Valores
        double tabla[]=new double[5];
        double numero;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<tabla.length;i++){
            System.out.println("Introduzca un numero decimal si es tan amable: ");
            numero=sc.nextDouble();
            tabla[i]=numero;
        }
        System.out.println("Lo numeros introducidos por orden de introdución es: ");
        
        for(int i=0;i<tabla.length;i++){
            System.out.println(tabla[i]);
        }
    }
}
