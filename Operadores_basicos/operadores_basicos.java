/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codigolimpio;
import java.util.*;
/**
 *
 * @author Jesus
 */
public class operadores_basicos {
    public static void main(String[] args) {
       ejercicio6();
        
    }
    public static void ejercicio1() {
    
        System.out.println("Hola,encantado de conocerte");
}
    public static void ejercicio2() {
        int numero;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        
        System.out.println("El valor es " + numero);
    }
    public static void ejercicio3(){
        int edad;
        int yearnext;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu edad? ");
        edad = sc.nextInt();
        yearnext = edad + 1;
        
        System.out.println("Para el siguiente anho tendrás" + yearnext);
        //variante System.out.println("Para el siguiente año tendras"+ (edad + 1)) 
        
    }
    public static void ejercicio4() {
        int yearNow;
        int nacimientoUsuario;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Podrias decirme que fecha estamos hoy?");
        yearNow = sc.nextInt();
        System.out.println("¿Serias tan amable de decirme en que fecha naciste?");
        nacimientoUsuario = sc.nextInt();
        
        System.out.println("Por lo que dicen mis calculos y gracias a lo que usted nos ha proporcionado tiene " + (yearNow - nacimientoUsuario) + "años");
        
    }
    public static void ejercicio5() {//cambiar por numeros enteros
        int programacion;
        int BaseDeDatos;
        float resultados;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual fue tu puntuación en programacion?");
        programacion = sc.nextInt();
        System.out.println("¿Cual ha sido tu puntuacion en BaseDeDatos?");
        BaseDeDatos = sc.nextInt();
        resultados = ((programacion + BaseDeDatos)/2);
        
        
        
        System.out.println("Por los resultados adquiridos su media aritmetica es " + resultados);
    }
    public static void ejercicio6() {
        int edad;
        String resultado;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Podria decirme su edad?");
        edad = sc.nextInt();
        
        resultado = (edad>=18) ? ("Eres mayor de edad"):("No eres mayor de edad");
        
        System.out.println(resultado);
    }
    public static void ejercicio7() {
        int numero;
        boolean esPar;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Podria darme un numerito?");
        numero = sc.nextInt();
        
        esPar = ((numero &2)==0);
        System.out.println(esPar); //----- CON BOOLEAN
    }
    public static void ejercicio8() {
        int valor1;
        int valor2;
        String operador;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga su primer valor");
        valor1 = sc.nextInt();
        System.out.println("Diga su segundo valor");
        valor2 = sc.nextInt();
        
        System.out.println("¿Que operacion desea realizar?,por favor, escriba la funcion a realizar.");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        operador = sc.next();
        
        if(operador.equals("Sumar")){
            System.out.println("La suma de los valores dados es " + (valor1 + valor2));
            
        }
        else if(operador.equals("Restar")){
            System.out.println("La resta de los valores dados es " + (valor1 - valor2));
            
        }
        else if(operador.equals("Multiplicar")){
            System.out.println("La multiplicacion de los valores dados es " + (valor1 * valor2));
            
        }
        else if(operador.equals("Dividir")){
            System.out.println("La division de los valores dados es " + (valor1 / valor2));
            
        }
        else{
            System.out.println("El programa no reconoce lo que ha puesto, basicamente porque el programador es estudiante,intentelo de nuevo");
        }
        
    }
    public static void ejercicio8tern() {
        int valor1;
        int valor2;
        int resultado;
        String operador;
        // añadir double por si la división dan decimales double
        
        Scanner calculo = new Scanner(System.in);
        System.out.println("Ponme un dato que te voy a hacer algo super chulo ");
        valor1 = calculo.nextInt();
        System.out.println("Para que veas la magia de Java me tienes que dar otro numerito");
        valor2 = calculo.nextInt();
        
        System.out.println("Muy bien ahora indicame que quieres que haga:");
        System.out.println("Sumar");
        System.out.println("Restar");
        System.out.println("Multiplicar");
        System.out.println("Dividir");
        
        operador = calculo.next();
        
        
        resultado = operador.equals("Sumar") ? (valor1 + valor2):
                    operador.equals("Restar") ? (valor1 - valor2):
                    operador.equals("Multiplicar") ? (valor1 * valor2):
                    operador.equals("Dividir") ? (valor1 + valor2): 0 ; // al final pongo 0 porque es la opción que pongo si no eligen ninguno.
        if(resultado==0) {
            System.out.println("Vaya, te has pasado de listo y has dado algo que no entrabas en mis planes,vuelve a intentarlo");
        }
        else{
            System.out.println("Tu resultado es " + resultado);
        }
    }
    public static void ternarios() {
        /**Ejercicio: Comprobar si un número es par o impar usando el operador ternario
Pide al usuario que introduzca un número.
Usa el operador ternario para verificar si el número es par o impar.
Muestra un mensaje que diga si el número es par o impar.**/
        int numero;
        String resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero ");
        numero = sc.nextInt();
        resultado = ((numero%2)== 0) ? "par" : "impar";
        
        System.out.println("El numero es "+ resultado);
    }
    public static void ternarios2() {
        /**Ejercicio: Determinar si un número es positivo, negativo o cero usando el operador ternario

Pide al usuario que introduzca un número.
Usa el operador ternario para verificar si el número es positivo, negativo o cero.
Muestra un mensaje que indique el resultado.**/
        int dato1;
        String resultado;
        
        Scanner dato = new Scanner(System.in);
        System.out.println("Dame un dato");
        dato1 = dato.nextInt();
        
        resultado  = (dato1==0)? "cero":(dato1>=0) ? "positivo" : "negativo";
        System.out.println("El numero es " + resultado);
    }
    public static void ternarios3() {
        /**Ejercicio: Calificar una nota
Descripción: Pide al usuario que introduzca una nota (un número entre 0 y 100). Usa un operador ternario para determinar
la calificación de la nota según la siguiente regla:

Si la nota es mayor o igual a 60, la calificación es "Aprobado".
Si la nota es menor que 60 y mayor o igual a 40, la calificación es "Suspenso".
Si la nota es menor que 40, la calificación es "Reprobado".**/
       int nota;
       String resultado;
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime tu nota");
       nota = sc.nextInt();
       
       if (nota >= 0 && nota <= 100) { //  se usa && para unir varias cosas
        // Usa el operador ternario correctamente
        resultado = (nota >= 60) ? "Aprobado" : (nota >= 40) ? "Suspenso" : "Reprobado";
       }  
       else {
        resultado = "Nota inválida"; // Mensaje para entradas incorrectas
       }
    
       System.out.println("Tu calificación es: " + resultado);
       
        
    }
    public static void ternarios4() {
        /**Ejercicio 1: Verificar la Paridad de un Número
Descripción: Pide al usuario que introduzca un número y usa un operador ternario para verificar si es par o impar. Muestra el resultado.**/
        int numero;
        String resultado;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un nunero");
        numero = sc.nextInt();
        resultado = (numero % 2==0) ? ("espar"): ("esimpar");
        
        System.out.println("Tu numero es " + resultado);
        
    }
    public static void ternarios5() {
        /**Ejercicio 2: Comparar dos Números
Descripción: Solicita al usuario que ingrese dos números y usa un operador ternario para
* determinar cuál de los dos es mayor. Muestra un mensaje indicando el número mayor o si son iguales.**/
        int dato1;
        int dato2;
        String resultado;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        dato1 = sc.nextInt();
        System.out.println("Dime otro numero");
        dato2 = sc.nextInt();
        
        resultado = (dato1<dato2) ? ("dato2 es mayor que dato1"):
                    (dato1>dato2) ? ("Dato1 es mayor que dato2"):
                    ("Ambos numeros son iguales");
        System.out.println(resultado);
        
        
        
        
    }
    public static void programaejercicios() {
        System.out.println("El ejercicio 1 consiste en poner una frase en consola.");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        ejercicio1();
        System.out.println("El ejercicio 2 consiste en pedir un numero por teclado y luego lo muestre por consola.");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        ejercicio2();
        System.out.println("El ejercicio 3 consiste en preguntar al usuario su edad y luego mostrar la que tendra el año que viene");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        ejercicio3();
        System.out.println("El ejercicio 4 consiste en pedir la fecha actual y la fecha de nacimiento del usuario para calcular su edad");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        ejercicio4();
        System.out.println("El ejercicio 5 consiste en calcular la media aritmetica de dos notas ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        ejercicio5();
        System.out.println("El ejercicio 6 consiste en solicitar al usuario su edad y le indique si es mayor de edad");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        ejercicio6();
        System.out.println("El ejercicio 7 consiste en pedir al usuario un numero y el programa mediante un literal booleano le diga si es par o no");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        ejercicio7();
        System.out.println("El ejercicio 8 consiste en crear una calculadora simple");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        ejercicio8tern();
        
        
    }
}


