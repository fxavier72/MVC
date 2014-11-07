package tests;

import classes.Eleve;

public class TestsEleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Eleve unEleve = new Eleve();
		
		System.out.println(unEleve.toString());
		System.out.println(unEleve.getCode()+ " - " +unEleve.getNom()+ " - " +unEleve.getPrenom()+ " - " +unEleve.getDateNaiss());
		
		unEleve.setCode(20);
		unEleve.setNom("Lebret");
		unEleve.setPrenom("FX");
		unEleve.setDateNaiss("10/09/91");
		System.out.println(unEleve.toString());
		System.out.println(unEleve.getCode()+ " - " +unEleve.getNom()+ " - " +unEleve.getPrenom()+ " - " +unEleve.getDateNaiss());
	}

}
