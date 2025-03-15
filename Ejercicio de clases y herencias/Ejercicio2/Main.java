package Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer hora, minuto y segundo desde el teclado
        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduce el minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Introduce el segundo: ");
        int segundo = sc.nextInt();

        // Crear objeto Hora
        Hora horaActual = new Hora(hora, minuto, segundo);

        // Mostrar la hora introducida
        System.out.print("Hora introducida: ");
        horaActual.mostrarHora();

        // Leer el número de segundos a sumar
        System.out.print("Introduce el número de segundos a sumar: ");
        int n = sc.nextInt();

        // Mostrar la hora incrementada en un segundo n veces
        for (int i = 1; i <= n; i++) {
            horaActual.incrementarSegundo();
            System.out.print("Hora después de " + i + " segundo(s): ");
            horaActual.mostrarHora();
        }
    }
}
