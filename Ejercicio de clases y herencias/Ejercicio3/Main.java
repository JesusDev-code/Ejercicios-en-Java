package Ejercicio3;

public class Main {
	public static void main(String[] args) {

        // Crear una casa con 5 bombillas
        Casa casa = new Casa(5);

        // Mostrar el estado inicial de las bombillas
        System.out.println("Estado inicial de las bombillas:");
        casa.mostrarEstadoBombillas();

        // Activar el interruptor general
        casa.activarInterruptorGeneral();
        System.out.println("\nActivar el interruptor general:");
        casa.mostrarEstadoBombillas();

        // Activar algunos interruptores de bombillas individuales
        casa.activarInterruptorBombilla(0);
        casa.activarInterruptorBombilla(2);
        casa.activarInterruptorBombilla(4);
        System.out.println("\nActivar algunos interruptores de bombillas:");
        casa.mostrarEstadoBombillas();

        // Encender algunas bombillas
        casa.encenderBombilla(0);
        casa.encenderBombilla(2);
        System.out.println("\nEncender algunas bombillas:");
        casa.mostrarEstadoBombillas();

        // Apagar el interruptor general
        casa.apagarInterruptorGeneral();
        System.out.println("\nApagar el interruptor general:");
        casa.mostrarEstadoBombillas();

        // Encender el interruptor general de nuevo
        casa.activarInterruptorGeneral();
        System.out.println("\nActivar el interruptor general nuevamente:");
        casa.mostrarEstadoBombillas();
    }
}
