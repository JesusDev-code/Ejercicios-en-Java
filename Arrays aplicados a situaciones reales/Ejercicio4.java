package com.mycompany.enunciadoscompletosrefuerzou5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio4 {
    static public void main(String[] args){
        /*Actividad 4.
        El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas
        estadísticas para conocer el nivel adquisitivo de los habitantes del municipio.
        Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el
        número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor (-1).
        Una vez terminada la entrada de datos, muestra la siguiente información:
            • Todos los sueldos introducidos ordenados de forma decreciente. -
            • El sueldo máximo y mínimo.
            • La media de los sueldos. -*/ 
        //Valores
        
        int nivel[]=new int[1],sueldos[],sueldo=0,contador=0,suma=0,maximo[],max,min,ordenar;
        double media;       
        Scanner sc=new Scanner(System.in);
        //introdución de sueldos     
        
        do{          
                System.out.println("Introduzca su sueldo si es tan amable: ");
                sueldo =sc.nextInt();
                if(sueldo!=-1){
                    sueldos=new int[nivel.length+1];
                    System.arraycopy(nivel,0, sueldos,0, nivel.length);
                    sueldos[nivel.length]=sueldo;
                    nivel=sueldos;
                    contador++;
                    suma=suma+sueldo;                   
                }
            
        }while(sueldo!=-1);
        
        nivel=ordenar(nivel);
        
        //imprimir
        
        System.out.println("El orden es: ");
        for(int orden:nivel){
            System.out.print(orden+" ");
        }
        System.out.println("");
        //media
        media=media(suma,contador);
        System.out.println("La media es "+media);
        //max y minimo
        
        max=nivel[0];
        min=nivel[contador-1];
        System.out.println("Mayor="+max);
        System.out.println("Menor= "+min);
    }
    static double media(int valor,int valor2){
        int media=0;
        media=valor/valor2;
        return(double) media;
    }
    static int[] ordenar(int valor[]){
        int temp=0;
        
            for(int i=0;i<valor.length-1;i++){
            for(int j=0;j<valor.length-1;j++){
                if(valor[j]>valor[j+1]){
                    temp=valor[j];
                    valor[j]=valor[j+1];
                    valor[j+1]=temp;
                }
            }
        }
       return valor;
    }
}

