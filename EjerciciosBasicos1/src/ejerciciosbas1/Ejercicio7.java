package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String nombre;
		String direccion;
		String numero;
		
		 Scanner leer = new Scanner(System.in);
		 
		 System.out.print("Dime tu nombre: ");
		 nombre = leer.nextLine();
		 
		 System.out.print("Dime tu direccion: ");
		 direccion = leer.nextLine();
		 
		 System.out.print("Dime tu número: ");
		 numero = leer.nextLine();
		 
		 System.out.println("Nombre: " + nombre);
		 
		 System.out.println("Dirección: " + direccion);
		 
		 System.out.println("Número: " + numero);

	}

}
