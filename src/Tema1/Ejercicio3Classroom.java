package Tema1;

import java.util.Scanner;

public class Ejercicio3Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables
		float sueldo,irpf,irpfUsuario;
		int numPagas;
		Scanner teclado= new Scanner(System.in);
				
		//Pedimos la informaci�n al usuario de todas las variables por teclado
		System.out.print("Introduzca la cantidad de sueldo que gana al mes (en euros): ");
		sueldo= teclado.nextFloat();
				
		System.out.print("Introduzca el n�mero de pagas que recibe al a�o: ");
		numPagas= teclado.nextInt();
				
		System.out.print("Introduzca el porcentaje (%) de IRPF que se aplica en tu caso: ");
		irpf= teclado.nextFloat();
				
		//Por �ltimo definimos la variable irpfUsuario y comunicamos su resultado
		irpfUsuario=(sueldo*numPagas*(irpf/100));
		System.out.println("La cantidad de irpf que has de pagar al a�o es de: " + irpfUsuario + " euros");
		
	}

}
