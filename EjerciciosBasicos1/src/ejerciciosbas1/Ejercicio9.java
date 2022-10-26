package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int peseta;
		double euro;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Dime un número de pesetas: ");
		peseta = leer.nextInt();
		
		euro = (double) (peseta * 0.006);
		
		System.out.print("Tendrias en euros una cantidad de " + euro + "€");

	}

}
