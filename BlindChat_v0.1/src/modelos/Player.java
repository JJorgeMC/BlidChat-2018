package modelos;

public class Player {
	private String id_player;
	private String username;
	private String password;
	private boolean state;
	private String id_user;
	public Player(String user, String password, String id_user) {
		super();
		this.id_player = vistacontrol.aplicacion.getID_Pls();
		this.username = user;
		this.password = password;
		this.state = false;
		this.id_user = id_user;
	}
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getId_player() {
		return id_player;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String user) {
		this.username = user;
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
