package Ejercicio3;

public class InterruptorGeneral {

    private boolean encendido;  // Estado del interruptor general

    // Constructor del interruptor general
    public InterruptorGeneral() {
        this.encendido = true;  // Inicialmente el interruptor general está encendido
    }

    // Método para activar el interruptor general
    public void activar() {
        encendido = true;
    }

    // Método para apagar el interruptor general
    public void apagar() {
        encendido = false;
    }

    // Método para obtener el estado del interruptor general
    public boolean estaEncendido() {
        return encendido;
    }
}
