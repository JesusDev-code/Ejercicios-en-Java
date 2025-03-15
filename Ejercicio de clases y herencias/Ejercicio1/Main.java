package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear cuenta corriente con DNI y nombre
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Juan Perez");

        // Crear gestor
        Gestor gestor1 = new Gestor("Carlos Garcia", "666123456");

        // Asignar gestor a la cuenta
        cuenta1.asignarGestor(gestor1);

        // Mostrar información de la cuenta
        cuenta1.mostrarInformacion();

        // Mostrar información del gestor
        System.out.println("Gestor: " + cuenta1.obtenerGestor().nombre);
        System.out.println("Teléfono del gestor: " + cuenta1.obtenerGestor().getTelefono());

        // Realizar algunas operaciones con la cuenta
        cuenta1.ingresarDinero(500.0);  // Ingresar dinero
        cuenta1.mostrarInformacion();   // Mostrar información actualizada

        if (cuenta1.sacarDinero(200.0)) {  // Intentar sacar dinero
            System.out.println("Operación exitosa al sacar dinero.");
        } else {
            System.out.println("No hay suficiente saldo para sacar el dinero.");
        }

        cuenta1.mostrarInformacion();   // Mostrar información después de la operación
    }
}
