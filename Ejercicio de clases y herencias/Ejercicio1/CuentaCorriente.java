package Ejercicio1;

public class CuentaCorriente {
	
	//Valores 
    private String dni;
    private String nombre;
    private double saldo;
    
    //Valores estaticos
    private static String nombreBanco = "Mi Banco";  // Atributo estático para el banco
    private Gestor gestor;  // Relación con la clase Gestor

    // Constructor 1: Solo DNI y nombre, saldo inicial 0
    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0.0);
    }

    // Constructor 2: DNI, nombre y saldo inicial
    public CuentaCorriente(String dni, String nombre, double saldoInicial) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    // Métodos de operaciones

    // Sacar dinero: devuelve true si la operación fue exitosa, false si no hay suficiente saldo
    public boolean sacarDinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Ingresar dinero: incrementa el saldo
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    // Mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
        System.out.println("Banco: " + nombreBanco);
    }

    // Métodos estáticos para el nombre del banco
    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombre) {
        nombreBanco = nombre;
    }

    // Asignar un gestor a la cuenta corriente
    public void asignarGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    // Obtener el gestor de la cuenta corriente
    public Gestor obtenerGestor() {
        return gestor;
    }

}
