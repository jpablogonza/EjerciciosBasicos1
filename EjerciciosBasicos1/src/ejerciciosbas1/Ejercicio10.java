package ejerciciosbas1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int IVA = 21;
		double precioIntroducido;
		double precioConIVA;
		
		Scanner lectura = new Scanner(System.in);
		lectura.useLocale(Locale.US);

		System.out.print("Introduzca un precio: ");
		precioIntroducido = lectura.nextDouble();

		precioConIVA = precioIntroducido * IVA /100 + precioIntroducido;

		System.out.println("El precio con IVA es: " + precioConIVA);
		
		lectura.close();
	

	}

}
