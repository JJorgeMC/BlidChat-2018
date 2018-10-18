package vistacontrol;

import java.util.Scanner;

public class aplicacion {
	private static Scanner in = new Scanner(System.in);
	private static int ID_Pls = 0;
	
	public static String getID_Pls() {
		ID_Pls++;
		return String.valueOf(ID_Pls);
	}
	
////MENUS////////////////////////////////////////////////////////////////////////////
	
	public static void menu_Inicial() {
		System.out.println("********BlincChat********");
	}
}
