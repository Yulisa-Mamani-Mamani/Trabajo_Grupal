package guía_práctica_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor una venta: ");
		float venta = sc.nextInt();
		
		float incr = venta + (venta * (float)(0.42)); 
		
		System.out.println("Valor de la venta incrementado en 42%: " + 
		                   df.format(incr));

	}

}
