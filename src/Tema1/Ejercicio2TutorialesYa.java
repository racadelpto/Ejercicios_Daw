package Tema1;

import java.util.Scanner;

public class Ejercicio2TutorialesYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables de los números y operaciones
		int num1,num2,num3,num4,suma,producto;
		Scanner teclado = new Scanner(System.in);
		
		
		//Recogemos los valores que el usuario le dará a los números
		System.out.print("Introduce el valor del primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce el valor del segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Introduce el valor del tercer número: ");
		num3 = teclado.nextInt();
		
		System.out.print("Introduce el valor del cuarto número: ");
		num4 = teclado.nextInt();
	
		//Definimos las variables suma y producto con sus operaciones correspondientes
		suma= num1 + num2;
		producto= num3 * num4;
		
		//Informamos del resultado de las 2 operaciones
		System.out.println("La suma de los 2 primeros números es: " + suma);
		System.out.println("La multiplicación de los 2 últimos números es: " + producto);
		
	}

}
