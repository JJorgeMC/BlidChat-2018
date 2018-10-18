package util;

import java.util.Scanner;

public class Cadena {
	public static Scanner teclado = new Scanner(System.in);

	public static void saltosdelinea(int cantidad) {

		for (int i = 0; i < cantidad; i++) 
			System.out.println("\n");
		
	}

	public static String leerstring() {

		String texto = teclado.nextLine();
		return texto.trim();
	}

	public static int leerint() {
		return Integer.valueOf(leerstring().trim());
	}

	public static double leerdouble() {
		return Double.valueOf(leerstring().trim());
	}
}
