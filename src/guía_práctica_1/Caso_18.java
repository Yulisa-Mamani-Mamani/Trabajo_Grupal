package gu�a_pr�ctica_1;

import java.util.Scanner;

public class Caso_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese base del tri�ngulo: ");
		int b = sc.nextInt();
		
		System.out.print("Ingrese altura del tri�ngulo: "); 
		int h = sc.nextInt();
		
		int area = (b * h) / 2;
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("�rea del tri�ngulo.......: " + area);

	}

}
