package gu�a_pr�ctica_1;

import java.util.Scanner;

public class Caso_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer lado: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese segundo lado: ");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = (lado1 * 2) + (lado2 * 2);  
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("�rea del rect�ngulo.......: " + area);
		System.out.println("Per�metro del rect�ngulo..: " + perimetro);

	}

}
