package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio8 {
    static public void main(String[] args){
        /*Actividad 8.
Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan
sus frases con “Javalín, javalón”, para después hacer una pausa más o menos larga (dicha pausa
se representa mediante espacios en blanco o tabulaciones) y a continuación, expresan el
mensaje.
Existe un dialecto que no comienzan sus frases con la muletilla anterior, pero siempre las
terminan con un silencio, más o menos prolongado y la coletilla “javalén, len, len”.
Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de
Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el mensaje sin
muletillas.*/
        //Valores
        String frase,prefijo="Javalin, javalon ",sufijo="javalen, len, len ";
        boolean empieza=false,termina=false;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga una frase: ");
        frase=sc.nextLine();
        empieza=frase.startsWith(prefijo);
        termina=frase.endsWith(sufijo);
        if(empieza==true || termina==true){
            System.out.println("Vaya tenemos a un habitante de Javalandia");
            frase=frase.replace(prefijo, "").replace(sufijo, "");
            frase.strip();
            System.out.println("Mensaje: "+frase);
        }
        else{
            System.out.println("No sé lo que dices");
        }
    }
}