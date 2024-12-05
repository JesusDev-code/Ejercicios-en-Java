package com.mycompany.enunciadoscompletosu5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio6 {
        static public void main(String[] args){
        /*Actividad 6.
        Desarrolla una función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla
        ordenada de la longitud especificada, que se encuentre rellena con números pares aleatorios
        comprendidos en el rango desde 2 hasta fin (inclusive).*/
        
        //valores
        int longitud=5,fin=50;
        int resultado[];
        
        //Adquisición de datos
        resultado=rellenaPares(longitud,fin);
        for(int prueba:resultado){
            System.out.println(prueba);
        }
    }
     static int[] rellenaPares(int longitud, int fin){
         int aleatorio;
         int pares[]=new int[longitud];
         
         for(int i=0;i<longitud;i++){
             aleatorio=(int)(Math.random()*(fin-2+1)+2);
             if(aleatorio%2==0){
                 pares[i]=aleatorio;
             }
             else{
                 i--;
             }
         }
         return pares;
     
        }
}
