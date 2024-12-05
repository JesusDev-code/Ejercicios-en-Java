package com.mycompany.enunciadoscompletosu5github;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio9 {
     static public void main(String[] args){
        /*Actividad 9.
        Leer y almacenar “n” números enteros en una tabla, a partir de la que construirán otras dos
        tablas con los elementos con valores pares e impares de la primera, respectivamente. Las tablas
        pares e impares deben mostrarse ordenadas, ya que la tabla primera tenía sus valores
        introducidos ordenados.*/
        //Valores
        int tabla[];
        int inpar[];
        int par[];
        int n,numero,contadorpar=0,contadorinpar=0;    
        
        //adquisición de datos
        Scanner sc= new Scanner(System.in);
        System.out.println("¿cuantos numeros deseas almacenar?");
        n =sc.nextInt();
        tabla=new int[n];
        inpar=new int[n];
        par=new int[n];
        
        //completar tabla
        for(int i=0;i<tabla.length;i++){
            System.out.println("Dame un numero: ");
            numero =sc.nextInt();
            tabla[i]=numero;
        }
        
        //construcción de las dos tablas
        for(int i=0;i<tabla.length;i++){
            if(tabla[i]%2==0){
                par[contadorpar]=tabla[i];
                contadorpar++;
            }
            else{
                inpar[contadorinpar]=tabla[i];
                contadorinpar++;
            }
        }
        //copiar con copyoff
        par=Arrays.copyOf(par, contadorpar);
        inpar=Arrays.copyOf(inpar, contadorinpar);
        
        //ordenar numero par
        par=ordenar(par);

        //ordenar numero ipar
        inpar=ordenar(inpar);
         
        System.out.println("Los numeros pares son: ");
        //imprimir par
        for(int paress:par){
            System.out.println(paress);
        }
        System.out.println("Los numeros inpares son: ");
        //imprimir inpar
        for(int inparess:inpar){
            System.out.println(inparess);
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

