package modelos;

public class Player {
	private String id_player;
	private String user;
	private String password;
	private boolean state;
	public Player(String user, String password, boolean state) {
		super();
		this.id_player = vistacontrol.aplicacion.getID_Pls();
		this.user = user;
		this.password = password;
		this.state = state;
	}
	public String getId_player() {
		return id_player;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
