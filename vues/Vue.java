package vues;

import defaut.PointEntree;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import classes.Division;
import dao.DAO;
import dao.DivisionDAO;
import controleurs.ControleurPrincipal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Vue extends JFrame {
	
	private ControleurPrincipal leControleur = new ControleurPrincipal(null, null);
	
	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu division = new JMenu("Division");
	private JMenu eleve = new JMenu("Eleves");
	public final JMenuItem fermer = new JMenuItem("Fermer");
	
	//Déclaration des sous menus division
	private JMenuItem visualiser = new JMenuItem("Visualiser");
	private JMenuItem modifier = new JMenuItem("Modifier");
	private JMenuItem ajouter = new JMenuItem("Ajouter");
	private JMenuItem supprimer = new JMenuItem("Supprimer");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PointEntree.interfaceGraph.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param leControleur 
	 */
	public Vue(ControleurPrincipal leControleur) {
		this.leControleur=leControleur;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Menu division
		this.menuBar.add(division);
			//Ajout des sous menus division
			this.division.add(visualiser);
			this.division.add(modifier);
			this.division.add(ajouter);
			this.division.add(supprimer);
		
		//Menu éléves
			DAO<Division> daoDiv = new DivisionDAO();
			List<Division> lesDiv = daoDiv.readAll();
			for (Division uneDiv : lesDiv ) {
				JMenuItem divisionEleve = new JMenuItem(uneDiv.getLibelle());
				divisionEleve.setActionCommand(Integer.toString(uneDiv.getCode()));
				divisionEleve.addActionListener(leControleur);
				eleve.add(divisionEleve);
			}
			
		this.menuBar.add(eleve);
		/*fermer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});*/
		
		fermer.addActionListener(leControleur);
		menuBar.add(fermer);
		
			
		
		
	}
}
