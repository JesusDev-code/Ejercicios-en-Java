
package com.mycompany.enunciadoscompletosrefuerzou5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        //Valores
        boolean[][] mapa = {
            {false, true, false, false}, // Lugar 0
            {false, false, true, false}, // Lugar 1
            {false, false, false, true}, // Lugar 2
            {false, false, false, false} // Lugar 3
        };

        //Adquisición de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el lugar de inicio (0 a 3): ");
        int lugarInicio = scanner.nextInt();
        System.out.println("Introduce el lugar de destino (0 a 3): ");
        int lugarDestino = scanner.nextInt();

        // Verificar si se puede viajar
        boolean puedeViajar = esPosibleViajar(mapa, lugarInicio, lugarDestino);

        if (puedeViajar) {
            System.out.println("Es posible viajar del lugar " + lugarInicio + " al lugar " + lugarDestino);
        } else {
            System.out.println("No es posible viajar del lugar " + lugarInicio + " al lugar " + lugarDestino);
        }    
    }

    public static boolean esPosibleViajar(boolean[][] mapa, int lugarInicio, int lugarDestino) {
        // Array para marcar si ya visitamos un lugar
        boolean[] visitados = new boolean[mapa.length];

        // Llamar a la función de búsqueda con el lugar inicial
        return buscarCamino(mapa, lugarInicio, lugarDestino, visitados);
    }

    public static boolean buscarCamino(boolean[][] mapa, int actual, int destino, boolean[] visitados) {
        // Si estamos en el destino, hemos encontrado el camino
        if (actual == destino) {
            return true;
        }

        // Marcamos el lugar actual como visitado
        visitados[actual] = true;

        // Recorremos las conexiones desde el lugar actual
        for (int i = 0; i < mapa[actual].length; i++) {
            // Si hay conexión y no lo hemos visitado aún
            if (mapa[actual][i] && !visitados[i]) {
                // Llamamos a la función recursivamente para buscar desde este lugar
                if (buscarCamino(mapa, i, destino, visitados)) {
                    return true; 
                }
            }
        }
        return false;
    }
}
