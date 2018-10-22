package vistacontrol;

import java.util.ArrayList;

import java.util.Scanner;
import modelos.*;
import util.Cadena;

public class aplicacion {
	private static Scanner in = new Scanner(System.in);
	private static ArrayList<User> Us = new ArrayList<>();
	private static ArrayList<User> ranking = new ArrayList<>();  
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
	
	public static void Modalidad() {
		
	}
	public static void Ranking() {
		
	}
	
	public static void Registro() {
		
	}
	
	public static void salir() {
		System.out.println("\033[31m .----------------. .----------------. .----------------. .----------------. .----------------. .----------------. .----------------. \r\n" + 
				"| .--------------. | .--------------. | .--------------. | .--------------. | .--------------. | .--------------. | .--------------. |\r\n" + 
				"| |    ______    | | |  _______     | | |      __      | | |     ______   | | |     _____    | | |      __      | | |    _______   | |\r\n" + 
				"| |  .' ___  |   | | | |_   __ \\    | | |     /  \\     | | |   .' ___  |  | | |    |_   _|   | | |     /  \\     | | |   /  ___  |  | |\r\n" + 
				"| | / .'   \\_|   | | |   | |__) |   | | |    / /\\ \\    | | |  / .'   \\_|  | | |      | |     | | |    / /\\ \\    | | |  |  (__ \\_|  | |\r\n" + 
				"| | | |    ____  | | |   |  __ /    | | |   / ____ \\   | | |  | |         | | |      | |     | | |   / ____ \\   | | |   '.___`-.   | |\r\n" + 
				"| | \\ `.___]  _| | | |  _| |  \\ \\_  | | | _/ /    \\ \\_ | | |  \\ `.___.'\\  | | |     _| |_    | | | _/ /    \\ \\_ | | |  |`\\____) |  | |\r\n" + 
				"| |  `._____.'   | | | |____| |___| | | ||____|  |____|| | |   `._____.'  | | |    |_____|   | | ||____|  |____|| | |  |_______.'  | |\r\n" + 
				"| |              | | |              | | |              | | |              | | |              | | |              | | |              | |\r\n" + 
				"| '--------------' | '--------------' | '--------------' | '--------------' | '--------------' | '--------------' | '--------------' |\r\n" + 
				" '----------------' '----------------' '----------------' '----------------' '----------------' '----------------' '----------------' ");
	}
	
	public static void error(int tipo) {
		if (tipo==1) 
			System.out.println("\033[31mFUERA DE RANGO...");
		else if(tipo == 2)
		System.out.println("\033[31mERROR  -  404 ");
		else if (tipo == 3)
			System.out.println("\\033[31m----------");
		else
			System.out.println("\\033[31mERROR INVESIL");
	}
	
	
	public static void menu_Inicial() {
		
	
	System.out.println(" \033[32m   ____  ___           __________          __ \r\n" + 
			"   / __ )/ (_____  ____/ / ____/ /_  ____ _/ /_\r\n" + 
			"  / __  / / / __ \\/ __  / /   / __ \\/ __ `/ __/\r\n" + 
			" / /_/ / / / / / / /_/ / /___/ / / / /_/ / /_  \r\n" + 
			"/_____/_/_/_/ /_/\\__,_/\\____/_/ /_/\\__,_/\\__/  \r\n" + 
			"                                               ");
	System.out.println("\033[33m\t\t1. MODALIDADES");
	System.out.println("\t\t2. RANKING");
	System.out.println("\t\t3. REGISTRO DE USUARIOS");
	System.out.println("\t\t4. Salir");
	System.out.print("\t\tIngrese de [1-4] : ");
	
	}

////Metodos auxiliares /////////////////////////////////////////////////////////////
	
	public static void addusertoranking(String code) {
		for (User user : Us) {
			if (code.equals(user.getId_user())) {
				ranking.add(user);
			}
		}
	}
	public static void main(String[] args) {
		int opcion;
		do {
		menu_Inicial();
		opcion = Cadena.leerint();
		Cadena.saltosdelinea(3);
		switch (opcion) {
		case 1: Modalidad();
			
			break;
		case 2: Ranking();
		
		    break;
		case 3: Registro();
		
		    break;
		case 4: salir();    

		default:
			break;
		}
		}while(opcion!=4);
	}
	
}
