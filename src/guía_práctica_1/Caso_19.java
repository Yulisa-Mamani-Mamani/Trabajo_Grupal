package guía_práctica_1;

import java.util.Scanner;

public class Caso_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1: ");
		int l1 = sc.nextInt();
		
		System.out.print("Ingrese lado 2: "); 
		int l2 = sc.nextInt();
		
		System.out.print("Ingrese lado 3: "); 
		int l3 = sc.nextInt();
		
		int perimetro = l1 + l2 + l3;
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("Perímetro del triángulo.......: " + perimetro);

	}

}
