/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosunidad2;
import java.util.*;
/**
 *
 * @author Jesus
 */
public class ejercicios_condicionales {

    public static void main(String[] args) {
        ejercicio11();
        
    }
    public static void ejercicio() {
        /**Vamos a realizar un programa para un frutero; el cliente, necesita calcular los beneficios anuales
        que obtiene de la venta de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que solicite
        las ventas (en kilos) de cada semestre para cada fruta. La aplicación mostrará el importe total
        sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.**/
        //Porción de tiempo que dura seis meses (6 meses)
       
        double manzana; //usar double para evitar errores
        double pera;
        double resultadoManzana;
        double resultadoPera;
        double total;
 
        Scanner sc = new Scanner(System.in);
        System.out.println("¿cuantos kilos de manzana ha vendido?");
        manzana = sc.nextFloat();
        System.out.println("¿Cuantos kilos de peras has vendido?");
        pera = sc.nextFloat();
        
        resultadoManzana = ((manzana * 2.35)*6);
        resultadoPera = ((pera * 1.95)*6);
        
        total = (resultadoManzana + resultadoPera);
        
       System.out.println("Los beneficios son " + total+"euros");
        //System.out.println("Los beneficios son "+ ((manzana * 2.35)+(pera * 1.95)*191)+"euros");
        
    }
    public static void ejercicio2() {
        //Realizad un programa que pida al usuario un número y nos devuelva su valor absoluto.
        int numero;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número ");
        numero = sc.nextInt();
        resultado = (numero>=0) ? (numero) : (numero*(-1));
        
        System.out.println("Tu numero es " + resultado);
        //System.out.println("Tu numero es " + Math.abs(numero)); //Math.abs ()
        
        /**-3*(-1)**/
        
        
    }
    public static void ejercicio3() {
        /**Actividad 3.
Realizad un programa que pida las notas del primer, segundo y tercer trimestre (de valor entero).
El programa debe mostrar la nota media del curso; tanto del boletín de calificaciones (nota
entera) como del expediente (con decimales). (Casting....)**/
        int primerAnio,segundoAnio,tercerAnio;
        double notaCalificaciones;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nota de primer trimetres");
        primerAnio = sc.nextInt();
        System.out.println("Dame tu not de segundo trimetres");
        segundoAnio = sc.nextInt();
        System.out.println("Dame tu nota del tercer trimetre");
        tercerAnio = sc.nextInt();
       

        //notaCalificaciones = ((primerAnio + segundoAnio + tercerAnio)/3);
        notaCalificaciones = (double)((primerAnio + segundoAnio + tercerAnio)/3.0);
        
        System.out.println("La nota de calificaciones es "+((primerAnio + segundoAnio + tercerAnio)/3));
        System.out.println("El expediente es "+ notaCalificaciones);
        
        
    }
    public static void ejercicio4() {
        /**Actividad 4.
Realizad un programa que pida al usuario un número con decimales y nos devuelva su valor
redondeado. (Casting....)**/
       double numero;
       int resultado;
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime un número decimal");
       numero = sc.nextDouble();
       resultado = (int)(numero+0.5);/** se añade el 0.5 para redondear a uno más es decir, si pone 4.2 y le sumo 0,5 = 4,7 ,se 
        * quita el 7 y se queda en 4 PERO si a 4,5 le añado 0,5 se quedaría en 5 si le quito el decimal se queda en 5.**/
       //Math.round(numero) para redondear
       System.out.println("Tu numero es " + resultado);
        /**Math.Round(1.2345 , 2); //Te redondea al segundo decimal ==== 1.23
Math.Round(1.2345 , 3); //Te redondea al cuarto decima ====== 1.235**/
    }
    public static void ejercicio5() {
        /*Actividad 5.
Codifica uUna aplicación que sea una pequeña calculadora, la cual reciba dos valores por teclado
y muestre las opciones de:
1.- sumar.
2.- restar.
3.- multiplicar.
4.- dividir.
Según el operador que indiquemos por teclado nos de dicho resultado. Sólo valores enteros y
sin comprobaciones de posibles errores. Usas sentencias condicionales.**/
        int valor1;
        int valor2;
        int operador;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer valor a calcular: ");
        valor1 = sc.nextInt();
        System.out.println("Introduce el segundo valor a calcular; ");
        valor2 = sc.nextInt();
        
        System.out.println("Muy bien ahora indicame qué calculo deseas realizar:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        
        operador = sc.nextInt();
        //operador.equals solo s usa para string y no se puede usar para int == para comparar numeros enteros 
        if(operador == 1 ){ 
           System.out.println("El resultado de tu suma es: " + (valor1 + valor2));
        }
        else if(operador == 2) {
            System.out.println("El resultado de tu resta es; " + (valor1 - valor2));
           
        }
        else if(operador == 3) {
            System.out.println("El resultado de tu multiplicacion es; " + (valor1 * valor2));
           
        }
        else if(operador == 4) {
            System.out.println("El resultado de tu division es; " + (valor1 / valor2));
           
        }
        else{
            System.out.println("Vaya has puesto un parametro incorrecto, vuelve a introducirlo correctamente.");
        }
        
                
                
        
    }
    public static void ejercicio6() {
        /**Codifica una aplicación que sea una pequeña calculadora, la cual reciba dos valores por teclado
y muestre las opciones de:
1.- sumar.
2.- restar.
3.- multiplicar.
4.- dividir.
Según el operador que indiquemos por teclado nos de dicho resultado. Usad valores decimales
y realizando comprobaciones de posibles errores. Usad el condicional switch.
IMPORTANTE TENER EN CUENTA LA DIVISIÓN DE 0 QUE NO SE PUEDE**/
        double valor1;
        double valor2;
        int operador;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer valor: ");
        valor1 = sc.nextDouble();
        System.out.println("Introduce el segundo valor: ");
        valor2 = sc.nextDouble();
        System.out.println("Indica que calculo desea realizar: ");
        System.out.println("Sumar: ");
        System.out.println("Restar ");
        System.out.println("Multiplicar: ");
        System.out.println("Dividir: ");
        
        operador = sc.nextInt();
        
        switch(operador){
            case 1:
                System.out.println("El resultado de tu suma es :"+ (valor1 + valor2));
                break;
            case 2:
                System.out.println("El resultado de tu resta es: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("El resultado de tu multiplicacion es :" +(valor1 * valor2));
                break;
            case 4:
                if(valor2==0){
                    System.out.println("No se puede dividir por cero.");
                    operador=0;
                }
                else{
                    System.out.println("El resultado de tu división es :" + (valor1 / valor2));
                }
                break;
                default:
        }
        
    }
    public static void ejercicio7() {
        /**Actividad 7.
Realizad un programa que pida al usuario un e indique si es par o no. Usad condicionales.**/
        int numero;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        numero = sc.nextInt();
        
       if((numero % 2)==0) {
           System.out.println("Tu numero es par");
       }
       
       else{
           System.out.println("Tu numero es impar.");
       }
    }
    public static void ejercicio8() {
        /**Actividad 8.
Realizad un programa que pida al usuario dos números e indique si son iguales o no. Usad
condicionales.**/
        //Valores
        int valor1;
        int valor2;
        
        //Recopilación de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero: ");
        valor1 = sc.nextInt();
        System.out.println("Dame un segundo numero; ");
        valor2 = sc.nextInt();
        
        //condicionales
        if( valor1== valor2 ){
            System.out.println("Tus numero son iguales");
        }
        else{
            System.out.println("Tus numeros son diferentes");
        }
    }
    public static void ejercicio9() {
        /**Actividad 9.
Realizad un programa que pida al usuario dos números y que diga cuál es mayor. Usad
condicionales. Pensad en las posibilidades...**/
        //Valores
        
        int valor1;
        int valor2;
        //recopilación de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un valor: ");
        valor1 = sc.nextInt();
        System.out.println("Dame un segundo valor;");
        valor2 = sc.nextInt();
        
        if (valor1>valor2) {
            System.out.println(valor1 + " es mayor que " + valor2);
        }
        else if (valor1<valor2) {
            System.out.println(valor2 + " es mayor que " + valor1);
        }
        else if (valor1 == valor2 ){
            System.out.println("Ambos valores son iguales ");
        }
        else{
            System.out.println("Vaya, parece que te has equivocado, sigue intentandolo.");
        }
        
    }
    public static void ejercicio10() {
       /** Actividad 10.
Realizad un programa que pida al usuario dos números y los muestre ordenados de forma
decreciente. Tened cuidado con las posibilidades.**/
       int valor1;
       int valor2;
       int resultado;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Dame un valor; ");
       valor1 = sc.nextInt();
       System.out.println("Dime el segundo valor ");
       valor2 = sc.nextInt();
       
       if (valor1<valor2) {
           System.out.println("El orden decreciente de los numeros es :");
           System.out.println(valor2);
           System.out.println(valor1);
       }  
       else if(valor1>valor2) {
           System.out.println("El orden decreciente de los numeros es :");
           System.out.println(valor1);
           System.out.println(valor2);
       }
       else{
           
       }
        
    }
    public static void ejercicio11() {
        /**Actividad 11.
Realizad un programa que pida al usuario tres números y los muestre ordenador de mayor a
menor. Tened cuidado con las posibilidades.**/
        //Valores
        int valor1,valor2,valor3;
        
        //Obtención de datos
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un valor: ");
        valor1 = sc.nextInt();
        System.out.println("Dime un segundo valor: ");
        valor2 = sc.nextInt();
        System.out.println("Dime un tercer valor: ");
        valor3 = sc.nextInt();
        
        // en cada If el primer valor es el superior, el segundo if se selecciona que el segundo es el mayor y el else es viceversa.
        
        if(valor1>=valor2 && valor1>=valor3) {
            if(valor2>=valor3){
                
                System.out.println("El orden de mayor a menor es: " + valor1 + "-" + valor2 + "-" + valor3);
            }
            else{
                
                System.out.println("El orden de mayor a menor es: " + valor1 + "-" + valor3 + "-" + valor2);
            }
        }
        
        if(valor2>=valor1 && valor2>=valor3) {
            if(valor1>=valor3){
                
                System.out.println("El orden de mayor a menor es: " + valor2 + "-" + valor1 + "-" + valor3);
            }
            else{
                
                System.out.println("El orden de mayor a menor es: " + valor2 + "-" + valor3 + "-" + valor1);
            }
        }
        
        if(valor3>=valor2 && valor3>=valor1) {
            if(valor2>=valor1){
                
                System.out.println("El orden de mayor a menor es: " + valor3 + "-" + valor2 + "-" + valor3);
            }
            else{
                
                System.out.println("El orden de mayor a menor es: " + valor3 + "-" + valor3 + "-" + valor2);
            }
        }
        
        
    }
    public static void ejercicio12() {
        /**Actividad 12.
Realizad un programa que indique cuántas cifras tiene un número entero introducido por
teclado, el rango del valor estará entre 0 y 99 999.**/
        int numero;
        int cifra = 0;//cuenta los numero de las cifas 10 sería dos cifras
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero entre 0 a 99999: ");
        numero = sc.nextInt();
        
        if(numero >= 0 && numero <= 9) {
        
            cifra = 1;
        }
        if (numero >= 10 && numero <=99){
            cifra = 2;
        }
        if (numero >= 100 && numero <=999){
            cifra=3;
        }
        if (numero >= 1000 && numero <= 9999){
            cifra=4;
            
        }
        if(numero >= 10000 && numero <= 99999) {
            cifra=5
;        }
        System.out.println("Tu numero tiene "+cifra+" cifras");
        
    }
    public static void ejercicio13() {
        /**Actividad 13.
Realizad un programa que pida una nota entera de 0 a 10 y la muestre de la siguiente forma:
insuficiente (0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).**/
        //valores
        int nota;
        //Recopilación de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota: ");
        nota = sc.nextInt();
        
        //Condicionales
        if((nota >= 0) && (nota<= 4)) { //cuando es igual exacta es 1 cuando no más
            System.out.println("Insificiente");
            
        }
        else if (nota == 5){
            System.out.println("Suficiente");
        }
        else if (nota == 6) {
            System.out.println("Bien");
        }
        else if ((nota >= 7 )&& (nota <=8)) {
            System.out.println("Notable");
        }
        else if ((nota >= 9) && (nota <= 10)){
            System.out.println("Sobresaliente");
        }
        else{
            
        }  
    }
    public static void ejercicio14() {
        /**Actividad 14.
Realizad un programa que pida al usuario un número comprendido del 1 al 7, el cual
corresponderá a un día de la semana. Debemos mostrar el día de la semana al que corresponde;
por ejemplo: el 1 corresponde a lunes y el 5 corresponde a viernes.**/
        //hacerlo con switch
        //valores
        int dia;
        
        //recupilación de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        dia = sc.nextInt();
        
        //Dias de la semana
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                default:
                break;
                
        }
        
        
    }
    public static void ejercicio15() {
        /**Actividad 15.
Realizad un programa que pida el día, mes y año de una fecha e indicar si la misma es correcta.
Hay que tener en cuenta que existen meses con 28, 30 o 31 días. (No se valorará si el año es
bisiesto)**/ // tener en cuenta los días de cada mes
/**Enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 días cada uno. 
* Abril(4), junio(6), septiembre(9) y noviembre(11) tienen 30 días cada uno. Febrero suele tener 28 días, 
* pero tiene 29 días en los años bisiestos**/

    //valores
    int dia,mes,year;
    boolean fecha = true;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Me vas a decir una fecha completa, vamos a empezar con el día: ");
    dia = sc.nextInt();
    
    //dia
    if((dia>=1) && (dia<=31)){
        System.out.println("Muy bien el día que has puesto es " + dia);
    }
    else {
        System.out.println("Esos días no entra en un mes");
        fecha = false;
    }
    
    //mes
    
    if(fecha) {
        System.out.println("Ahora dame tu un mes; ");
        mes = sc.nextInt();
        
        if(( mes>=1 ) && ( mes<=12 )) { // los 12 meses
            if(( mes== 2)){ //FEBRERO
                if((dia>=1) && (dia<=28)){
                    
                    System.out.println("Tu mes es " + mes);
                }
                else{
                    System.out.println("Febrero no tiene esos días");
                    fecha = false;
                }
            }
            
            
            if((mes==4) || (mes==6) || (mes==9) || (mes==11)){ //meses de abril,junio,septiembre,noviembre
                if( ( dia >= 1 ) && (dia <= 30) ) {
                    System.out.println("Tu mes es " + mes);
                }
                else {
                    System.out.println("Ese mes no incluye esos dias.");
                    fecha = false;
                }
            }
            
            
            if((mes>=1) && (mes<=12)){ // resto de meses
                System.out.println("Tu numero del mes es " + mes);
            }
            else{
                
            }
            
        }
        //año
        if(fecha){
            System.out.println("Dame ahora el anio: ");
            year = sc.nextInt();
            if((year>=1) && (year<=9999)){
                System.out.println("Tu year es:"+ year);
                System.out.println("Podemos decir entonces que tu fecha es " + dia + "/" + mes + "/" + year);
            }
            else{
                
            }
        }
    }
    
    }
    public static void ejercicio16() {
        /**Actividad 16.
Realizad un programa que pida una hora con el siguiente formato: hora, minutos y segundos. El
programa debe mostrar qué hora es un segundo más tarde.**/
        
         //Valores
         int hora,minutos = 0,segundos = 0;
         boolean horario=true;
         
         //Recopilar información
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Me vas a decir una hora, empecemos por la hora: ");
         
         //hora
         
         hora = sc.nextInt();
         if((hora>=00) && (hora<=23) ) {
             System.out.println("Has puesto: " + hora);
         }
         else {
             System.out.println("No es un dato que se pueda poner.");
             horario = false;
         }
         
         //minutos
         if(horario) {
             System.out.println("Ahora me vas a dar los minutos :");
             minutos = sc.nextInt();
             if((minutos>=0) && (minutos<=59)) {
                 System.out.println("Has puesto: "+minutos);
             }
             else {
                 System.out.println("No es un dato que se pueda poner");
                 horario = false;
             }
         }
         
         //segundos
         
         if(horario) {
             System.out.println("Ahora me vas a dar los segundos :");
             segundos = sc.nextInt();
             if((segundos>=0) && (segundos<=59)) {
                 System.out.println("Has puesto: "+segundos);
             }
             else {
                 System.out.println("No es un dato que se pueda poner");
                 horario = false;
             }
         }
         
         //Calculos
         
         if(horario) {
             segundos ++;
             if(segundos==60) {
                 segundos =0;
                 minutos++;
             }
         }
         
         if(horario) {
             if(minutos==60) {
                 minutos = 0;
                 hora++;
             }
         }
         
         if(horario) {
             if(hora == 24) {
                 
                 hora=00;
                 
             }
         }
         if(horario){
             System.out.println("La hora es " + hora+ ":"+ minutos + ":" + segundos);
         }
         
       
  
        
    }
    public static void ejercicio17(){
        /** Actividad 17.
Realizad un programa que pida al usuario una fecha (día, mes y año) y muestre la fecha
correspondiente al día siguiente.**/
            
        //Valores
        
        int year,mes,dia;
        boolean fecha = true;
        
        //Adquisición de datos
        
        Scanner sc= new Scanner(System.in);
        
        //Año
        
        System.out.println("Vamos a decir el dia siguiente de la fecha que des, vamos a empezar con el anio:");
        year = sc.nextInt();
        
        System.out.println("Muy bien, tu anio es " + year);
        
        if((year>=1) && (year<=9999)){
            
    
        }
        else{
            
            System.out.println("No es un numero correcto.");
            fecha = false;
        }
        
        
        //Mes 
        
        System.out.println("Ahora me vas a decir el mes :");
        mes = sc.nextInt();
        
        System.out.println("Tu mes es: " + mes);
        
        if((mes>=1) && (mes<=12)){
            
    
        }
        else{
            
            System.out.println("No es un numero correcto.");
            fecha = false;
        }
        
        
        //dia 
        
        System.out.println("Ahora me vas a decir el dia :");
        dia = sc.nextInt();
        
        System.out.println("Tu dia es: " + dia);
        
        if((dia>=1) && (dia<=31)){
            
    
        }
        else{
            
            System.out.println("No es un numero correcto.");
            fecha = false;
        }
        
        
       
        
        //CALCULOS 
        
        /****Enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 días cada uno. 
* Abril(4), junio(6), septiembre(9) y noviembre(11) tienen 30 días cada uno. Febrero suele tener 28 días, 
* pero tiene 29 días en los años bisiestos los años bisiestos son divisible por 4.
No es divisible por 100, a menos que también sea divisible por 400. (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0):**/
        
        // CONDICIONALES
        
        if(fecha) {
            dia++;
            if( (mes == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && dia > 29) || //año bisiesto
                ((mes ==2) && (dia>28)) ||
                ((mes ==4) || (mes == 6) || (mes == 9) || (mes==11) && (dia>30)) ) {
                dia =1;
                mes ++;
            }
            
        }
        if(fecha) {
            if (mes == 13){
                year ++;
                mes = 1;
            }
        }
        
        if(fecha){
            System.out.println("Tu fecha del dia siguiente es :" + dia + "/"+mes+"/"+ year);
        }
        
        
            

    }
            
    
    
}
