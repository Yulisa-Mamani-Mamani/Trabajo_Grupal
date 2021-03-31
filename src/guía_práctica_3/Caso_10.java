package guía_práctica_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		float ht = 0, th = 0, mt = 0, sueldob = 0, bon = 0, dsct = 0, sueldon = 0, ma= 0;
		float sueldon_ma = 0, sueldon_me = 0, mt_ma = 0;
		int nr = 0, cant_meta = 0;
		String nombre = "", estado = "", continuar = "S", nom_mayor = "", nom_menor = "";

		while (continuar.equals("S")|| continuar.equals("s")) {
		nr++;
		System.out.println("----------------------------------------------------");
		System.out.println("         REGISTRO DE EMPLEADOS -" + nr + "-    ");
		System.out.println("---------------------------------------------------");

		System.out.print("Empleado: ");
		nombre = sc.nextLine();

		System.out.print("Horas trabajadas: ");
		ht = sc.nextInt();

		System.out.print("Tarifa por horas: ");
		th = sc.nextInt();

		System.out.print("Minutos de tardanza: ");
		mt = sc.nextInt();
		System.out.println("-------------------------------------------");


		sueldob = ht * th;


		if (ht > 50 && ht <= 60)
		bon = sueldob * 0.02f;
		else if (ht > 60 && ht <= 70)
		bon = sueldob * 0.08f;
		else if (ht > 70 && ht <= 80)
		bon = sueldob * 0.13f;
		else if (ht >80)
		bon = sueldob * 0.15f;
		else
		bon = 0;


		if (mt > 15 && mt <= 30)
		dsct =  ((sueldob * 0.3f) * mt) / 100;
		else if (mt > 30)
		dsct =  ((sueldob * 0.5f) * mt) / 100;
		else
		dsct = 0;

		ma = (float)(ht *100) / 80;

		if (ma > 90) {
		cant_meta++;
		}


		if (mt > mt_ma) {
		mt_ma = mt;
		mt_ma++;
		}



		System.out.println("\n---------------------------------------");
		System.out.println("                R E S U L T A D O S             ");
		System.out.println("-------------------------------------------");
		System.out.println("Sueldo bruto......: " + df.format(sueldob));
		System.out.println("Bonificación....: " + bon);
		System.out.println("Descuento........: " + df.format(dsct));

		float sn=sueldob+bon-dsct;

		System.out.println("Sueldo neto......: " + sn);
		System.out.println("Meta alcanzada.........: " + df.format(ma) + " %");
		System.out.println("-------------------------------------------");

		sc.nextLine();

		if (mt > mt_ma)
		mt_ma = mt;
		estado= nombre;

		if (sn > sueldon_ma) {
		sueldon_ma = sn;
		nom_mayor = nombre;
		}
		else if (sn > sueldon_me) {
		sueldon_me = sn;
		nom_menor = nombre;
		}

		System.out.print("\n¿Desea registrar otro alumno <S/N>: ");
		continuar = sc.nextLine();
		System.out.println("\n");

		}
		System.out.println("\n---------------------");
		System.out.println("-- R E S U M E N --");
		System.out.println("Número de empleado........: " + nr);
		System.out.println("Sueldo neto mayor:  " + sueldon_ma + " pertenece a : " + nom_mayor);
		System.out.println("Sueldo neto menor:  " + sueldon_me+  " pertenece a : " + nom_menor );
		System.out.println("Empleado con la mayor cant. de min. de tardanza...: " + estado + " ( " + mt_ma +  ") ");
		System.out.println("Cantidad de empleados con más del 90% de la meta...: " + cant_meta);


		



	}

}
