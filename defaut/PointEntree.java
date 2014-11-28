package defaut;

import controleurs.ControleurPrincipal;
import vues.Vue;
import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

import dao.ConnexionPostgreSql;

public class PointEntree {

	public static Vue interfaceGraph;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Division> modeleDivision = new DivisionDAO();
		DAO<Eleve> modeleEleve = new EleveDAO();
		ControleurPrincipal leControleur = new ControleurPrincipal(modeleDivision,modeleEleve);
		Vue interfaceGraph = new Vue(leControleur);
		leControleur.lienVue(interfaceGraph);

		ConnexionPostgreSql.Stop();

	}

}
