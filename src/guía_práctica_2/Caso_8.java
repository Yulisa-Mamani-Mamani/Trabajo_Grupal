package guía_práctica_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00");
		
		System.out.print("Ingrese nota: ");
		int nota = sc.nextInt();
		
		String mensaje = "No existe";
		
		if (nota >= 0 && nota <= 7)
			 mensaje = "Sin palabras"; 
		else if (nota > 7 && nota <= 10)
			 mensaje = "Malo";
		else if (nota > 10 && nota <= 14)
			 mensaje = "Regular";
		else if (nota > 14 && nota <= 17)
			 mensaje = "Notable";
		else if (nota <= 20)
			 mensaje = "Excelente";
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Nota...............: " + df.format(nota));
		System.out.println("Estado obtenido....: " + mensaje);
		

	}

}
