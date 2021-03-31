package guía_práctica_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese monto 1: ");
		float m1 = sc.nextInt();
		
		System.out.print("Ingrese monto 2: "); 
		float m2 = sc.nextInt();
		
		System.out.print("Ingrese monto 3: "); 
		float m3 = sc.nextInt();
		
		float r1 = (m1 / 5) + ((m2 * (float)(0.2)));
		float r2 = (m3 + (m3 * (float)(0.6))) / 2;
		float r3 = (m1 + m2 + m3) - ((m1 + m2 + m3) * (float)(0.08));
		
		
		System.out.println("*******************************");
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("*******************************");
		System.out.println("Resultado 1.......: " + df.format(r1));
		System.out.println("Resultado 2.......: " + df.format(r2));
		System.out.println("Resultado 3.......: " + df.format(r3));

	}

}
