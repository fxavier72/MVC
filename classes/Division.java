package classes;

public class Division {
	private int code;
	private String libelle;
	
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
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	* Accesseur de libelle
	*  @return Libelle (String)
	*/
	public String getLibelle(){
		return libelle;
	}
	
	/**
	* Mutateur de libelle
	* @param libelle
	*/
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Division(){
		code = 5;
		libelle = "";
	}
	
	/**
     * Met à jour le code et le libelle.
     * 
     * @param code
     *            Le nouveau code
     * 
     * @param libelle
     * 			  Le nouveau libelle
     */
	public Division(int code, String libelle){
		this.code = code;
		this.libelle = libelle;
	}
	
	/**
	 * Retourne une chaine de caractère composée des valeurs des attributs
	 * 
	 * @return code et libelle
	 */
	public String toString(){
		return code+ " - "+libelle;
	}
}
