package com.mycompany.enunciadoscompletosu5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio11 {
        static public void main(String[] args){
        /*Actividad 11.
        Escribir la función: int[] eliminarMayores(int t[], int valor), que crea y devuelve una copia de la
        tabla t donde se han eliminado todos los elementos que son mayores que valor.*/
        //Valores
        int t[]={52,12,96,5,54};
        int valor=12;
        int resultado[];
        resultado=eliminarMayores(t,valor);
        
        for(int prueba:resultado){
            System.out.println(prueba);
        }
        
    }
    static int[] eliminarMayores(int t[], int valor){
        int contador=0;
        int resultado[];
        int posicion=0;
        for(int i=0;i<t.length;i++){
            if(t[i]<=valor){
                contador++;
            }
        }
        resultado=new int[contador];
        for(int i=0;i<t.length;i++){
            if(t[i]<=valor){
                resultado[posicion]=t[i];
                posicion++;
            }
        }
        return resultado;
    }
}
