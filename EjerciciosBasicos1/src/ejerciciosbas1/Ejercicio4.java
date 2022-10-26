package ejerciciosbas1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declración de variables
		int nota1;
		int nota2;
		double notamedia;
		
		//creamos un scanner 
		Scanner leer = new Scanner(System.in);
		
		 System.out.print("Dame una nota: "); //Pedimos el primer valor
		 nota1 = leer.nextInt();
		 
		 System.out.print("Dime una segunda nota: "); //Pedimos el segundo valor
		 nota2 = leer.nextInt();
		 
		 notamedia = (double) (nota1 + nota2)/2; //Restamos las vaariables y la dividimos entre 2 para sacar la nota media
		 
		 System.out.print("Tu nota media seria de: " + notamedia);
		 
		

	}

}
