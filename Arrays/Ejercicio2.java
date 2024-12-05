package com.mycompany.enunciadoscompletosu5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio2 {
        static public void main(String[] args){
        /*Actividad 2.
        Escribir una aplicación en la que introduzcamos un número “n”; a continuación, que solicite los
        n números. Realiza la media de los números positivos, la media de los negativos y que cuente el
        número de 0 introducidos.*/
        //Valores
        // Inicializar contadores y sumas a la vez que declaramos las variables enteras y double
        int numeros[];
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
        int sumaPositivos = 0, sumaNegativos = 0,n;
        double media;
        double media2;
        //Adquisición de datos
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();
        numeros = new int[n];
        // Leer los números
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero:");
            numeros[i] = sc.nextInt();
        }
        // Procesar los números
        
        for (int numero : numeros) { 
            if (numero > 0) {
                contadorPositivos++;
                sumaPositivos += numero;
            } else if (numero < 0) {
                contadorNegativos++;
                sumaNegativos += numero;
            } else {
                contadorCeros++;
            }
        }
        //media
        
        media=media(sumaPositivos, contadorPositivos);
        media2=media(sumaNegativos, contadorNegativos);
        // Mostrar resultados
        
        if(contadorPositivos>0){
            System.out.println("Media de los numeros positivos: " + media);
        }
        if(contadorNegativos>0){
            System.out.println("Media de los numeros negativos: " + media2);
        }
        if(contadorCeros>0){
             System.out.println("Cantidad de ceros: " + contadorCeros);
        }
        
       
        }
        //funcion para sacar media
        static double media(int valor,int valor2){
            return (double) valor / valor2;
        }
}

