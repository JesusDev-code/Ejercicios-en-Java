package Ejercicio3;

public class Bombilla {

    private boolean encendida;  // Estado de la bombilla (encendida o apagada)
    private boolean interruptorActivado;  // Interruptor individual de la bombilla

    // Constructor de la bombilla
    public Bombilla() {
        this.encendida = false;  // Inicialmente apagada
        this.interruptorActivado = false;  // Inicialmente el interruptor está apagado
    }

    // Método para encender la bombilla (solo si el interruptor está activado)
    public void encender() {
        if (interruptorActivado) {
            encendida = true;
        }
    }

    // Método para apagar la bombilla (solo si el interruptor está activado)
    public void apagar() {
        if (interruptorActivado) {
            encendida = false;
        }
    }

    // Método para obtener el estado de la bombilla (encendida o apagada)
    public String obtenerEstado() {
        if (interruptorActivado) {
            return encendida ? "Encendida" : "Apagada";
        } else {
            return "Sin energía";
        }
    }

    // Activar o desactivar el interruptor de la bombilla
    public void activarInterruptor() {
        interruptorActivado = true;
    }

    public void desactivarInterruptor() {
        interruptorActivado = false;
        encendida = false;  // Si el interruptor se desactiva, la bombilla se apaga automáticamente
    }
}
