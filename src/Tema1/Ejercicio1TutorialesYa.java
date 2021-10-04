package Tema1;

import java.util.Scanner;

public class Ejercicio1TutorialesYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables
		int lado, perímetro;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos el dato de la longitud del lado del cuadrado por teclado
		System.out.print("Introduce la longitud del lado del cuadrado (cm): ");
		lado = teclado.nextInt();
		
		//Asignamos a perímetro el valor equivalente a su operación y comunicamos su valor
		perímetro = lado*4;
		System.out.println("El perímetro del cuadrado es " + perímetro + " cm");
	}

}
