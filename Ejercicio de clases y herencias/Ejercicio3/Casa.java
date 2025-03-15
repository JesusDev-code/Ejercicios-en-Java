package Ejercicio3;

public class Casa {

    private InterruptorGeneral interruptorGeneral;  // Interruptor general de la casa
    private Bombilla[] bombillas;  // Arreglo de bombillas
    private int numeroBombillas;  // Número de bombillas en la casa

    // Constructor de la casa
    public Casa(int numeroBombillas) {
        interruptorGeneral = new InterruptorGeneral();
        this.numeroBombillas = numeroBombillas;
        bombillas = new Bombilla[numeroBombillas];  // Inicializamos el arreglo de bombillas
        for (int i = 0; i < numeroBombillas; i++) {
            bombillas[i] = new Bombilla();  // Crear las bombillas
        }
    }

    // Activar el interruptor general
    public void activarInterruptorGeneral() {
        interruptorGeneral.activar();
        for (int i = 0; i < bombillas.length; i++) {
            // Si el interruptor general se activa, las bombillas responden según su interruptor
            if (bombillas[i].obtenerEstado().equals("Encendida")) {
                bombillas[i].encender();
            }
        }
    }

    // Apagar el interruptor general
    public void apagarInterruptorGeneral() {
        interruptorGeneral.apagar();
        for (int i = 0; i < bombillas.length; i++) {
            // Si el interruptor general se apaga, todas las bombillas se apagan
            bombillas[i].apagar();
        }
    }

    // Activar el interruptor de una bombilla por su índice
    public void activarInterruptorBombilla(int indice) {
        if (indice >= 0 && indice < bombillas.length) {
            bombillas[indice].activarInterruptor();
        }
    }

    // Desactivar el interruptor de una bombilla por su índice
    public void desactivarInterruptorBombilla(int indice) {
        if (indice >= 0 && indice < bombillas.length) {
            bombillas[indice].desactivarInterruptor();
        }
    }

    // Encender una bombilla por su índice
    public void encenderBombilla(int indice) {
        if (indice >= 0 && indice < bombillas.length) {
            bombillas[indice].encender();
        }
    }

    // Apagar una bombilla por su índice
    public void apagarBombilla(int indice) {
        if (indice >= 0 && indice < bombillas.length) {
            bombillas[indice].apagar();
        }
    }

    // Mostrar el estado de todas las bombillas
    public void mostrarEstadoBombillas() {
        for (int i = 0; i < bombillas.length; i++) {
            System.out.println("Bombilla " + (i + 1) + ": " + bombillas[i].obtenerEstado());
        }
    }
}