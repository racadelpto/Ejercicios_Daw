package Tema1;

import java.util.Scanner;

public class Ejercicio5Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables
		String texto;
		int inicio,fin;
		
		Scanner teclado= new Scanner(System.in);
		
		//Leemos la cadena y los n�meros para posteriormente elegir la subcadena
		System.out.print("Introduce la cadena deseada: ");
		texto= teclado.next();
		
		System.out.print("Introduce la primera posici�n de la subcadena: ");
		inicio= teclado.nextInt();
		
		System.out.print("Introduce la �ltima posici�n de la subcadena: ");
		fin= teclado.nextInt();
		
		//Definimos y asignamos el valor de la subcadena y la mostramos por pantalla
		String subCadena = texto.substring(inicio-1,fin);
		System.out.println("La subcadena es: " + subCadena);
	
	
	}

}
