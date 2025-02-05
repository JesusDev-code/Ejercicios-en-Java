package com.mycompany.repasocadenadecaracteres;
/* Author jesus*/
import java.util.Scanner;
public class Ejercicio3 {
    /*Actividad 3.
Diseñar el juego “Acierta la contraseña”. La mecánica del juego es la siguiente: el primer jugador
introduce la contraseña; a continuación, el segundo jugador debe teclear palabras hasta que la
acierte. Realizar dos versiones; en la primera se facilita el juego indicando si la palabra
introducida es mayor o menor alfabéticamente que la contraseña.
En la segunda, el programa mostrará la longitud de la contraseña y una cadena con los caracteres
acertados en sus lugares respectivos y asteriscos en los no acertados.*/
    
    static public void main(String[] args){
        //Valores
        String opcion;      
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido al juego de 'Acierta la contraseña', la mecánica es sencilla"
                + " pon una pass y tu amigo lo debe averguar ¿podra acerlo?");
        System.out.println("¿Que versión desea utilizar?");
        System.out.println("La version 1 se te indicará si la palabra es mayor o menor alfabeticamente ,en cambio, la version"
                + "2 se te indicara la longitud de la palabra al acertar,si lo avergua se desbloqueara de lo contrario "
                + "se pondrá un asterisco.");
        System.out.println("Esciba su eleccion: ");
        System.out.println("Primera version");
        System.out.println("Segunda version");
        opcion=sc.nextLine();
        //Versiones
        if(opcion.equalsIgnoreCase("Primera version")){
            System.out.println("Ha elegido la primera version: ");
            version1(sc);
        }
        else if(opcion.equalsIgnoreCase("segunda version")){
            System.out.println("Ha elegido la segunda version");
            version2(sc);
        }
        else{
            System.out.println("Mensaje de error");
        }
    }
    public static void version1(Scanner sc){
        //Valores
        String pass,palabra="";
        System.out.println("Introduzca la contraseña:");
        pass=sc.nextLine();
        do{
            System.out.println("Ponga la contraseña correcta o ponga me rindo:  ");
            palabra=sc.nextLine();
            palabra=palabra.strip();
            if(palabra.length() == pass.length()){
                if(palabra.equalsIgnoreCase(pass)){
                    System.out.println("Felicidades! has acertado");
                }
                else{
                    System.out.println("No es la palabra correcta");
                }     
            }
            else{
                if(pass.length() > palabra.length()){
                System.out.println("Vaya "+ palabra +" es mas pequeña");
                }
                else{
                System.out.println("Vaya "+ palabra+ " es mas grande");
                }
            }          
            }while(!palabra.equalsIgnoreCase(pass) && !palabra.equalsIgnoreCase("me rindo"));
            System.out.println("Hasta la proxima!");
        }
    public static void version2(Scanner sc){
        //valores
        String pass="",palabra="";
        char [] palabrah;
        //Adquisición de datos
        System.out.println("Introduzca la contraseña:");
        pass=sc.nextLine();
        pass=pass.strip();
        
        System.out.println("Introduzca la palabra que cree que es la contraseña: ");
        palabra=sc.nextLine();
        palabra=palabra.strip();
        palabrah=palabra.toCharArray();
        
        do{
            if(palabra.length() == pass.length()){
            System.out.println("La contraseña tiene "+palabra.length()+ "de longitud");
            for(int i=0;i<pass.length();i++){
                if(palabra.charAt(i)== pass.charAt(i)){
                   palabrah[i]=pass.charAt(i);
                }
                else{
                    palabrah[i]='*';
                }
            }
        }
        else{
            System.out.println("La contraseña tiene "+palabra.length()+ "de longitud");
            
            if(pass.length() > palabra.length()){           
                System.out.println("La palabra que ha introducido es menor.");
            }
            else{
                System.out.println("La palabra que ha introducido es mayor.");
            }
        }
            System.out.println(palabrah);
            System.out.println("Introduzca la palabra que cree que es la contraseña: ");
            palabra=sc.nextLine();
        }while(!palabra.equalsIgnoreCase(pass));
        System.out.println("felicidades has acertado");
        
    }
}