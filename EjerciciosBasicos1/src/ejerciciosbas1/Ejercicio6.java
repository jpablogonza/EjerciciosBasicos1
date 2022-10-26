package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		num1 = leer.nextInt();
		
		System.out.print("Dime otro número: ");
		num2 = leer.nextInt();
		 
		suma = num1 + num2;
		
		System.out.println("Si los sumamos daría: " + suma);
	
		resta = num1 - num2;
		
		System.out.println("Si los restamo saldría: " + resta);
		
		multiplicacion = num1 * num2;
		
		System.out.println("Si los multiplicamos saldría: " + multiplicacion);
		
		division = num1 / num2;
		
		System.out.println("Si los dividimos saldría: " + division);
		 
	}

}
