package modelos;

public class Question {
	private String id_question;
	private String id_emisor;
	private String id_receptor;
	private String question;
	private String answer;
	private boolean state;
	public Question(String id_emisor, String id_receptor) {
		super();
		this.id_question = vistacontrol.aplicacion.getID_Qs();
		this.id_emisor = id_emisor;
		this.id_receptor = id_receptor;
		this.setState(false);
	}
	public String getId_question() {
		return id_question;
	}
	public String getId_emisor() {
		return id_emisor;
	}
	public void setId_emisor(String id_emisor) {
		this.id_emisor = id_emisor;
	}
	public String getId_receptor() {
		return id_receptor;
	}
	public void setId_receptor(String id_receptor) {
		this.id_receptor = id_receptor;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
