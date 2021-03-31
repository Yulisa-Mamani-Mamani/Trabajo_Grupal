package guía_práctica_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor del un gasto: ");
		float gasto = sc.nextInt();
		
		float dism = gasto - (gasto * (float)(0.12)); 
		
		System.out.println("\nValor del gasto disminuiudo en 12%: " +
		                   df.format(dism));

	}

}
