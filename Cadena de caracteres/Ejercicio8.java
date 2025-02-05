package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio8 {
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
    
    static public void main(String[] args){
        //Valores
        String frase,prefijo="Javalin,javalon", sufijo="javalen,len len";
        char [] fraseh;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase y veamos: ");
        frase=sc.nextLine();
        frase=frase.strip();
        
        //fraseh=frase.toCharArray();
        if(frase.startsWith(prefijo) || frase.endsWith(sufijo)){
            System.out.println("Vaya tenemos alguien de Javalandia");
            System.out.println("Comenzando a traducir...");          
            frase=frase.replaceAll(prefijo, "");
            frase=frase.replaceAll(sufijo, "");
            frase=frase.strip();
            System.out.println(frase);
        }
        
        else{
            System.out.println("No sé lo que dices pero no eres de javalandia");
        }
    }
}
