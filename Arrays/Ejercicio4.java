package com.mycompany.enunciadoscompletosu5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio4 {
      static public void main(String[] args){
        /*Actividad 4.
        Diseñar una aplicación que pida al usuario cuantos números dese introducir. Luego que
        introduzca esos valores por teclado y que se muestre por pantalla los datos en orden inverso al
        introducido.*/
        //valores
        int numero,n;
        int tabla[];
        
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea introducir?");
        n=sc.nextInt();
        tabla=new int[n];
        
        for(int i=0;i<tabla.length;i++){
            System.out.println("Introduzca un numero: ");
            numero=sc.nextInt();
            tabla[i]=numero;
            
        }
        System.out.println("El orden inverso introducido es: ");
        for(int i=tabla.length-1;i>=0;i--){
            System.out.println(tabla[i]);
        }
        
    
    }
}

