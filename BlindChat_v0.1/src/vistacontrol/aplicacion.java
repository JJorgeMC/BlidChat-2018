package vistacontrol;

import java.util.ArrayList;

import java.util.Scanner;
import modelos.*;
import util.Cadena;

public class aplicacion {
	private static Scanner in = new Scanner(System.in);
	public static ArrayList<User> Us = new ArrayList<>();
	public static ArrayList<User> ranking = new ArrayList<>(); 
	public static ArrayList<Question> Qs = new ArrayList<>();
	private static int ID_Pls = 0;
	private static int ID_Us = 0;
	private static int ID_Qs = 0;
	public static String getID_Pls() {
		ID_Pls++;
		return String.valueOf(ID_Pls);
	}
	public static String getID_Us() {
		ID_Us++;
		return String.valueOf(ID_Us);
	}
	public static String getID_Qs() {
		ID_Qs++;
		return String.valueOf(ID_Qs);
	}
////MENUS////////////////////////////////////////////////////////////////////////////
	
	public static void Modalidad() {
		int op_DW;
		do {
			System.out.println("***********Modalidades**********");
			System.out.println("\t1. MaskChat");
			System.out.println("\t2. salir");
			System.out.print("Ingresa una opcion: ");
			op_DW = Integer.valueOf(in.nextLine());
			switch (op_DW) {
			case 1:
				MaskChat.md_MaskChat();
				break;

			default:
				System.out.println("Valor incorrecto!!!");
				break;
			}
		} while (op_DW!=2);
	}
	public static void Ranking() {
		
	}
	
	public static void Registro() {
		int intentos = 0;
		Boolean clavescorrectas = false;
		String password;
		System.out.println("\t\t\033[31m*BIENVENIDO AL REGISTRO DE USUARIOS*");
		System.out.println("\t\t\033[33mPORFAVOR INGRESA TU NOMBRE: \033[32m");
		System.out.print("\t\t"); String realname = Cadena.leerstring();
		System.out.println("\t\t\033[33mINGRESA UN NOMBRE DE USUARIO: \033[32m(Example: Levaneitor123)");
		System.out.print("\t\t"); String nickname = Cadena.leerstring();
		System.out.println("\t\t\033[33mINGRESA UN PASSWORD: \033[32m");
		System.out.print("\t\t"); password = Cadena.leerstring();
		do {
			intentos++;
		System.out.println("\t\t\033[33mCONFIRMAR PASSWORD: \033[32m");
		System.out.print("\t\t"); String pass2 =  Cadena.leerstring();
		if(password.equals(pass2)) {
			clavescorrectas = true;
		}
		}while(intentos <3 && clavescorrectas == false);
		
		if(clavescorrectas == true) {
		User u = new User(nickname, realname, password);
		 Us.add(u);
		 Cadena.saltosdelinea(2);
		 System.out.println("\t\t\033[32mREGISTRO EXITOSO...");
		 Cadena.saltosdelinea(3);
		}else {
			Cadena.saltosdelinea(2);
			System.out.println("\t\033[31mREGISTRO CANCELADO......");
			Cadena.saltosdelinea(3);
		}
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

//xd
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
