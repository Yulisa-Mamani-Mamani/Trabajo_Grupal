package guía_práctica_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
			impuesto = 0.05f * sueldo; 
		
		else 
			impuesto = 0.02f * sueldo;
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Sueldo...............: " + df.format(sueldo));
		System.out.println("Impuesto calculado...: " + df.format(impuesto));
		

	}

}
