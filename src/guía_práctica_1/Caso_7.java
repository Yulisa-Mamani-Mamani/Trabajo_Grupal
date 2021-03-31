package guía_práctica_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		float po = (float) Math.pow(3, 2); 
		
		float a = ((17*2) + po - 6) / 5;
		
		float b = 2 * ((float)(4.7) - ((float)(1.2) * 2)); 
		
		System.out.println("----- Resultados -----");
		System.out.println("Resultado ....: " + df.format((a - b))); 

	}

}
