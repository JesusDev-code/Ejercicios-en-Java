package com.mycompany.ejerciciounidad6refuerzo_repaso;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio3 {
    static public void main(String[] args){
        /*Actividad 3.
Diseñar una aplicación que se comporte como una pequeña agenda. Mediante un menú el
usuario podrá elegir entre:
a) Añadir un nuevo contacto (nombre y teléfono).
b) Buscar un teléfono de un contacto a partir de su nombre.
c) Mostrar la información de todos los contactos ordenados alfabéticamente mediante el
nombre.
Pista: el nombre y el teléfono se pueden codificar como una única cadena con la forma
“nombre:teléfono”.*/
        //Valores
        String nombre,numero,opcion,contactos,temp;
        String [] contacto=new String[0],nuevoContacto;
        boolean encontrado=false;
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido/a a tu agenda personal.");
        do{          
            System.out.println("Puedes add un nuevo contacto poniendo su numero y nombre seleccionand 'a' ");
            System.out.println("Puedes buscar un telefono a raiz de un nombre pulsando la letra 'b' ");
            System.out.println("Puedes ver la información de todos tus contactos ordenados alfabeticamente pulsando 'c' ");
            System.out.println("Puedes salir de tu agenta pulsando la tecla 'd' ");
            System.out.println("¿Que te apetece hacer?");
            opcion=sc.nextLine(); 
            switch(opcion){               
                case "a":
                    System.out.println("Has selecciona 'a'");
                    System.out.println("Introduzca un nombre:");
                    nombre=sc.nextLine();
                    System.out.println("Introduzca su telefono:");
                    numero=sc.nextLine();
                    nuevoContacto=new String[contacto.length+1];
                    for(int i=0;i<contacto.length;i++){
                        nuevoContacto[i]=contacto[i];
                    }
                    nuevoContacto[contacto.length]=nombre +":"+ numero;
                    contacto=nuevoContacto;
                    System.out.println("Contacto añadido");
                    break;
                case "b":
                    System.out.println("Has seleccionado 'b'");
                    System.out.println("Introduzca el nombre: ");
                    nombre=sc.nextLine();
                    for(int i=0;i<contacto.length;i++){
                        contactos=contacto[i];
                        if(contactos.startsWith(nombre+":")){
                        System.out.println("El telefono de "+nombre+" es "+contactos.split(":")[1]);
                        encontrado=true;
                    }
                    if(!encontrado){
                        System.out.println("No existe ese nombre.");
                        }
                    }
                    break;
                case "c":
                    if(contacto.length==0){
                        System.out.println("No hay contacto que mostrar.");
                    }
                    else{
                         for (int i=0; i<contacto.length-1;i++) {
                            for (int j=i+1;j<contacto.length;j++) {
                                if (contacto[i].compareTo(contacto[j]) > 0) {
                                    temp = contacto[i];
                                    contacto[i] = contacto[j];
                                    contacto[j] = temp;
                                }
                            }
                        }
                        // Imprimir contactos ordenados
                        System.out.println("Contactos ordenados:");
                        for (String contactoh : contacto) {
                            System.out.println(contactoh);
                        }
                    }
                    break;
                case "d":
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Ha introducido un parametro incorrecto.");
                    break;                   
            }
        }while(!opcion.equals("d"));
    }
}