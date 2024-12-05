package com.mycompany.enunciadoscompletosu5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio8 {
       static public void main (String[] args){
        /*Actividad 8.
        Implementar una función: int[] sinRepetidos(int t[]), que construye y devuelve una tabla de la
        longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos.*/
        //Valores
        int tabla[]={2,2,3,3,6,6,8};
        int resultado[];
        resultado=sinRepetidos(tabla);
        for(int rep:resultado){
            System.out.println(rep);
        }
    }
       //Función Sin repetidos
    static int[] sinRepetidos(int t[]){
        int provisional[]=new int[t.length];
        int resultado[];
        int contador=0;
        boolean rep=false;
        
        
        for(int i=0;i<t.length;i++){
            rep = false;
            for(int j=0;j<provisional.length;j++){
                if(t[i]==provisional[j]){
                    rep=true;
                }
               
            }
           
             if(!rep){
                    provisional[contador]=t[i];
                    contador++;
                }
        }
        resultado=new int[contador];
        for(int i=0;i<resultado.length;i++){
            resultado[i]=provisional[i];
        }
        return resultado;
    }
}

