package guía_práctica_1;

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
		System.out.println("Área del círculo.......: " + area);
		System.out.println("Perímetro del círculo..: " + perimetro);

	}

}
