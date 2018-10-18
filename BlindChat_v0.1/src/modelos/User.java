package modelos;

public class User {
	private String id_user;
	private String nickname;
	private String password;
	private int score;
	private boolean state;
	public User(String nickname, String password) {
		super();
		this.id_user = vistacontrol.aplicacion.getID_Us();
		this.nickname = nickname;
		this.password = password;
		this.score = 0;
		this.state = true;
	}
	public String getId_user() {
		return id_user;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
}
