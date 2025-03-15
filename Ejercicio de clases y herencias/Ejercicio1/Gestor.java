package Ejercicio1;

public class Gestor {
	
	//Valores
    public String nombre;
    public String telefono;
    private double importeMaximoAutorizado = 10000.0;

    // Constructor de la clase Gestor
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Método para obtener el importe máximo autorizado
    public double getImporteMaximoAutorizado() {
        return importeMaximoAutorizado;
    }

    // Método para obtener el teléfono del gestor (público)
    public String getTelefono() {
        return telefono;
    }
}
