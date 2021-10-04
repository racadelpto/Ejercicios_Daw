package Tema1;

import java.util.Scanner;

public class Ejercicio3TutorialesYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables de los 4 números y de las 2 operaciones
		int num1,num2,num3,num4,suma;
		float promedio;
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
		
		//Definimos las operaciones de suma y promedio
		suma= num1 + num2 + num3 + num4;
		promedio= (num1 + num2 + num3 + num4)/4f;
		
		//Informamos de la suma y del promedio de los números
		System.out.println("La suma de los 4 números es: " + suma);
		System.out.println("El promedio de los 4 números es: " + promedio);
	}

}
