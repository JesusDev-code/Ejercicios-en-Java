/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciounidad4;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class ejercicio3 {
    static public void main(String[] args){
        /*Realizar una aplicación con una función que calcule y muestre el área o el volumen de un cilindro,
según se especifique. Para distinguir un caso de otro se le pasará como opción un número: 1
(para el área) o 2 (para el volumen). Además, hay que pasarle a la función el radio de la base y la
altura. Sabiendo que:

Área = 2PI * radio * (altura+radio).
Volumen = PI * radio2 * altura.*/
        //valores
        double radio,altura;
        int resultado;
        double volumen;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un valor al radio: ");
        radio =sc.nextDouble();
        System.out.println("Dame un valor para la altura: ");
        altura =sc.nextDouble();
        
        System.out.println("Vamos a calcular el area o volumen de un cilindro:");
        System.out.println("¿qué deseas calcular?");
        System.out.println("1-area");
        System.out.println("2-volumen");
        resultado =sc.nextInt();
            switch(resultado) {
                case 1:
                    area=calculoarea(radio ,altura);
                    System.out.println(area);
                    break;
                case 2:
                    volumen = calculovolumen(radio, altura);
                    System.out.println(volumen);
                    break;
                default:
                    System.out.println("Comando erroneo");
                    break;
                
            } 

        
    }
                static double calculoarea(double valor1,double valor2){
                double area = 2*Math.PI*valor1*(valor2+valor1);
                return area;
                        
            }
                 static double calculovolumen(double valor1,double valor2){
                double volumen = Math.PI*valor1*2*(valor2);
                return volumen;
                        
            }
    
    
}
