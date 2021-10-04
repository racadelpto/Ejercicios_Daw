package Tema1;

import java.util.Scanner;

public class Ejercicio1Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables
		float radio,volumen;
		Scanner teclado = new Scanner(System.in);
		
		//Recogemos el valor del radio por teclado
		System.out.print("Introduce el valor del radio de la esfera (cm): ");
		radio = teclado.nextFloat();
		
		//Definimos el valor de la operación de volumen
		volumen= (float) ((4*Math.PI*(radio*radio*radio))/3);
		
		//Finalmente, informamos del resultado del volumen
		System.out.println("El volumen de la esfera de " + radio + " cm de radio es: " + volumen + (" cm³."));
	}

}
