package ProjetGMAO;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class CreationCompteFenetre extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    public JFrame frame;
    private JTextField txtFieldMatricule;
    private JTextField txtFieldPassword;
    private JButton btnNewButton;
    private CreationCompteDAO monCompteDAO;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreationCompteFenetre window = new CreationCompteFenetre();
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
    public CreationCompteFenetre() {
        initialize();
        this.monCompteDAO = new CreationCompteDAO();
    }

    public CreationCompteFenetre(int int1, String string) {
        // TODO Auto-generated constructor stub
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        btnNewButton = new JButton("Valider");
        btnNewButton.setBackground(Color.GREEN);
        btnNewButton.setBounds(180, 256, 133, 23);
        frame.getContentPane().add(btnNewButton);

        txtFieldMatricule = new JTextField();
        txtFieldMatricule.setEditable(false);
        txtFieldMatricule.setText("Entrer votre matricule");
        txtFieldMatricule.setBounds(38, 57, 126, 20);
        frame.getContentPane().add(txtFieldMatricule);
        txtFieldMatricule.setColumns(10);

        txtFieldPassword = new JTextField();
        txtFieldPassword.setEditable(false);
        txtFieldPassword.setText("   Entrer un mot de passe");
        txtFieldPassword.setColumns(10);
        txtFieldPassword.setBounds(38, 115, 126, 20);
        frame.getContentPane().add(txtFieldPassword);

        textField = new JTextField();
        textField.setBounds(203, 57, 193, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(203, 115, 193, 20);
        frame.getContentPane().add(textField_1);

        btnNewButton.addActionListener(this);
    }

    /**
     * Gère les actions réalisées sur les boutons
     */
    public void actionPerformed(ActionEvent ae) {
        int retour; // code de retour de la classe ArticleDAO

        try {
            if (ae.getSource() == btnNewButton) {
                // Vérifiez que les champs ne sont pas vides
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // on crée l'objet message
                CreationCompte c = new CreationCompte(
                        Integer.parseInt(this.textField.getText()),
                        this.textField_1.getText());

                // on demande à la classe de communication d'envoyer l'article
                // dans la table article
                retour = monCompteDAO.ajouter(c);
                // affichage du nombre de lignes ajoutées
                // dans la bdd pour vérification
                System.out.println("" + retour + " ligne ajoutée ");
                if (retour == 1)
                    JOptionPane.showMessageDialog(frame, "Compte ajouté !");
                else
                    JOptionPane.showMessageDialog(frame, "Erreur ajout compte", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Veuillez contrôler vos saisies", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.err.println("Veuillez contrôler vos saisies");
            e.printStackTrace();
        }
        
        
        
    }
}
