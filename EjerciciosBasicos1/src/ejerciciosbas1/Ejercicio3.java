package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Declaración de variables
				int actual;
				int nacimiento;
				int edad;
		
		//Creamos un scanner
				Scanner leer = new Scanner(System.in);
		
		System.out.print("Dime la fecha actual: ");//pedimos la fecha actual
		actual = leer.nextInt();
		
		System.out.print("Dime la fecha que naciste: ");//pedimos la fecha de su nacimiento
		nacimiento = leer.nextInt();
		
		edad = actual - nacimiento;//restamos las variables
		
		System.out.print("Tienes " + edad + " años");
		
		
	}

}
