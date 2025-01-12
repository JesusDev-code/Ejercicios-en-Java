package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio4 {
    static public void main(String[] args){
        /*Actividad 4.
Lee una palabra o frase y muestra el proceso en el que cada letra se sustituye por otro símbolo
no alfabético. Por ejemplo el carácter ‘a’ se podría sustituir por el carácter ‘@’, la ‘e’ por ‘€’, la ‘i’
por ‘1’, etc.*/
        //Valores
        char[] cambios={'@','€','1','0','!'};
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        char[] frase;
        String oracion;
        //Adquisicion de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase: ");
        oracion=sc.nextLine();
        frase=oracion.toCharArray();
        for(int i=0;i<frase.length;i++){
            for(int j=0;j<vocales.length;j++){
                if(frase[i]==vocales[j]){
                    frase[i]=cambios[j];        
                }
            }
        }
        System.out.println(frase);
    }
}