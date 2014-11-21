package controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import classes.Division;
import classes.Eleve;

import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;
import vues.Vue;

public class ControleurPrincipal implements ActionListener {
	
	private Vue vue;
	private DAO<Division> laDivision = new DivisionDAO();
	private DAO<Eleve> lEleve = new EleveDAO();
	
	public ControleurPrincipal(DAO<Division> modeleD, DAO<Eleve> modeleE){
		this.laDivision=modeleD;
		this.lEleve=modeleE;
	}
	
	public void lienVue(Vue laVue){
		this.vue=laVue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== vue.fermer){
			System.exit(0);
		}
	}
	
}
