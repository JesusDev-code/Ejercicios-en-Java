package Ejercicio1;

public class Enunciado {
	/* 
		Actividad 1.
		Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el
		saldo. Las operaciones típicas con una cuenta corriente son:
		• Crear una cuenta: se necesita el DNI y el nombre del titular. El saldo inicial será 0.
		• Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si
		existe saldo suficiente.
		• Ingresar dinero: se incrementa el saldo.
		• Mostrar información: muestra la información disponible de la cuenta corriente.
		
		
		Actividad 2.
		En la clase CuentaCorriente, sobrecargar los constructores para poder crear objetos.
		• Con el DNI del titular de la cuenta y un saldo inicial.
		• Con el DNI, nombre y el saldo inicial.
		Escribir un programa que compruebe el funcionamiento de los métodos. Usar ambos tipos de
		constructores: por su nombre y usando this.
		
		
		Actividad 3.
		Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. Añadir un
		atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar
		un método que permita recuperar y modificar el nombre del banco (al que pertenecen todas las
		cuentas corrientes).
		
		
		Actividad 4.
		Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.
		Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseña la clase Gestor de la que
		interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar.
		Con respecto a los gestores, existen las siguientes restricciones:
		• Un gestor tendrá siempre un nombre y un teléfono.
		• Si no se asigna, el importe máximo autorizado por operación será de 10 000 euros.
		• Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo
		podrá consultarlo.
		El nombre será público y el importe máximo sólo será visible por clases vecinas.
		Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los
métodos necesarios.
	 * 
	 * */
}
