package Tema1;

import java.util.Scanner;

public class Ejercicio2TutorialesYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables de los n�meros y operaciones
		int num1,num2,num3,num4,suma,producto;
		Scanner teclado = new Scanner(System.in);
		
		
		//Recogemos los valores que el usuario le dar� a los n�meros
		System.out.print("Introduce el valor del primer n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce el valor del segundo n�mero: ");
		num2 = teclado.nextInt();
		
		System.out.print("Introduce el valor del tercer n�mero: ");
		num3 = teclado.nextInt();
		
		System.out.print("Introduce el valor del cuarto n�mero: ");
		num4 = teclado.nextInt();
	
		//Definimos las variables suma y producto con sus operaciones correspondientes
		suma= num1 + num2;
		producto= num3 * num4;
		
		//Informamos del resultado de las 2 operaciones
		System.out.println("La suma de los 2 primeros n�meros es: " + suma);
		System.out.println("La multiplicaci�n de los 2 �ltimos n�meros es: " + producto);
		
	}

}
