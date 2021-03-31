package guía_práctica_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Empleado(a).....................: ");
		String em = sc.nextLine();
		
		System.out.print("Horas trabajadas................: ");
		float ht = sc.nextFloat();
		
		System.out.print("Tarifas por hora................: ");
		float th = sc.nextFloat();
		
		System.out.print("Número de minutos de tardanza...: ");
		int mt = sc.nextInt();
		
		
		
		float importe = ht * th;
		float bono = 0;   //asistencia / 12 * 100; porcentaje de asistencias
		float dsct = 0;
		float ma = 0;
		
		
		if (ht > 60) 
			bono = ((importe * 13) / 100);
		else 
			bono = ((importe * 4) / 100);
		if (mt > 15)
			dsct = ((importe * 3) / 100);
		else 
			dsct = 0;
		
		
		ma = (ht / 70) * 100;
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Empleado(a)............: " + em);
		System.out.println("Horas trabajadas.......: " + df.format(ht));
		System.out.println("Tarifa por horas.......: " + df.format(th));
		System.out.println("Importe................: " + df.format(importe));
		System.out.println("Bono...................: " + df.format(bono));
		System.out.println("Descuento..............: " + dsct);
		System.out.println("Meta alcanzada.........: " + ma + " %");
		

	}

}
