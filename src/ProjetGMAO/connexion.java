package ProjetGMAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class connexion {

	private JFrame frame;
	private JButton btnNewButton;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connexion window = new connexion();
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
	public connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Connexion");
		btnNewButton.setBounds(208, 209, 128, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextField textField = new JTextField();
		textField.setBounds(250, 42, 176, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrIdentifiant = new JTextArea();
		txtrIdentifiant.setEditable(false);
		txtrIdentifiant.setText("Identifiant");
		txtrIdentifiant.setBounds(72, 40, 93, 22);
		frame.getContentPane().add(txtrIdentifiant);
		
		JTextArea txtrMotDePasse = new JTextArea();
		txtrMotDePasse.setEditable(false);
		txtrMotDePasse.setText("Mot de Passe");
		txtrMotDePasse.setBounds(72, 116, 101, 22);
		frame.getContentPane().add(txtrMotDePasse);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 118, 176, 20);
		frame.getContentPane().add(textField_1);
	}
}
