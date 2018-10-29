package vistacontrol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import modelos.Player;
import modelos.Question;
import modelos.User;

public class MaskChat {
	private static ArrayList<String> orden = new ArrayList<>();
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
			createOrden();
			System.out.println();
			System.out.print("Ingresa el numero de preguntas: ");
			int pr = Integer.valueOf(in.nextLine());
			createQuestion(pr);
			ordendeturnos();
			ronda_preguntas(pr);
			ronda_respuestas(pr);
			adivinar();
			revelacion();
			do {
				System.out.print("DEsea jugar de nuevo (S/N): ");
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
	private static void createOrden() {		
		for(Player p: Pls) {
			String a = p.getId_player();
			orden.add(a);
		}
		
	}
	public static void ordendeturnos() {
		System.out.println();
		System.out.println("*Lista de turnos*************************");
		int i = 0;
		for(String id: orden) {
			i++;
			String name = Pls.get(Pls_sendPosition(id)).getRealname();
			System.out.println(i+".\t"+name);
		}
	}
	public static void ronda_preguntas(int pr) {
		System.out.println();
		System.out.println("*Ronda de preguntas****************************");
		for(int i = 0 ; i < orden.size(); i++) {	
			String id = orden.get(i);
			int ps = Pls_sendPosition(id);
			System.out.println();
			System.out.println("turno de: "+Pls.get(ps).getRealname());
			ArrayList<Question> Qs_aux = new ArrayList<>();
			int j = 0;
			for(Question q: aplicacion.Qs) {
				if(q.getId_emisor().equals(id)) {
					Qs_aux.add(q);
					j++;
					System.out.println("Escriba una pregunta para "+Pls.get(Pls_sendPosition(q.getId_receptor())).getUsername());
					System.out.print("Pregunta "+j+": ");
					String pregunta = in.nextLine();
					q.setQuestion(pregunta);
					if(pr==j) {
						break;
					}else {
						System.out.println();
					}					
				}
			}
			readQuestion_Qs_aux(Qs_aux);
			
			System.out.println("Turno terminado");
			
		}
	}
	public static void readQuestion_Qs_aux(ArrayList<Question> Qs_aux) {
		int j=0;
		System.out.println();
		System.out.println("*Lista de preguntas: ");
		for(Question q: Qs_aux) {
			j++;
			System.out.println(j+".\t"+q.getQuestion());
		}
	}
	public static void ronda_respuestas(int pr) {
		
	}
	public static void adivinar() {
		
	}
	public static void revelacion() {
		
	}
	public static int Pls_sendPosition(String id) {
		int ps = -1;
		for(Player p: Pls) {
			ps++;
			if(p.getId_player().equals(id)) {
				break;
			}
		}
		return ps;
	}
	public static void createQuestion(int pr) {
		Collections.shuffle(Pls);
		for(int i=0; i<Pls.size(); i++) {
			if(i==Pls.size()-1) {
				for(int j = 0; j < pr;j++) {
					Question q = new Question(Pls.get(i).getId_player(), Pls.get(0).getId_player());
					aplicacion.Qs.add(q);
				}					
			}else if(i<Pls.size()-1){
				for(int j = 0; j < pr; j++) {
					Question q = new Question(Pls.get(i).getId_player(), Pls.get(i+1).getId_player());
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
