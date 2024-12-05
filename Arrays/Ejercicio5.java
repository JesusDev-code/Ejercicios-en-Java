package com.mycompany.enunciadoscompletosu5github;

/**
 *
 * @author Jesus
 */
public class Ejercicio5 {
     static public void main(String[] args){
        /*Actividad 5.
        Crear una función int maximo(int t[]), que devuelva el valor máximo (mayor) de los elementos
        contenidos en la tabla t.*/
        int t[]={5,2,62,85,10,985};
        int resultado;
        resultado=maximo(t);
        System.out.println("El valor maximo es: "+resultado);
        
    }
    static int maximo(int t[]){
        int maximo=0;
        for(int i=0;i<t.length;i++){
            if(t[i]>maximo){
                maximo=t[i];
            }
        }
        return maximo;
    }
}

