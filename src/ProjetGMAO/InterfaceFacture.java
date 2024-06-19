package ProjetGMAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class InterfaceFacture {

	private JFrame frame;
	private final JTextArea txtrGmao = new JTextArea();
	private JTextArea txtrN;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtDsignation;
	private JTextField txtQuantit;
	private JTextField txtPrixUnitaire;
	private JTextField txtPrixTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceFacture window = new InterfaceFacture();
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
	public InterfaceFacture() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().setForeground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 648, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		txtrGmao.setEditable(false);
		txtrGmao.setBounds(10, 0, 499, 22);
		txtrGmao.setText("                             GMAO");
		frame.getContentPane().add(txtrGmao);
		
		JTextPane txtpnGestionDeMaintenance = new JTextPane();
		txtpnGestionDeMaintenance.setBounds(10, 37, 154, 20);
		txtpnGestionDeMaintenance.setEditable(false);
		txtpnGestionDeMaintenance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnGestionDeMaintenance.setText("Gestion de maintenance");
		frame.getContentPane().add(txtpnGestionDeMaintenance);
		
		JTextPane txtpnFacturation = new JTextPane();
		txtpnFacturation.setBounds(174, 37, 84, 20);
		txtpnFacturation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnFacturation.setEditable(false);
		txtpnFacturation.setText("Facturation");
		frame.getContentPane().add(txtpnFacturation);
		
		JTextPane txtpnPayement = new JTextPane();
		txtpnPayement.setBounds(268, 37, 84, 20);
		txtpnPayement.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPayement.setEditable(false);
		txtpnPayement.setText("Payement");
		frame.getContentPane().add(txtpnPayement);
		
		JTextPane txtpnEdition = new JTextPane();
		txtpnEdition.setBounds(397, 37, 76, 20);
		txtpnEdition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnEdition.setEditable(false);
		txtpnEdition.setText("Edition");
		frame.getContentPane().add(txtpnEdition);
		
		JTextField txtFacture = new JTextField();
		txtFacture.setBounds(0, 79, 509, 20);
		txtFacture.setBackground(new Color(25, 25, 112));
		txtFacture.setSelectionColor(new Color(0, 0, 0));
		txtFacture.setText("                                          Facture");
		txtFacture.setForeground(new Color(240, 255, 255));
		frame.getContentPane().add(txtFacture);
		txtFacture.setColumns(10);
		
		txtrN = new JTextArea();
		txtrN.setBounds(41, 152, 91, 22);
		txtrN.setEditable(false);
		txtrN.setText("N* Facture");
		frame.getContentPane().add(txtrN);
		
		JTextArea txtrNDvis = new JTextArea();
		txtrNDvis.setBounds(41, 187, 91, 22);
		txtrNDvis.setText("N* Dévis");
		txtrNDvis.setEditable(false);
		frame.getContentPane().add(txtrNDvis);
		
		textField = new JTextField();
		textField.setBounds(188, 154, 233, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 189, 233, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JTextArea txtrDate = new JTextArea();
		txtrDate.setBounds(457, 152, 66, 22);
		txtrDate.setText("Date:");
		txtrDate.setEditable(false);
		frame.getContentPane().add(txtrDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(533, 154, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		txtDsignation = new JTextField();
		txtDsignation.setBounds(98, 250, 86, 22);
		txtDsignation.setEditable(false);
		txtDsignation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDsignation.setText("Désignation");
		frame.getContentPane().add(txtDsignation);
		txtDsignation.setColumns(10);
		
		txtQuantit = new JTextField();
		txtQuantit.setBounds(232, 250, 86, 20);
		txtQuantit.setEditable(false);
		txtQuantit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtQuantit.setText("Quantité");
		txtQuantit.setColumns(10);
		frame.getContentPane().add(txtQuantit);
		
		txtPrixUnitaire = new JTextField();
		txtPrixUnitaire.setBounds(353, 250, 86, 20);
		txtPrixUnitaire.setEditable(false);
		txtPrixUnitaire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPrixUnitaire.setText("Prix unitaire");
		txtPrixUnitaire.setColumns(10);
		frame.getContentPane().add(txtPrixUnitaire);
		
		txtPrixTotal = new JTextField();
		txtPrixTotal.setBounds(492, 250, 86, 20);
		txtPrixTotal.setEditable(false);
		txtPrixTotal.setText("Prix total");
		txtPrixTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPrixTotal.setColumns(10);
		frame.getContentPane().add(txtPrixTotal);
		
		JButton btnNewButton = new JButton("Enregistrer");
		btnNewButton.setBounds(503, 409, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Déconnexion");
		btnNewButton_1.setBounds(533, 49, 89, 23);
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Retour");
		btnNewButton_2.setBounds(41, 409, 89, 23);
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setHideActionText(true);
		frame.getContentPane().add(btnNewButton_2);
	}
}
