package com.mycompany.repasocadenadecaracteres;
import java.util.Scanner;
/* Author jesus*/
public class Ejercicio10 {
    
    /*Actividad 10.
Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que
la frase sea igual leyendo de izquierda a derecha que, de derecha a izquierda, sin tener en cuenta
los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”.
Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no lo
fuese. Por esto, damos por hecho que el usuario introduce toda la frase sin tildes.*/
    
    static public void main(String[] args){
        //valores
        String frase,frasecontraria="",frasesinespacio="";
        char[] fraseh;
        //Adquisicion de valores
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame tu frase: ");
        frase=sc.nextLine();
        frase=frase.strip();
        fraseh=frase.toCharArray();
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)!=' '){
                frasesinespacio+=frase.charAt(i);
                
            }
        }
        for(int i=frasesinespacio.length()-1;i>=0;i--){
            frasecontraria+=frasesinespacio.charAt(i);
        }
        if(frasesinespacio.equalsIgnoreCase(frasecontraria)){
            System.out.println("Lo es");
        }
        else{
            System.out.println("No lo es");
        }
}
}
