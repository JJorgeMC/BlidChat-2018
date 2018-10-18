package vistacontrol;

import java.util.Scanner;

public class aplicacion {
	private static Scanner in = new Scanner(System.in);
	private static int ID_Pls = 0;
	private static int ID_Us = 0;
	
	public static String getID_Pls() {
		ID_Pls++;
		return String.valueOf(ID_Pls);
	}
	public static String getID_Us() {
		ID_Us++;
		return String.valueOf(ID_Us);
	}
////MENUS////////////////////////////////////////////////////////////////////////////
	//hola mundo de maqueras
	public static void menu_Inicial() {
		System.out.println("********BlincChat********");
	}
	public static void main(String[] args) {
		
		System.out.println("");
		
	}
	
}
