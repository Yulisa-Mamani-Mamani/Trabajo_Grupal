package gu�a_pr�ctica_1;

import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radio: ");
		int ra = sc.nextInt();
		
		int po = (int) Math.pow(ra, 2); 
		float area = (float) (3.1416) * po; 
		float perimetro = 2 * (float)((3.1416) * ra);  
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("�rea del c�rculo.......: " + area);
		System.out.println("Per�metro del c�rculo..: " + perimetro);

	}

}
