package com.mycompany.enunciadoscompletosrefuerzou5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio1 {

    public static void main(String[] args) {
             /*Actividad 1.
        Realiza un función: int[] buscarTodos(int t[], int clave), que crea y devuelve una tabla con todos
        los índices de los elementos donde se encuentra la clave de búsqueda. En el caso de que clave
        no se encuentre en la tabla t, la función devolverá una tabla vacía.*/
        //Valores
        int t[]={5,6,2,8};
        int clave=5;
        int solucion[];
        solucion=buscarTodos(t,clave);
        for(int prueba:solucion){
            System.out.println(prueba);
        }
    }
    static int[] buscarTodos(int t[], int clave){
        int contador=0;
        int tabla[];
        int posicion=0;
        for(int i=0;i<t.length;i++){
            if(t[i]==clave){
                contador++;
            }
        }
        tabla=new int[contador];
        for(int i=0;i<t.length;i++){
            if(t[i]==clave){
                tabla[posicion]=i;
                posicion++;
            }
        }
        return tabla;
    }
    
}
