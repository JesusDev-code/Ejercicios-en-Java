package com.mycompany.enunciadoscompletosu5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio10 {
        static public void main(String[] args){
        /*Actividad 10.
        Diseñar una aplicación para gestionar un campeonato de programación, donde se introduce la
        puntuación (enteros) obtenidos por 5 programadores, conforme van terminando su prueba. La
        aplicación debe mostrar las puntuaciones ordenadas de los 5 participantes. En ocasiones,
        cuando finalizan los 5 participantes anteriores, se suman al campeonato programadores de
        exhibición, cuyos puntos se incluyen con el resto. La forma de especificar que no intervienen más
        programadores de exhibición es introducir como puntuación un -1.
        La aplicación debe mostrar, finalmente, los puntos ordenados de todos los participantes.*/ 
        //Valores
        int programador[]=new int[5];
        //int participante[];
        int numero,numero2;       
        //Adquisición de datos
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<programador.length;i++){
            System.out.println("Dame la nota del programador: ");
            numero= sc.nextInt();
            programador[i]=numero;
        }
        //Ordenar numeros
        programador=ordenar(programador);
        //Imprimir el orden
        System.out.println("La puntuación es: ");
        for(int programado:programador){
            System.out.println(programado+" ");
            System.out.println(" ");
        }
        //añadir participante
        do{
            System.out.println("Dame un numero de los nuevos participantes: ");
            numero2=sc.nextInt();
            if(numero2!=-1){
                int participante[]=new int[programador.length+1];
                System.arraycopy(programador, 0, participante, 0, programador.length);
                participante[programador.length]=numero2;
                programador=participante;
            }
        }while(numero2!=-1);
        //Llamada a metodo burbuja
        programador=ordenar(programador);
         //imprimir finaal
        System.out.println("Esto es los puntos ordenados: ");
        for(int ojete:programador){
            System.out.println(ojete);
        }
    }
    static int[] ordenar(int valor[]){
         int temp=0;
         for(int i=0;i<valor.length-1;i++){
             for(int j=0;j<valor.length-1;j++){
                 if(valor[j]<valor[j+1]){
                     temp=valor[j];
                     valor[j]=valor[j+1];
                     valor[j+1]=temp;
                 }
             }
         }
         return valor;
     }
}

