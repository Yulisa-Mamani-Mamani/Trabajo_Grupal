package guía_práctica_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Número 1......: ");
		n1 = sc.nextInt();
		
		System.out.print("Número 2......: ");
		n2 = sc.nextInt();
		
		System.out.print("Operación [1-6]......: ");
		int op = sc.nextInt();
		
		
		String opera = "";
		float r = 0;
	
		switch (op) {
			case 1: 
				opera = "Suma";
				r = n1 + n2;
				break;
			
			case 2:
				opera = "Resta";
				r = n1 - n2;
				break;
				
			case 3:
				opera = "Producto";
				r = n1 * n2;
				break;
				
			case 4:
				opera = "División";
				if (n2 >= 1)
					r = (n1 / n2);
				else
					opera = "No es posible hallar la División";
					r = 0;
				break;	
				
			case 5:
				opera = "Resto Entero";
				if (n2 >= 1)
					r = (n1 % n2);
				else
					opera = "No es posible hallar el Resto Entero";
					r = 0;
				break;	
				
			case 6:
				opera = "Promedio";
				r = (float)((n1 + n2) / 2);
				break;	
			
			default:
				r = 0;
				
		}
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Número 1......: " + n1);
		System.out.println("Número 2......: " + n2);
		System.out.println("Operación.....: " + opera);
		System.out.println("Resultado.....: " + r); 

	}

}
