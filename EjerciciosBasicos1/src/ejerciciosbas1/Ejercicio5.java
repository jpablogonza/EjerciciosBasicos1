package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double radio;
		double longitud;
		double area;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Dime el radio de la circunferencia; ");
		radio = leer.nextDouble();
		
		longitud = (double)  (2 * 3.1416) * radio;
		
		System.out.print("La longitud de la circunferencia es de: " + longitud);
		
		area = (double) (radio * radio)*3.1416;
		
		System.out.print(" y el área es de: " + area);
	}

}
