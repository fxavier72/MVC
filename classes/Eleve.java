package classes;

public class Eleve {
	
	private int code;
	private String nom;
	private String prenom;
	private String dateNaiss;
	private Division uneDivision;
	
	/**
	* Accesseur de code
	*  @return code (int)
	*/
	public int getCode(){
		return code;
	}
	
	/**
	* Mutateur de code
	* @param code
	*/
	public void setCode(int code){
		this.code = code;
	}
	
	/**
	* Accesseur de nom
	*  @return nom (String)
	*/
	public String getNom(){
		return nom;
	}
	
	/**
	* Mutateur de nom
	* @param nom
	*/
	public void setNom(String nom){
		this.nom = nom;
	}
	
	/**
	* Accesseur de prenom
	*  @return prenom (String)
	*/
	public String getPrenom(){
		return prenom;
	}
	
	/**
	* Mutateur de prenom
	* @param prenom
	*/
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	/**
	* Accesseur de dateNaiss
	*  @return dateNaiss (String)
	*/
	public String getDateNaiss(){
		return dateNaiss;
	}
	
	/**
	* Mutateur de dateNaiss
	* @param dateNaiss
	*/
	public void setDateNaiss(String dateNaiss){
		this.dateNaiss = dateNaiss;
	}
	
	public Division getUneDivision(){
		return uneDivision;
	}
	
	public void setUneDivision(Division uneDivision){
		this.uneDivision = uneDivision;
	}
	
	/**
     * Parametre par défaut (le code, le nom, le prenom, et la date de naissance)
     * 
     * @param code
     *            Le code par défaut
     * 
     * @param nom
     * 			  Le nom par défaut
     * 
     * @param prenom
     * 			  Le prenom par défaut
     * 
     * @param dateNaiss
     * 			  La date de naissance par défaut
     */
	public Eleve(){
		code = 10;
		nom = "testNom";
		prenom = "testPrenom";
		dateNaiss = "testDate";
		uneDivision = new Division();
	}
	
	/**
     * Met à jour le code, le nom, le prenom, et la date de naissance
     * 
     * @param code
     *            Le nouveau code
     * 
     * @param nom
     * 			  Le nouveau nom
     * 
     * @param prenom
     * 			  Le nouveau prenom
     * 
     * @param dateNaiss
     * 			  La nouvelle date de naissance
     */
	public Eleve(int code, String nom, String prenom, String dateNaiss, Division uneDivision){
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.uneDivision = uneDivision;
	}
	
	/**
	 * Retourne une chaine de caractère composée des valeurs des attributs
	 * 
	 * @return code, nom, prenom, dateNaiss
	 */
	public String toString(){
		return code+ " - " +nom+ " - " +prenom+ " - " +dateNaiss;
	}
}
