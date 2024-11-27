/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasounidad5;
import java.util.Scanner;
/**
 *
 * @author er_pi
 */
public class ejercicio10 {
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
        int puntuacion[]=new int[5];
        int temp=0;
        int temp2=0;
        int m=5;//numeros de participantes
        ;
        int valor=0;
        //Función del programa
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<puntuacion.length;i++){
            System.out.println("Dime las puntuaciones de los programaciores iniciales: ");
            puntuacion[i]=sc.nextInt();
        }
        //Ordenar puntuacion
        for(int i=0;i<puntuacion.length;i++){
            for(int j=i;j<puntuacion.length;j++){
                if(puntuacion[j]>puntuacion[i]){
                    temp=puntuacion[i];
                    puntuacion[i]=puntuacion[j];
                    puntuacion[j]=temp;
                }
            }
        }
        //Mostrar el orden
        for(int mostrar:puntuacion){
            System.out.println("El orden de las puntuaciones son estas :"+mostrar);
        }
        //suma de participantes
        do{
            
                System.out.println("Dame el numero de participantes: (-1 para finalizar)");
                valor=sc.nextInt();
                if(valor==-1){
                    
                }
                else{
                    //he creado otra tabla y el tamaño es la misma que la de inicio pero con 1+ que sería el dato a añadir
                    int participantes[]=new int[puntuacion.length+1];
                    //copio la tabla 
                    System.arraycopy(puntuacion,0,participantes,0,puntuacion.length);
                    //añado el valor a la nueva posicion
                    participantes[puntuacion.length]=valor;
                    //La tabla inicial es la miesma que participantes
                    puntuacion=participantes;
                }
                
            
        }while(valor!=-1);
        //Ordenar la tabla copiada
        
        for(int i=0;i<puntuacion.length;i++){
            for(int j=i;j<puntuacion.length;j++){
                if(puntuacion[j]<puntuacion[i]){
                    temp2=puntuacion[i];
                    puntuacion[i]=puntuacion[j];
                    puntuacion[j]=temp2;
                }
            }
        }
        //imprimir resultado
        for(int resultadoh: puntuacion){
            System.out.println("El numero de participantes ordenadas es :"+resultadoh);
        }
     }
   }