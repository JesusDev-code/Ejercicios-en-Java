package com.mycompany.enunciadoscompletosrefuerzou5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio8 {
        static public void main (String[] args){
        /*Actividad 8.
        Escribe un programa que solicite los elementos de una matriz de tamaño 4x4. La aplicación debe
        decidir si la matriz introducida corresponde a una matriz mágica, que es aquella donde la suma
        de los elementos de cualquier fila o de cualquier columna valen lo mismo.*/
  
        // Definir tamaño de la matriz
        int n = 4;
        int[][] matriz = new int[n][n];
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario los elementos de la matriz
        System.out.println("Introduce los elementos de una matriz de tamaño 4x4:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Verificar si la matriz es mágica
        boolean esMagica = esMatrizMagica(matriz, n);
        if (esMagica) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz NO es mágica.");
        }
    }

    // Función para comprobar si la matriz es mágica
    public static boolean esMatrizMagica(int[][] matriz, int n) {
        int sumaFila = 0;
        boolean esMagica = true;
        // Sumar los elementos de la primera fila
        for (int i = 0; i < n; i++) {
            sumaFila += matriz[0][i];
        }
        // Verificar las sumas de todas las filas
        for (int i = 1; i < n; i++) {
            int sumaActual = 0;
            for (int j = 0; j < n; j++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaFila) {
                esMagica = false;  // Si alguna fila no tiene la misma suma, no es mágica
            }
        }
        // Verificar las sumas de todas las columnas
        for (int i = 0; i < n; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < n; j++) {
                sumaColumna += matriz[j][i];
            }
            if (sumaColumna != sumaFila) {
                esMagica = false;  // Si alguna columna no tiene la misma suma, no es mágica
            }
        }
        // Retornar el resultado final
        return esMagica;
    }
}