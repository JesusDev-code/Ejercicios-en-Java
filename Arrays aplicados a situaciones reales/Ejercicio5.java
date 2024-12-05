package com.mycompany.enunciadoscompletosrefuerzou5github;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class Ejercicio5 {
    static public void main (String[] args){
        /*Actividad 5.
        Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
        Los alumnos se organizan en grupos compuestos por 5 personas.
        Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo.
        Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno que se
        encuentra en una posición dada (que el usuario introduce por teclado).*/
        //Valores
        
        int primert[]=new int[5];
        int segundt[]=new int[5];
        int tercert[]=new int[5];       
        int nota,sumaGrupo=0;
        //Adquisición de datos
        
        Scanner sc=new Scanner(System.in);
        //primer trimestre
        
        for(int i=0;i<primert.length;i++){
            System.out.println("Dime la nota del primer trimestre del alumno "+(i+1));
            nota=sc.nextInt();
            primert[i]=nota;
            sumaGrupo=sumaGrupo+nota;
            
        }
        System.out.println("La nota media del primer trimestre  es "+media(sumaGrupo,primert.length));
        sumaGrupo=0;
   
        //segundo trimestre
        
        for(int i=0;i<segundt.length;i++){
            System.out.println("Dime la nota del segundo trimestre del alumno "+i+1);
            nota=sc.nextInt();
            segundt[i]=nota;
            sumaGrupo=sumaGrupo+nota;
            
        }
        System.out.println("La nota media del segundo trimestre  es "+media(sumaGrupo,segundt.length));
        sumaGrupo=0;
        //tercer trimestre
        
        for(int i=0;i<tercert.length;i++){
            System.out.println("Dime la nota del tercer trimestre del alumno  "+i+1);
            nota=sc.nextInt();
            tercert[i]=nota;
            sumaGrupo=sumaGrupo+nota;
          
        }
          System.out.println("La nota media del tercer trimestre  es "+media(sumaGrupo,tercert.length));
          //imprimir resultado
          
        for(int i=0;i<5;i++){
            
            System.out.println("La media del alumno "+i+1+" es "+(primert[i]+segundt[i]+tercert[i])/3);
        }
   
    }
    static double media(int valor,int valor2){
       int resultado;
       resultado=valor/valor2;
       return(double) resultado;
    }
}
