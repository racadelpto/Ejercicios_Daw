package Tema1;

import java.util.Scanner;

public class Ejercicio1TutorialesYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables
		int lado, per�metro;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos el dato de la longitud del lado del cuadrado por teclado
		System.out.print("Introduce la longitud del lado del cuadrado (cm): ");
		lado = teclado.nextInt();
		
		//Asignamos a per�metro el valor equivalente a su operaci�n y comunicamos su valor
		per�metro = lado*4;
		System.out.println("El per�metro del cuadrado es " + per�metro + " cm");
	}

}
