package com.mycompany.enunciadoscompletosu5github;

/**
 *
 * @author Jesus
 */
public class Ejercicio7 {
        static public void main (String[] args){
            
        /* Ejercicio7
            
        Definir una función que tome como parámetros dos tablas, la primera con los 6 números de una
        apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la combinación ganadora.
        Debes devolver el número de aciertos.*/
        //Valores
        
        int primitiva[]={5,25,63,41,52};
        int papeleta[]={4,6,85,63,5};
        
        System.out.println("El numero de aciertos es "+aciertos(primitiva,papeleta));
    }
    static int aciertos(int valor[],int valor2[]){
        int contador=0;
        
        for(int i=0;i<valor.length;i++){
            for(int j=0;j<valor2.length;j++){
                if(valor[i]==valor2[j]){
                    contador++;
                }
            }
        }
        return contador;
    }
}


