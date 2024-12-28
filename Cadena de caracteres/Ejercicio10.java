package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio10 {
    static public void main(String[] args){
        /*Actividad 10.
Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que
la frase sea igual leyendo de izquierda a derecha que, de derecha a izquierda, sin tener en cuenta
los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”.
Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no lo
fuese. Por esto, damos por hecho que el usuario introduce toda la frase sin tildes.*/
        //Valores
        String frase,frasesinespacio="",fraseinversa="";
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase: ");
        frase=sc.nextLine();
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)!=' '){
                frasesinespacio+=frase.charAt(i);
                frasesinespacio=frasesinespacio.toLowerCase();
            }
        }
        for(int i=frasesinespacio.length()-1;i>=0;i--){
            fraseinversa+=frasesinespacio.charAt(i);
        }
        if(fraseinversa.equals(frasesinespacio)){
            System.out.println("Es palindroma");
        }
        else{
            System.out.println("No es palindroma");
        }
    }
}