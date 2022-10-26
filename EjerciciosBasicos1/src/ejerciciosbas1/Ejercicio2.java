package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Le pedimos al usuario su edad
		System.out.print("Introduzca su edad: ");

		// Variable donde se guardara la edad
		int edad;

		// Creamos Scanner para leer del teclado
		Scanner leer = new Scanner(System.in);
				
		// Leemos la edad introducida
		edad = leer.nextInt();

		// Añadimos 1 a la edad introducida
		edad++;

		// Muestro por pantalla el mensaje
		System.out.println("El año que viene tendrás " + edad + " años.");

	}

}
