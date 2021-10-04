package Tema1;

import java.util.Scanner;

public class Ejercicio2Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables
		float volumen,altura,radio;
		Scanner teclado = new Scanner(System.in);
				
		//Recogemos los valores de la altura y el radio por teclado
		System.out.print("Introduce la longitud en cm de la altura del cilindro: ");
		altura = teclado.nextFloat();
				
		System.out.print("Introduce la longitud en cm del radio del cilindro: ");
		radio = teclado.nextFloat();
				
		//Definimos el valor de la operación de volumen
		volumen = (float) (Math.PI*altura*(radio*radio));
				
		//Finalmente comunicamos el resultado del volumen de la esfera con los datos introducidos
		System.out.println("El volumen de la esfera con los datos introducidos es: " + volumen + " cm³");
	}

}
