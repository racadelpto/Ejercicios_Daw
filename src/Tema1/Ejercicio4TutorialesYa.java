package Tema1;

import java.util.Scanner;

public class Ejercicio4TutorialesYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables
		float precio,cantAbonar;
		int cantCliente;
		Scanner teclado = new Scanner(System.in); 
		
		//Recogemos los valores de precio y cantCliente
		System.out.print("Introduzca el precio del producto (euros): ");
		precio = teclado.nextFloat();
		
		System.out.print("Introduzca la cantidad de productos que va a comprar: ");
		cantCliente = teclado.nextInt();
		
		//Realizamos la operación de cantAbonar que nos dará el importe a pagar por el cliente
		cantAbonar = precio * cantCliente;
		
		//Mostramos la cantidad que debe abonar el cliente
		System.out.println("El precio a pagar por el cliente son " + cantAbonar + (" euros"));
	}

}
