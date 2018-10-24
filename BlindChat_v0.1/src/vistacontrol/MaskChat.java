package vistacontrol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import modelos.Player;
import modelos.Question;
import modelos.User;

public class MaskChat {
	private static ArrayList<Player> Pls = new ArrayList<>();
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
			System.out.println();
			menu_principal();
			n_DW = Integer.valueOf(in.nextLine());
			switch (n_DW) {
			case 1:
				System.out.println("Acá van las reglas");
				break;
				
			case 2:
				partida_MC();
				break;
				
			case 3:
				
				break;
				
			default:
				System.out.println("Valor incorrecto!!!");
				break;
			}
		} while (n_DW!=3);
	}
	
	public static void partida_MC() {		
		boolean op = true;
		do {
			System.out.println();
			System.out.println("********MaskChat********");
			insertPlayers();
			System.out.println();
			System.out.print("Ingresa el numero de preguntas: ");
			int pr = Integer.valueOf(in.nextLine());
			createQuestion(pr);
			ordendeturnos();
			ronda_preguntas();
			ronda_respuestas();
			adivinar();
			revelacion();
			do {
				System.out.print("Desea agregar otro usuario (S/N): ");
				String op_sn = in.nextLine();
				if (!op_sn.equalsIgnoreCase("s") && !op_sn.equalsIgnoreCase("n")) {
					System.out.println("Error valor ingrasado invalido!!!");
				}else if(op_sn.equalsIgnoreCase("n")) {
					op = false;
					break;
				}
			} while(1!=2);
			
		}while (op);		
	}
	public static void ordendeturnos() {
		System.out.println();
		System.out.println("*Lista de turnos*************************");
		int i = 0;
		for(Player p: Pls) {
			i++;
			System.out.println(i+".  "+p.getRealname());
		}
	}
	public static void ronda_preguntas() {
		
	}
	public static void ronda_respuestas() {
		
	}
	public static void adivinar() {
		
	}
	public static void revelacion() {
		
	}
	public static void createQuestion(int pr) {
		Collections.shuffle(Pls);
		for(int i=0; i<Pls.size(); i++) {
			if(Pls.size()%2 != 0 && i==Pls.size()) {
				for(int j = 0; j < pr;j++) {
					Question q = new Question(Pls.get(i).getId_player(), Pls.get(0).getId_player());
					aplicacion.Qs.add(q);
				}					
			}else {
				for(int j = 0; j < pr; j++) {
					Question q = new Question(Pls.get(i).getId_player(), Pls.get(0).getId_player());
					aplicacion.Qs.add(q);
				}		
			}
		}
	}
	public static void insertPlayers() {
		boolean op = true;
		do {
			if(Pls.size()<3) {
				System.out.println("--->Deben haber por lo menos 3 jugadores");			
			}
			System.out.print("Usuario: ");
			String user = in.nextLine();
			System.out.print("contraseña: ");
			String pass = in.nextLine();
			addPlayer(user, pass);
			if(Pls.size()>=3) {
				do {
					System.out.print("Desea agregar otro usuario (S/N): ");
					String op_sn = in.nextLine();
					if (!op_sn.equalsIgnoreCase("s") && !op_sn.equalsIgnoreCase("n")) {
						System.out.println("Error valor ingrasado invalido!!!");
					}else if(op_sn.equalsIgnoreCase("n")) {
						op = false;
						break;
					}
				} while(1!=2);
			}
		} while (op);
		
		
	}
	
	public static void addPlayer(String user, String pass) {
		int f = 0;
		for(User u: aplicacion.Us) {
			f++;
			if(user.equals(u.getNickname()) && pass.equals(u.getPassword())) {
				if(u.isState()==false) {					
					System.out.println("(Ingrese un nombre falso)");
					System.out.print("Mask: ");
					String mask = in.nextLine();
					Player p = new Player(mask, u.getRealname(), u.getPassword(), u.getId_user());
					u.setState(true);
					Pls.add(p);
					break;
				}else {
					System.out.println("El usario ya esta paricipando");
				}
			}
		}
		if (f==aplicacion.Us.size()) {
			System.out.println("El usuario o contraseña son incorrectos");
		}
	}
	
}
