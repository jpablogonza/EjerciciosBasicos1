package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedimos que itroduzca un número
				System.out.print("Introduzca un número: ");

				//Ponemos la variable llamada numero
				int numero;

				// Creamos el objeto Scanner para poder leer el teclado
				Scanner leer = new Scanner(System.in);

				// Guardo el numero introducido
				numero = leer.nextInt();

				// Mostramos el número introducido en la consola
				System.out.print("El número introducido es: " + numero);
	}

}
