package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio6 {
    static public void main(String[] args){
        /*Actividad 6.
Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
(mayúsculas, minúsculas y acentuadas). Por ejemplo: “Álvaro Pérez” se mostrará “lvr Prz”.*/
        //Valores
        String nombre;
        String nombreh="";
        char letra;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Ponga su nombre completo: ");
        nombre=sc.nextLine();
        for(int i=0;i<nombre.length();i++){
            letra=nombre.charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' && 
                letra != 'á' && letra != 'é' && letra != 'í' && letra != 'ó' && letra != 'ú' &&
                letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U' &&
                letra != 'Á' && letra != 'É' && letra != 'Í' && letra != 'Ó' && letra != 'Ú') {
                nombreh += letra;
            }
            else{              
            }           
        }
        System.out.println(nombreh);
    }
}