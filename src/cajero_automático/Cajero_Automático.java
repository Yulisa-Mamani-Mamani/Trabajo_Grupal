package cajero_automático;

import java.util.ArrayList;
import java.util.Scanner;

public class Cajero_Automático {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNum_tarj = new ArrayList<String>();
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<String> arrClave = new ArrayList<String>(); 
		ArrayList<Float> arrSaldo = new ArrayList<Float>();
		ArrayList<Float> arrSaldod = new ArrayList<Float>();
		ArrayList<String> arrCuenta = new ArrayList<String>();
		ArrayList<Float> arrSer_agua = new ArrayList<Float>();
		ArrayList<Float> arrSer_luz = new ArrayList<Float>();
		ArrayList<String> arrDNI = new ArrayList<String>();
		
		
		
		arrNum_tarj.add("123-456");
		arrNum_tarj.add("789-012");
		arrNum_tarj.add("345-678");
		arrNum_tarj.add("901-234");
		
		arrNombre.add("Yulisa Mamani");
		arrNombre.add("Sebastián Ramos");
		arrNombre.add("Erick Berrocal");
		arrNombre.add("Jeremy Gonzales");
		
		arrClave.add("2334");
		arrClave.add("4556");
		arrClave.add("7889");
		arrClave.add("9001");
		
		arrSaldo.add((float)2000);
		arrSaldo.add((float)1500);
		arrSaldo.add((float)750);
		arrSaldo.add((float)800);
		
		arrSaldod.add((float)536);
		arrSaldod.add((float)402);
		arrSaldod.add((float)201);
		arrSaldod.add((float)214);
		
		arrCuenta.add("123456");
		arrCuenta.add("789012");
		arrCuenta.add("345678");
		arrCuenta.add("901234");
		
		arrSer_agua.add((float) 50);
		arrSer_agua.add((float) 48.50);
		arrSer_agua.add((float) 60);
		arrSer_agua.add((float) 40);
		
		arrSer_luz.add((float) 120);
		arrSer_luz.add((float) 200);
		arrSer_luz.add((float) 300);
		arrSer_luz.add((float) 150);
		
		arrDNI.add("234567");
		arrDNI.add("345678");
		arrDNI.add("456789");
		arrDNI.add("567891");
		
		
		System.out.println("===========================");
		System.out.println("    BIENVENIDO CLIENTE     ");
		System.out.println("---------------------------");
		System.out.print("Número de tarjeta......: ");
		String num_tarj = sc.nextLine();
		System.out.println("===========================");
		
		int p = -1;
		
		for (int x = 0; x < arrNum_tarj.size(); x++) {
			if (num_tarj.equals(arrNum_tarj.get(x))) {
				p = x;
				break;
			}	
		}
		
		if (p == -1) {
			System.out.println("\n==========================");
			System.out.println("   Código no encontrado   ");
			System.out.println("==========================");
		
			
		}
		else {
			System.out.print("\nClave de la tarjeta....: ");
			String clave = sc.nextLine();
			
			int k = -1;
			
			for (int y = 0; y < arrClave.size(); y++) {
				if (clave.equals(arrClave.get(y))) {
					k = y;
					break;
				}
				
				
			}
			if (k == -1) {
				System.out.println("\n==========================");
				System.out.println("    Clave no encontrado   ");
				System.out.println("==========================");
			}
			
			else {
				String continuar = "Si";
				while (continuar.equals("Si")|| continuar.equals("si")) {
					System.out.println("\nCliente....: "+ arrNombre.get(k) );
					System.out.println("\nOperación: " + "\n 1. Ver Saldo" + "\n 2. Retiro" + "\n 3. Tranferencia" + "\n 4. Depósito" +
					                    "\n 5. Pago de servicios");
					System.out.print("\nIngrese una opción: ");
					String op = sc.nextLine();
				
					switch (op) {
						case "1":
							System.out.println("--------------------------------");
							System.out.println("Cuentas con un saldo de: " + "S/. " + arrSaldo.get(p));
							System.out.println("--------------------------------");
							break;
					
						case "2":
							System.out.println("-----------------------------");
							System.out.println("\nTipo de moneda: ");
							System.out.println(" 1. Soles" + "\n 2. Dólares");
							System.out.print("\nIngresa la opción: ");
							String moneda = sc.nextLine();
							
							switch (moneda) {
								case "1":
									System.out.println("-----------------------------");
									System.out.println("\nElige el importe que quieres retirar: ");
									System.out.println(" 1. S/.100" + "\n 2. S/.200" + "\n 3. S/.300" + "\n 4. S/.400" + "\n 5. Otro importe");
									System.out.print("\nIngresa la opción: ");
									String opciones = sc.nextLine();
									
									float nsaldo = 0;
									switch (opciones) {
										case "1":
											if (100 > arrSaldo.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else {
												nsaldo = arrSaldo.get(p) - 100;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: " + "S/. " + 100);
												System.out.println("Nuevo saldo: " + "S/. " + nsaldo);
												System.out.println("-----------------------------");
											}
											break;
										case "2":
											if (200 > arrSaldo.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else {
												nsaldo = arrSaldo.get(p) - 200;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: " + "S/. " + 200);
												System.out.println("Nuevo saldo: " + "S/. " + nsaldo);
												System.out.println("-----------------------------");
											}
											break;
										case "3":
											if (300 > arrSaldo.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else {
												nsaldo = arrSaldo.get(p) - 300;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: " + "S/. " + 300);
												System.out.println("Nuevo saldo: " + "S/. " + nsaldo);
												System.out.println("-----------------------------");
											}
											
											break;
										case "4":
											if (400 > arrSaldo.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else { 
												nsaldo = arrSaldo.get(p) - 400;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: " + "S/. " + 400);
												System.out.println("Nuevo saldo: " + "S/. " + nsaldo);
												System.out.println("-----------------------------");
											}
											
											break;
										case "5":
											String intentar = "Si";
											while (intentar.equals("Si")|| intentar.equals("si")) {
												
												System.out.print("\nIngresa monto a retirar: ");
												int monto = sc.nextInt();
												
												
												
											
												if (monto > arrSaldo.get(p)) {
													System.out.println("**********************");
													System.out.println("  Saldo insuficiente  ");
													System.out.println("**********************");
													
													sc.nextLine();
													
													
													
												}
												
												
												else {
													if (monto%20==0 || monto%50==0 ) {
														nsaldo = arrSaldo.get(p) - monto;
														System.out.println("-----------------------------");
														System.out.println("Monto a retirar: " + "S/. " + monto);
														System.out.println("Nuevo saldo: " + "S/. " + nsaldo);
														System.out.println("-----------------------------");
														
														sc.nextLine();
														
														
																	
													}
													else {
														
														System.out.println("**************************************************");
														System.out.println("Solo billetes de S./20 , S./50 , S./100  y S./200 ");
														System.out.println("**************************************************");
														sc.nextLine();
														
														
														
																		
																	
													}
													
														
												}	
												sc.nextLine();
												
												intentar = "";
												while (!intentar.equals("Si") && !intentar.equals("si") && !intentar.equals("No") && !intentar.equals("no")) {
													System.out.print("¿Quiere retirar otro monto? ");
													intentar = sc.nextLine();
													
													if (!intentar.equals("Si") && !intentar.equals("si") && !intentar.equals("No") && !intentar.equals("no")) {
														System.out.println("Solo escriba Si o No");
														
													}
													
												
												}
												arrSaldo.remove(p);
												arrSaldo.add(p, nsaldo);
												arrSaldod.remove(p);
												arrSaldod.add(p, nsaldo / (float)3.73);
											}
											break;
											
									}
									
									arrSaldo.remove(p);
									arrSaldo.add(p, nsaldo);
									arrSaldod.remove(p);
									arrSaldod.add(p, nsaldo / (float)3.73);
							
									break;
									
								case "2":
									System.out.println("-----------------------------");
									System.out.println("\nElige el importe que quieres retirar: ");
									System.out.println(" 1. $100" + "\n 2. $200" + "\n 3. $300" + "\n 4. $400" + "\n 5. Otro importe");
									System.out.print("\nIngresa la opción: ");
									String opcionesd = sc.nextLine();
									
									float nsaldo1 = 0;
									switch (opcionesd) {
										case "1":
											if (100 > arrSaldod.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else {
												nsaldo1 = arrSaldod.get(p) - 100;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: $" + 100);
												System.out.println("Nuevo saldo: $" + nsaldo1);
												System.out.println("-----------------------------");
											}
											break;
										case "2":
											if (200 > arrSaldod.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else {
												nsaldo1 = arrSaldod.get(p) - 200;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: $" + 200);
												System.out.println("Nuevo saldo: $" + nsaldo1);
												System.out.println("-----------------------------");
											}
											break;
										case "3":
											if (300 > arrSaldod.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else {
												nsaldo1 = arrSaldod.get(p) - 300;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: $" + 300);
												System.out.println("Nuevo saldo: $" + nsaldo1);
												System.out.println("-----------------------------");
											}
											
											break;
										case "4":
											if (400 > arrSaldod.get(p)) {
												System.out.println("**********************");
												System.out.println("  Saldo insuficiente  ");
												System.out.println("**********************");
											}
											else { 
												nsaldo1 = arrSaldod.get(p) - 400;
												System.out.println("-----------------------------");
												System.out.println("Monto a retirar: $" + 400);
												System.out.println("Nuevo saldo: $" + nsaldo1);
												System.out.println("-----------------------------");
											}
											
											break;
										case "5":
											String intentar = "Si";
											while (intentar.equals("Si")|| intentar.equals("si")) {
												
												System.out.print("\nIngresa monto a retirar: ");
												int monto = sc.nextInt();
												if (monto > arrSaldod.get(p)) {
													System.out.println("**********************");
													System.out.println("  Saldo insuficiente  ");
													System.out.println("**********************");
												}
												
												else {
													if (monto%5==0) {
														nsaldo1 = arrSaldod.get(p) - monto;
														System.out.println("-----------------------------");
														System.out.println("Monto a retirar: $" + monto);
														System.out.println("Nuevo saldo: $" + nsaldo1);
														System.out.println("-----------------------------");
																
													}
													else {
														System.out.println("**********************************************");
														System.out.println("Solo billetes múltiplos de $5, $10, $50 y $100");
														System.out.println("**********************************************");
																
																
													}
													
												}	
												sc.nextLine();
												
												intentar = "";
												while (!intentar.equals("Si") && !intentar.equals("si") && !intentar.equals("No") && !intentar.equals("no")) {
													System.out.print("¿Quiere retirar otro monto? ");
													intentar = sc.nextLine();
													
													if (!intentar.equals("Si") && !intentar.equals("si") && !intentar.equals("No") && !intentar.equals("no")) {
														System.out.println("Solo escriba Si o No");
														
													}
													
												
												}
											}
											
											break;
											
									}
									
									arrSaldod.remove(p);
									arrSaldod.add(p, (nsaldo1));
									arrSaldo.remove(p);
									arrSaldo.add(p, (nsaldo1) * (float)3.73);
									
									break;
							}
							break;
							
						// TRANFERENCIA	
						case "3":
							System.out.println("============================");
							System.out.println("   TRANFERENCIA EN SOLES   ");
							System.out.println("============================");
							
							String volver = "Si";
							
							System.out.println("\n-----------------------------");
							System.out.print("Ingrese cuenta destino: ");
							String cuenta = sc.nextLine();
						
							
							
							int l = -1;
								
							for (int z = 0; z < arrCuenta.size(); z++) {
								if (cuenta.equals(arrCuenta.get(z))) {
									l = z;
									break;
								}	
							}
								
							if (l == -1) {
								System.out.println("\n==========================");
								System.out.println("    CUENTA INEXISTENTE     ");
								System.out.println("==========================");
								sc.nextLine();
									
								
									
							}
							else {
								System.out.print("\nIngrese el monto: ");
								int monto1 = sc.nextInt();
								float nsaldo2 = arrSaldo.get(p) - monto1;
								if (monto1 > arrSaldo.get(p)) {
									System.out.println("\n==========================");
									System.out.println("    SALDO INSUFICIENTE     ");
									System.out.println("==========================");
								}
									
								else {
									System.out.println("\nDestinatario.............: " + arrNombre.get(l));
									System.out.println("Nro.de cta. .............: " + arrCuenta.get(l));
									System.out.println("Monto a transferir.......: " + "S/. " + monto1);
									System.out.println("Saldo restante...........: " + "S/. " + nsaldo2);
									arrSaldo.remove(p);
									arrSaldo.add(p, nsaldo2);
									arrSaldod.remove(p);
									arrSaldod.add(p, nsaldo2 / (float)3.73);
								}
	
								
								
								
							}
							
							
							break;
							
						//DEPÓSITO
						case "4":
							float nsaldo = 0;
							String intentar = "Si";
							while (intentar.equals("Si")|| intentar.equals("si")) {
								
								System.out.print("\nIngresa monto del depósito: ");
								int deposito = sc.nextInt();
								
								if (deposito%20==0 || deposito%50==0) {
									nsaldo = arrSaldo.get(p) + deposito;
									System.out.println("-----------------------------");
									System.out.println("Monto a depósitar: " + "S/. " + deposito);
									System.out.println("Nuevo saldo: " + "S/. " + nsaldo);
									System.out.println("-----------------------------");
											
								}
								else {
									System.out.println("**************************************************");
									System.out.println("Solo billetes de S./20 , S./50 , S./100  y S./200 ");
									System.out.println("**************************************************");
											
											
								}
									
								sc.nextLine();
								
								intentar = "";
								while (!intentar.equals("Si") && !intentar.equals("si") && !intentar.equals("No") && !intentar.equals("no")) {
									System.out.print("\n¿Quiere depositar otro monto? ");
									intentar = sc.nextLine();
									
									if (!intentar.equals("Si") && !intentar.equals("si") && !intentar.equals("No") && !intentar.equals("no")) {
										System.out.println("Solo escriba Si o No");
										
									}
									
								}
								
								arrSaldo.remove(p);
								arrSaldo.add(p, nsaldo);
								arrSaldod.remove(p);
								arrSaldod.add(p, nsaldo / (float) 3.73);
								
							}
							
							
							break;
							
						case "5":
							System.out.print("\nIngrese N° DNI....: ");
							String dni = sc.nextLine();
							
							int c = -1;
							
							for (int n = 0; n < arrDNI.size(); n++) {
								if (dni.equals(arrDNI.get(n))) {
									c = n;
									break;
								}
								
								
							}
							if (c == -1) {
								System.out.println("\n==========================");
								System.out.println("    CLIENTE NO ENCONTRADO   ");
								System.out.println("==========================");
							}
							
							else {
								
								String co = "Si";
								while (co.equals("Si")|| co.equals("si")) {
									
									
									System.out.println("\nServicio: " + "\n 1. Agua" + "\n 2. Luz");
									System.out.print("\nIngrese una opción: ");
									String servicio = sc.nextLine();
									
									switch (servicio) {
										case "1":
											
											System.out.println("--------------------------------");
											System.out.println("\nCliente....: "+ arrNombre.get(c) );
											System.out.println("\nImporte....: "+ arrSer_agua.get(c) );
											System.out.print("\n¿PAGAR? [SI/NO]: ");
											String pago = sc.nextLine();
											float nsaldo3 = 0;
											
											switch (pago) {
												case "SI":
													System.out.println("\n***PAGO EXITOSO***");
													System.out.println("Total: S/. " + arrSer_agua.get(c) );
													nsaldo3 = arrSaldo.get(p) - arrSer_agua.get(c);
													System.out.println("Total restante: S/. " + nsaldo3 );
													arrSaldo.remove(p);
													arrSaldo.add(p, nsaldo3);
													arrSaldod.remove(p);
													arrSaldod.add(p, (nsaldo3 / (float)3.73));
													break;
												case "NO":
													System.out.println("\n***PAGO NO PROCESADO***");
													break;
											}
												
											break;
											
										case "2":
											System.out.println("--------------------------------");
											System.out.println("\nCliente....: "+ arrNombre.get(c) );
											System.out.println("\nImporte....: "+ arrSer_luz.get(c) );
											System.out.print("\n¿PAGAR? [SI/NO]: ");
											String pago2 = sc.nextLine();
											float nsaldo4 = 0;
											
											switch (pago2) {
												case "SI":
													System.out.println("\n***PAGO EXITOSO***");
													System.out.println("Total: S/. " + arrSer_luz.get(c) );
													nsaldo4 = arrSaldo.get(p) - arrSer_luz.get(c);
													System.out.println("Total restante: S/. " + nsaldo4 );
													arrSaldo.remove(p);
													arrSaldo.add(p, nsaldo4);
													arrSaldod.remove(p);
													arrSaldod.add(p, (nsaldo4 / (float)3.73));
													break;
												case "NO":
													System.out.println("\n***PAGO NO PROCESADO***");
													break;
											}
											break;
									}
									sc.nextLine();
									
									co = "";
									while (!co.equals("Si") && !co.equals("si") && !co.equals("No") && !co.equals("no")) {
										System.out.print("\n¿Desea pagar otro servicio? ");
										co = sc.nextLine();
										
										if (!co.equals("Si") && !co.equals("si") && !co.equals("No") && !co.equals("no")) {
											System.out.println("Solo escriba Si o No");
										}
									}
								}
								
							}
							break;
					}
					sc.nextLine();
					
					continuar = "";
					while (!continuar.equals("Si") && !continuar.equals("si") && !continuar.equals("No") && !continuar.equals("no")) {
						System.out.print("\n¿Desea realizar otra operación? ");
						continuar = sc.nextLine();
						
						if (!continuar.equals("Si") && !continuar.equals("si") && !continuar.equals("No") && !continuar.equals("no")) {
							System.out.println("\nSolo escriba Si o No\n");
						}	
					}
				
				}
				
			}
			
		}
		
		System.out.println("\nGRACIAS POR SU PREFERENCIA");

	}

}
