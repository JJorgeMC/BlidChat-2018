package utl;

import java.util.Scanner;

public class ingreso {
	private static Scanner in = new Scanner(System.in);
	public static String texto() {
		String txt=null;
		int i = 0;
		do {
			try {
				txt=in.nextLine();
				i = 1;
			} catch (Exception e) {
				System.err.println("Valor ingresaso invalido!!!");
			}
		} while (i==0);
		return txt;
	}

	public static int numero() {
		int num=0;
		int i = 0;
		do {
			try {
				num=in.nextInt();
				i = 1;
			} catch (Exception e) {
				System.err.println("Valor ingresaso invalido!!!");
				num=0;
			}
		} while (i==0);
		return num;
	}
	public static void main(String[] args) {
		System.out.print("Ingrese una numero: ");
		int s = numero();
		System.out.println("resultado: "+s);
	}
}


