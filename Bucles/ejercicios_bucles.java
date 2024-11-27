/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciounidad3;
import java.util.*;
/**
 *
 * @author Jesus
 */

public class ejercicios_bucles {

    public static void main(String[] args) {
        
        ejercicio13b();
    }
    public static void ejercicio1() {
        /*Actividad 1.
Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es
positivo y su cuadrado. La condición de parada es que se introduzca un cero.*/
        
        //Valores
        
        int numero;
        
        //adquisición de datos
        
        Scanner sc = new Scanner(System.in);
        
        
        do {
            System.out.println("Dame un numero: ");
            numero = sc.nextInt();
        
            if((numero % 2) ==0) {
                System.out.println("El numero " + numero + " es par y ademas ");
            }
            else{
                System.out.println("El numero " + numero + " es impar y ademas ");
            }
            if(numero>=0){
                System.out.println("es un numero positivo.");
            }
            else {
                System.out.println("es un numero negativo.");
            }
            
            System.out.println("y el cuadrado de "+ numero + " es " + (numero*2));
                
            }while(numero!=0);
            
            System.out.println("El bucle ha terminado.");
    }
    
    public static void ejercicio2() {
        /*Actividad 2.
Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un
centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la
suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores
de edad.*/
        
        //Valores
        int edades,sumaDeEdades=0,numerosDeAlumnos=0,mayoresDeEdad=0;
         //Obtención de datos
         
         Scanner sc = new Scanner(System.in);
         
         //Bucle
         do {
             System.out.println("Dime la edad del alumno: ");
             edades = sc.nextInt();
             sumaDeEdades = (edades+sumaDeEdades);
             numerosDeAlumnos++;
             if(edades>=18) {
                 mayoresDeEdad++;
             }
         } while(edades>0);
         
         //resoluciçon
         System.out.println("La suma de todas las edades introducidas es: "+sumaDeEdades);
         System.out.println("La media es: "+(sumaDeEdades)/numerosDeAlumnos);
         System.out.println("El numero de alumnos introducidos es: "+numerosDeAlumnos);
         System.out.println("El numeros de mayores de edad es: "+mayoresDeEdad);
         
    }
    
    public static void ejercicio3() {
        /*Actividad 3.
Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100
(generado de forma aleatoria). Para ello se introduce por teclado una serie de números, para los
que se indica: “mayor” o “menor”, según sea el valor respecto al número secreto. La condición
de parada es que se acierte o que se rinda el usuario (-1).*/
        
        //Valores
        int numero;
        int numeroAleatorio;
  
        
        //obtención de datos
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al fantastico juego llamado ``El numero secreto´´ es fantastico porque es mi primer juego"
                    + "en java, basicamente.¿en que consiste el juego? tendrás que acertar un numero entre 1 a 100"
                    + "si es dificil pero se te indicara si el numero que has dicho es menor o mayor al correcto asique comencemos. ");
        numeroAleatorio = (int) (Math.random() * 100) + 1;/*Donde n es hasta el número que quieres que llegue,
        + 1 para que nunca tengas un 0 y el cast a int porque Math#random
        arroja un valor de tipo double.*/
        
        
        //JUEGO EL NUMERO SECRETOHH
        
        do {
            System.out.println("Dime un numero: ");
                    numero = sc.nextInt();
                    
                    if(numero>numeroAleatorio) {
                        System.out.println("El numero secreto es inferior.");
                    }
                    else if(numero<numeroAleatorio) {
                        System.out.println("El numero secreto es mayor.");
                    }
                    
            
        }while((numero!=-1) && (numero!=numeroAleatorio) ); //EL BUCLE CONTINUA SI AMBAS SON VERDADERAS SI NO PARA POR ESO SE AÑADE &&
        
        //RESULTADO
        
        if(numero==-1){
            System.out.println("Vaya,no lo has averiguado el numero secreto era: "+ numeroAleatorio);
        }
        if(numero==numeroAleatorio) {
            System.out.println("Felicidades! el numero aleatorio era: " + numeroAleatorio+ " HAS GANADO!");
        }
        
    }
    
    public static void ejercicio4() {
        /*Actividad 4.
Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El usuario tendrá que
introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100.
Mientras la solución sea correcta, el juego sigue. En caso contrario el juego se acaba y se indica
cuántas operaciones han sido correctas.*/
        
        //Valores
        
        int numero,numeroAleatorio1,numeroAleatorio2,operacionesCorrectas=0;
        
        //Obtención de datos
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al juego de agilidad mental, te vamos a dar dos numeros al azar y nos tendrás que decir el"
                + "resultado de su suma ¿listo?");
        
        //NUMEROS ALEATORIOS
        
        
        
        
        //BUCLE
        
        do {
            //TENGO QUE METER LA FUNCION RANDOM DENTRO DEL BUCLE PARA QUE SE VAYA ACTUALIZANDO
            
            numeroAleatorio1 = (int) (Math.random() * 100)+1;
            numeroAleatorio2 = (int) (Math.random() * 100)+1;
            
            System.out.println("Dime la suma de ambos numeros: "+numeroAleatorio1+"y" + numeroAleatorio2);
            numero =sc.nextInt();
            
            //Si el numero que te doy es el correcto
            if(numero ==(numeroAleatorio1+numeroAleatorio2)) {
                operacionesCorrectas ++;
                
            }
        }while(numero==(numeroAleatorio1+numeroAleatorio2));
        
        System.out.println("Vaya, no has acertado pero bueno has hecho: "+operacionesCorrectas+ " aciertos. FELICIDADES!");
        
    }
    
    public static void ejercicio5() {
        /*Actividad 5.
Desarrollar una aplicación en la que introduzcamos un valor por teclado “n” y nos mostrará todos
los números desde 0 hasta “n”.*/
        
        //VALORES
        int numero;
        
        //OBTENCIÓN DE DATOS
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero:");
        numero = sc.nextInt();
        
        for(int i=0;i<=numero;i++){
            System.out.println("El orden de menos a mas es :"+i);
            
        }
        
    }
    
    public static void ejercicio6() {
       /*Actividad 6.
Desarrolla un programa para escribir todos los múltiplos de 7 menores que 100.*/
       
       //Inicio con i que en este caso es 7 que es el número,luego i debe ser menor que 100 y i =7 es lo que sube cada uno
       for(int i =1;i<100;i+=7){
           System.out.println(i);
           //if(7%i==0){ sirve también de esta forma
           // }
       }
    }
    
    public static void ejercicio7() {
        /*Actividad 7.
Desarrollar un programa que pida 10 números enteros por teclado y devuelva la media.*/
        //Variables
        int i = 0,numero,sumaDeNumero=0,media=0,numeroPreguntado=0; //importante establecer el inicio en este caso 0
        
        Scanner sc = new Scanner(System.in);
        
        
        while(i < 10) {
            System.out.println("Dame un numero " + "(" + numeroPreguntado + "):" );
            numero = sc.nextInt();
            sumaDeNumero=(numero+sumaDeNumero);
            media++;
            i++;
            numeroPreguntado++;
        }
        System.out.println("La suma de todos es :" + sumaDeNumero+ " y la media es "+ (sumaDeNumero)/10);
        
    }
    
    public static void ejercicio8() {
       /* -7*Actividad 8.
Implementar una aplicación que pida al usuario un número entre el 1 y el 10. El programa debe
mostrar la tabla de multiplicar de dicho número.*/
        //Creo un if entre 1-10 ¿crear bucles dentro de los ifs?
        
        //Valores
        
        int numero,multiplicacion=0;
        
        //Recopilación de datos
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Dime un numero entre 1 y 10:");
        numero = sc.nextInt();
        
        if((numero>=1) && (numero<=10)) { //creo la variable i luego creo la variable de las veces que se va a multiplicar (multiplicación) y luego pongo el numero de veces que voy a multiplicar
            for (int i=0;multiplicacion<=10;i=(numero*multiplicacion)){
                        System.out.println("La multiplicacion de " + numero + " por "+ multiplicacion + " es "+i);
                        multiplicacion++;
                        i++;
                    }
        }
        else{
            System.out.println("El numero que has dado no entra dentro del 1 y 10.");
        }
        
        
        
    }
      
    
    public static void ejercicio9() {
        /*Actividad 9.
Diseñar un programa que muestre la suma de los 10 primeros números impares.*/
        // Número impar = 2 · n + 1
        
        //VALORES
        
       int contador=1;
        
        //RECOPILACIÓN DE DATOS
        
       
        
        for(int  i=1;contador<=10;i++){
            if((i %2 !=0)) {
                System.out.println("El numero impar es" +i);
                contador++;
                
            }
        }
     
        
    }
    
    public static void ejercicio10() {
        /*Actividad 10.
Desarrollar un programa en el que se introduzca un número y nos calcule su factorial. Teniendo
en cuenta de que 5! = 5*4*3*2*1 -> 120*/
        int numero; // el numero que me dará
        int resultado=1; // el resultado factorial, si pongo de inicio 0 el resultado peta porque un numero multiplicado por 
                        // 0 es 0
        
        Scanner sc = new Scanner(System.in);//creo el scanner
        System.out.println("Dame un numero para calcular su factorial: ");// pregunto
        numero =sc.nextInt();//guardo el numero
        
        for(int i=0;i<numero;i++){ //bucle for, inicio con i =0 para que cuente desde 0, luego pongo que i debe ser
                                    //menor que numero que daré , por ejemplo 0 - que 5 y en la siguiente añado 
                                    // un numero por cada bucle a i, en este caso el siguiente bucle sería i=1
            
            resultado=resultado *(numero-i); //resultado que sería resultado= 1 * (5 -0)
                                            // segundo bucle = resultado =5*(5-1); resultado = 5*4; resultado =20;
                                            //importante tener en cuenta que cada bucle sube el i y hemos dicho que la condición
                                            //de continuar es i<numero asique cuando i sea igual a 5 (numero) se rompe.
            
            
        }
        System.out.println("El valor factorial de "+ numero + " es "+resultado);
     
        
    }
    
    public static void ejercicio11() {
        /*Actividad 11.
Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.*/
         
       //notas
       
       double notas;
       int suspensos=0,aprobados=0;
       
       
       Scanner sc = new Scanner(System.in);
       
       for(int i=0;i<5;i++){
           System.out.println("Dime una nota: ");
           notas = sc.nextDouble();
           
           
           if(notas<5){
               suspensos++;
           }
           else{
               aprobados++;
           }
           
           
       }
       if(suspensos>0){
           System.out.println("Hay " + suspensos + " suspensos y "+aprobados+ " aprobados");
       }
       else {
           System.out.println("No hay suspensos");
       }
     
    }
    
    public static void ejercicio12() {
        /*Actividad 12.
Pedimos al usuario 6 notas, escribir la cantidad de alumnos aprobados, condicionados (su nota
es igual a 4) y suspensos.*/
        
        //valores
        
        int aprobados =0,suspendidos = 0;
        double notas;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i =1;i<6;i++){
            System.out.println("Introduzca una nota: ");
            notas = sc.nextDouble();
            
            if(notas<5){
                suspendidos++;
            }
            else{
                aprobados++;
            }
        }
        System.out.println("De las notas que has entroducido, podemos deducir que hay "+ aprobados + " aprobados y " +suspendidos + " suspendidos" );
    }
    
    public static void ejercicio13a() {
        /*Actividad 13.
Desarrollar un programa que muestre las tablas de multiplicar del 1 al 10. Pista: Bucles
independientes.*/
        
        //swicht
        
        //Valores
        
        int numero,resultado=0;
        
        //Adquisición de datos
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tabla de múltiplicar quiere que le muestres? diga del 1 al 10.");
        numero = sc.nextInt();
        
        if ((numero>=1) && (numero<=10)) {
            
             for(int i =1;i<=10;i++){
                    
            resultado=numero*i;
                    
            System.out.println(numero + " x "+ i + " = " + resultado);
            
            }
        
        }
        
        else{
            System.out.println("Vaya, parece que no has puesto LO QUE TE HE DICHO QUE PONGAS.");
        }
        
        
    }
    public static void ejercicio13b() {
         /*Actividad 13.
Desarrollar un programa que muestre las tablas de multiplicar del 1 al 10. Pista: Bucles
independientes.*/
         
         //Valores
         int tabla=1;
         int Resultado;
         
         while(tabla<=10) {
             for(int i=1;i<=10;i++){
                 Resultado=tabla*i;
                 System.out.println("La tabla del " + tabla + " x " + i + " es " + Resultado);
             }
             tabla++;
             int i=1;
             System.out.println("--------------------------------------------");
         }
         
    }
}
