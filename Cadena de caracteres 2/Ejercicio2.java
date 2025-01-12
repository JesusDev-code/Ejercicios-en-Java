package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio2 {
    static public void main(String[] arg){
        /*Actividad 2.
El preprocesador de Java elimina los comentarios  del código fuente antes de compilar.
Diseña un programa que lea por teclado una sentencia en Java, y que elimine los comentarios.
Entrada: if (a==3)  a++; 
Salida: if (a==3) a++;*/
        //Valores
        String entrada,salida;
        int inicio,fin;      
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Deme una frase: ");
        entrada=sc.nextLine();
        if(entrada.contains("/*") && entrada.contains("*/")){
           inicio=entrada.indexOf("/*");
           fin=entrada.indexOf("*/");
           if(fin>inicio){
               entrada=entrada.substring(0, inicio)+entrada.substring(fin+2);
           }
           else{
           }
        }
        salida=entrada.strip();
        System.out.println(salida);
    }
}