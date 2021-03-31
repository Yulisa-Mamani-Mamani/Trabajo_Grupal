package guía_práctica_1;

import java.util.Scanner;

public class Caso_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0; 
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float r1 = (n1 + n2) / 2;
		float r2 = n1 + ((n1 * 20) / 100);
		float r3 = n2 - ((n2 * 30) / 100); 
		
		System.out.println("------- RESULTADOS -------");
		System.out.println("Resultado 1........: " + r1);
		System.out.println("Resultado 2........: " + r2);
		System.out.println("Resultado 3........: " + r3);

	}

}
