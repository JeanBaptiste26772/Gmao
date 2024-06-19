package ProjetGMAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DemandeMaintenance {

	private JFrame frame;
	private JTextField txtN;
	private JTextField txtEquipement;
	private JTextField txtPourLe;
	private JTextField txtDescription;
	private JTextField txtEtat;
	private JTextField txtPrisEnCharge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemandeMaintenance window = new DemandeMaintenance();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemandeMaintenance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Gestion de Maintenance");
		btnNewButton.setBounds(0, 0, 180, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnFacturation = new JButton("Facturation");
		btnFacturation.setBounds(185, 0, 178, 23);
		frame.getContentPane().add(btnFacturation);
		
		JButton btnP = new JButton("Payement");
		btnP.setBounds(365, 0, 180, 23);
		frame.getContentPane().add(btnP);
		
		JButton btnNewButton_1 = new JButton("Edition");
		btnNewButton_1.setBounds(545, 0, 109, 23);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnCrerUneDemande = new JButton("Créer une demande");
		btnCrerUneDemande.setBounds(0, 70, 180, 66);
		frame.getContentPane().add(btnCrerUneDemande);
		
		JButton btnNewButton_2_1 = new JButton("Créer un dévis");
		btnNewButton_2_1.setBounds(0, 147, 180, 66);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Liste des devis");
		btnNewButton_2_2.setBounds(0, 224, 180, 66);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Afficher Liste");
		btnNewButton_2_3.setBounds(0, 301, 180, 66);
		frame.getContentPane().add(btnNewButton_2_3);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText("N*");
		txtN.setBounds(206, 70, 69, 20);
		frame.getContentPane().add(txtN);
		txtN.setColumns(10);
		
		txtEquipement = new JTextField();
		txtEquipement.setText("Equipement");
		txtEquipement.setEditable(false);
		txtEquipement.setColumns(10);
		txtEquipement.setBounds(206, 116, 86, 20);
		frame.getContentPane().add(txtEquipement);
		
		txtPourLe = new JTextField();
		txtPourLe.setEditable(false);
		txtPourLe.setText("Pour le:");
		txtPourLe.setColumns(10);
		txtPourLe.setBounds(206, 147, 76, 20);
		frame.getContentPane().add(txtPourLe);
		
		txtDescription = new JTextField();
		txtDescription.setEditable(false);
		txtDescription.setText("Description");
		txtDescription.setColumns(10);
		txtDescription.setBounds(206, 201, 86, 20);
		frame.getContentPane().add(txtDescription);
		
		txtEtat = new JTextField();
		txtEtat.setEditable(false);
		txtEtat.setText("Etat");
		txtEtat.setColumns(10);
		txtEtat.setBounds(206, 265, 86, 20);
		frame.getContentPane().add(txtEtat);
		
		txtPrisEnCharge = new JTextField();
		txtPrisEnCharge.setEditable(false);
		txtPrisEnCharge.setText("Pris en charge par:");
		txtPrisEnCharge.setColumns(10);
		txtPrisEnCharge.setBounds(206, 335, 109, 20);
		frame.getContentPane().add(txtPrisEnCharge);
	}

}
