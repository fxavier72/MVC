package defaut;

import controleurs.ControleurPrincipal;
import vues.Vue;
import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

public class PointEntree {

	public static Vue interfaceGraph;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Division> modeleDivision = new DivisionDAO();

		DAO<Eleve> modeleEleve = new EleveDAO();

		ControleurPrincipal leControleur = new ControleurPrincipal(modeleDivision,modeleEleve);

		interfaceGraph = new Vue(leControleur);

		leControleur.lienVue(interfaceGraph);
		
		Vue.main(args);

		//ConnectionPostgreSQL.Arreter();

	}

}
