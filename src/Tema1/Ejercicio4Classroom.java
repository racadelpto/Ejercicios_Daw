package Tema1;

import java.util.Scanner;

public class Ejercicio4Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos variables
		String texto;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos la cadena por teclado
		System.out.print("Introduce una cadena:  ");
		texto= teclado.next();
		
		//Mostramos la cadena en mayúscula y decimos su longitud
		System.out.println("La cadena introducida es: " + texto.toUpperCase() + ". Además, la longitud de esta es de " + texto.length() + " letras.");
		
		}

}
