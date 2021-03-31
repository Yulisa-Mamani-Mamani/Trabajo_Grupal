package guía_práctica_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Cliente.................: ");
		String cli = sc.nextLine();
		
		System.out.print("Producto [TB/LT/MN/IM]..: ");
		String prod = sc.nextLine();
		
		System.out.print("Cantidad................: ");
		int cant = sc.nextInt();
		sc.nextLine();
		System.out.print("Forma de pago [C1/C2]...: ");
		String fp = sc.nextLine();
		
		float prec = 0;
		float incr = 0;
		float dsct = 0;
		
		switch (prod) {
			case "TB": 
				prec = 350;
				prod ="Tablet";
				break;
			
			case "LT":
				prec = 2300;
				prod ="Laptop";
				break;
				
			case "MN":
				prec = 850;
				prod ="Monitor";
				break;
				
			case "IM":
				prec = 680;
				prod ="Impresora";
				break;
		}
		
		float importe = prec * cant;
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Cliente..........: " + cli);
		System.out.println("Producto.........: " + prod);
		System.out.println("Precio...........: " + prec);
		System.out.println("Cantidad.........: " + cant);
		System.out.println("Importe..........: " + importe);
		
		switch (fp) { 
			case "C1": 
				dsct = 0.05f * importe;
				System.out.println("Forma de pago....: Contado");
				System.out.println("Incremento.......: " + dsct);
				System.out.println("Total a pagar....: " + (importe - dsct));
				break;
		
			case "C2":
				incr = ((importe * 12) / 100);
				System.out.println("Forma de pago....: Crédito");
				System.out.println("Incremento.......: " + incr);
				System.out.println("Total a pagar....: " + (importe + incr));
				break;
		}
		
		System.out.println("---------------------------------");
		

	}

}
