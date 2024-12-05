package com.mycompany.enunciadoscompletosrefuerzou5github;
/**
 *
 * @author Jesus
 */
public class Ejercicio7 {
     static public void main(String[] args){
        /*Implementa una función: int[] suma(int t[], int numElementos), que crea y devuelve una tabla
        con las sumas de los numElementos elementos consecutivos de t. Por ejemplo: t = [10,1,5,8,9,2].
        Si los elementos de t se agrupan de 3 en 3, se harán las sumas:
        10+1+5 = 46
        1+5+8 = 14
        5+8+9 = 22
        8+9+2 = 19
        Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].*/
        // Valores
        int[] t = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;
        int[] resultado = suma(t, numElementos);
        // Imprimir el resultado
        System.out.print("Resultado: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    // Función suma
    public static int[] suma(int t[], int numElementos) {
        // Calcular cuántos grupos de numElementos se pueden formar
        int numGrupos = t.length - numElementos + 1;
        
        // Crear el arreglo para almacenar las sumas
        int[] resultado = new int[numGrupos];
        
        // Sumar los elementos de t de numElementos en numElementos
        for (int i = 0; i < numGrupos; i++) {
            int suma = 0;
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultado[i] = suma;
        }
        return resultado;
    }
}
