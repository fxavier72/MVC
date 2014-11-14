package tests;

import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.EleveDAO;

public class testDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Eleve> eleve = new EleveDAO();
		// Test de la recherche d'un élève en fonction de son code
		System.out.println(eleve.read(1).toString());
		
		Eleve unEleves = new Eleve(10, "TITI", "TOTO","12/12/2000", new Division(1, "classe bts SIO 1"));
		unEleves = eleve.create(unEleves);
		
		System.out.println(eleve.read(1));
		System.out.println(eleve.read(10));
	}

}
