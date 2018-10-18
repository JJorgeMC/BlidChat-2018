package vistacontrol;

import java.util.Scanner;

public class MaskChat {
	private static Scanner in = new Scanner(System.in);
	//Menu/////////////////////////////////////////////////////////////////////////////
	
	public static void menu_principal() {
		System.out.println();
		System.out.println("*Modalidad: MaskChat*****************************");
		System.out.println("\t[1] Reglas de juego");
		System.out.println("\t[2] Inciar partida");
		System.out.println("\t[3] Volver a menu principal");
		System.out.print("Ingrese una opcion: ");
	}
	public static void md_MaskChat() {
		int n_DW;
		do {
			menu_principal();
			n_DW = Integer.valueOf(in.nextLine());
			switch (n_DW) {
			case 1:
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			default:
				
				break;
			}
		} while (n_DW!=3);
	}
}
