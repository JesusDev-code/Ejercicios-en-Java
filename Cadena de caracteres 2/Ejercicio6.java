package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio6 {
    static public void main(String[] args){
        /*Actividad 6.
Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier
combinación de mayúsculas y minúsculas) en el nombre de una variable que utilice la
nomenclatura CAMEL. Por ejemplo, la frase “Me Gusta merenDAR galletas”, se convertirá en
“meGustaMerendarGalletas”.
Supondremos que cada palabra que compone la frase está separada por un único espacio en
blanco.*/
        //Valores
        String frase;
        String camel;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime una frase y se convertira en nomenclatura CAMEL: ");
        frase=sc.nextLine();
        camel=convertirACamelCase(frase);
        System.out.println(camel);
    }
public static String convertirACamelCase(String frase) {
    String[] palabras;
    String camelCase = "",palabra;
    frase=frase.toLowerCase();
    palabras=frase.split(" ");
    for (int i = 0; i < palabras.length; i++) {
        palabra = palabras[i];
        if (i == 0) {
            camelCase += palabra;
        } else {
            camelCase += palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
        }
    }
    return camelCase;
    }
}