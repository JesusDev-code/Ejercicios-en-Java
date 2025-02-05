package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio6 {
    /*Actividad 6.
Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
(mayúsculas, minúsculas y acentuadas). Por ejemplo: “Álvaro Pérez” se mostrará “lvr Prz”.*/
    static public void main(String [] args){
        //Valores
        String nombre,nombres=" ";
        char[] nombreh;
        //Adquisición de datos
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca su nombre completo: ");
        nombre=sc.nextLine().strip();
        nombreh=nombre.toCharArray();  
        for(int i=0;i<nombre.length();i++){
            if(nombre.charAt(i)=='a'||nombre.charAt(i)=='e'||nombre.charAt(i)=='i'||nombre.charAt(i)=='o'||nombre.charAt(i)=='u'||
                    nombre.charAt(i)=='A'||nombre.charAt(i)=='E'||nombre.charAt(i)=='I'||nombre.charAt(i)=='O'||
                    nombre.charAt(i)=='U'||nombre.charAt(i)=='á'||nombre.charAt(i)=='é'||nombre.charAt(i)=='ì'||
                    nombre.charAt(i)=='ò'||nombre.charAt(i)=='u' ){
               nombres+="";
            }
            else{
                nombres+=nombreh[i];
            }       
        }
        System.out.println(nombres);
    }
}