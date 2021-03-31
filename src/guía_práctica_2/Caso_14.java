package guía_práctica_2;

import java.util.Scanner;

public class Caso_14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Alumno......: ");
		String al = sc.nextLine();
		
		System.out.print("Carrera [DS, RC, DG]......: ");
		String car = sc.nextLine();
		
		System.out.print("Turno [M, T, N]......: ");
		String tur = sc.nextLine();
		
		float monto = 0;
		float dsct = 0;
	
		switch (car) {
			case "DS": 
				monto = 1500;
				break;
			
			case "RC":
				monto = 1400;
				break;
				
			case "DG":
				monto = 1300;
				break;
				
			default:
				monto = 0;
		}		
		
		switch (tur) {
			case "M": 
				dsct = ((monto * 10) / 100);
				break;
				
			case "T":
				dsct = ((monto * 20) / 100);
				break;
					
			case "N":
				dsct = ((monto * 15) / 100);
				break;
					
			default:
				dsct = 0;
		}
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Monto............: " + monto);
		System.out.println("Turno............: " + tur);
		System.out.println("Descuento........: " + dsct);
		System.out.println("Total a pagar....: " + "S/. " + (monto - dsct));
		System.out.println("En dólares.......: " + "$. " + ((monto - dsct) * 3.33));
		System.out.println("-----------------------------------");

	}

}
