package ejerciciosbas1;

import java.util.Scanner;

import javax.swing.Spring;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		String nombre;
		String edad;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		nombre = leer.nextLine();
		
		System.out.print("Dime tu edad: ");
		edad = leer.nextLine();
		
		System.out.print("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		

	}

}
