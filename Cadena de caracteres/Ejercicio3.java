package com.mycompany.ejerciciounidad6repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio3 {
    static public void main(String[] args){
        /*Actividad 3.
Diseñar el juego “Acierta la contraseña”. La mecánica del juego es la siguiente: el primer jugador
introduce la contraseña; a continuación, el segundo jugador debe teclear palabras hasta que la
acierte. Realizar dos versiones; en la primera se facilita el juego indicando si la palabra
introducida es mayor o menor alfabéticamente que la contraseña.
En la segunda, el programa mostrará la longitud de la contraseña y una cadena con los caracteres
acertados en sus lugares respectivos y asteriscos en los no acertados.*/
        //Valores
        String pass,palabra;
        char[]palabrah,password;
        int opcion;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga una password: ");
        pass=sc.nextLine();
        password=pass.toCharArray();
        System.out.println("Bienvenido al juego 'Acierta la contrasenia'tendras que elegir que version quieres"
                + " la primera version o la segunda.");
        System.out.println("1-Version");
        System.out.println("2-Version");
        opcion=sc.nextInt();
        sc.nextLine();
        //versiones
        switch(opcion){
            case 1:
                do{
                    System.out.println("Indique la password que cree que es: ");
                    palabra=sc.nextLine();
                    if(!palabra.equals(pass)){
                        if(palabra.length()>pass.length()){
                            System.out.println("La palabras que has introducido es mayor que la password.");
                        }
                        else{
                            System.out.println("La palabra que has introducido es menor que la password.");
                        }
                    }
                }while(!palabra.equals(pass));
                System.out.println("Felicidades! has acertado.");
                break;
            case 2:
                do{
                    System.out.println("Indique la password que cree que es: ");
                    palabra=sc.nextLine();
                    if(palabra.length()<password.length){
                        System.out.println("La palabra es menor");
                        System.out.println("Pista: la contraseña tiene "+pass.length()+" de longitud.");
                    }
                    else if(palabra.length()>password.length){
                        System.out.println("La palabra es mayor");
                        System.out.println("Pista: la contraseña tiene "+pass.length()+" de longitud.");
                    }
                    else if(palabra.length()==password.length){
                        palabrah=new char[password.length];
                        for(int i=0;i<password.length;i++){
                                if(palabra.charAt(i)==pass.charAt(i)){
                                    palabrah[i]=palabra.charAt(i);
                                }
                                else{
                                    palabrah[i]='*';
                                }
                        }
                        System.out.println("Esto es lo que has acertado: ");
                        System.out.println(palabrah);
                        System.out.println("Pista: la contraseña tiene "+pass.length()+" de longitud.");
                    }
                }while(!palabra.equals(pass));
                break;
            default:
                System.out.println("La opcion no es correcta");
        }
    }
}