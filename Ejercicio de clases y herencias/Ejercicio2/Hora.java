package Ejercicio2;

public class Hora {
	//Valores
    protected int hora;
    protected int minuto;
    protected int segundo;

    // Constructor de la clase Hora
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Métodos set/get para los atributos hora, minuto y segundo
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    // Método para incrementar la hora en 1 segundo
    public void incrementarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    // Método para mostrar la hora en formato hh:mm:ss
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
}