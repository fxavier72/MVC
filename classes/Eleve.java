package classes;

public class Eleve {
	
	private int code;
	private String nom;
	private String prenom;
	private String dateNaiss;
	
	public int getCode(){
		return code;
	}
	
	public void setCode(int code){
		this.code = code;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public String getDateNaiss(){
		return dateNaiss;
	}
	
	public void setDateNaiss(String dateNaiss){
		this.dateNaiss = dateNaiss;
	}
	
	public Eleve(){
		code = 10;
		nom = "testNom";
		prenom = "testPrenom";
		dateNaiss = "testDate";
	}
	
	public Eleve(int code, String nom, String prenom, String dateNaiss){
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}
	
	public String toString(){
		return code+ " - " +nom+ " - " +prenom+ " - " +dateNaiss;
	}
}
