package guía_práctica_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del producto....: ");
		String prod = sc.nextLine();
		
		System.out.print("Ingrese precio.....: ");
		float prec = sc.nextFloat();
		
		System.out.print("Ingrese cantidad.....: ");
		int cant = sc.nextInt();
		
		float importe = prec * cant;
		
		float igv = (importe * 18) / 100;
		
		float desct = (importe * 3) / 100; 
		
	
		System.out.println("\n------ R E S U L T A D O S ------");
		System.out.println("Nombre del producto....: " + prod);
		System.out.println("Importe................: " + df.format(importe));
		System.out.println("El IGV.................: " + df.format(igv));
		System.out.println("Descuento..............: " + (desct));
		System.out.println("Total..................: " + df.format(importe + igv - desct));

	}

}
