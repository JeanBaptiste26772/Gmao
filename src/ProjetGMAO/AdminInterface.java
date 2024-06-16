package ProjetGMAO;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminInterface {

    private JFrame frame;
    private JTextField txtIdentifiant;
    private JPasswordField txtMotDePasse;
    private JLabel lblIdentifiant;
    private JLabel lblMotDePasse;
    private JButton btnConnexion;
    private JLabel lblAdmin;
    private JButton btnRetour;
    private JButton btnManageUsers;
    private JButton btnViewReports;
    private JButton btnOtherOperation;
    private JLabel lblErreur;
    private JButton btnCreerAdminEnt;
    private JButton btnModifierAdminEnt;
    private JButton btnSupprimerAdminEnt;

    /**
     * Create the application.
     */
    public AdminInterface() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblAdmin = new JLabel("Bienvenue, Administrateur Système");
        lblAdmin.setBounds(140, 50, 200, 15);
        frame.getContentPane().add(lblAdmin);

        // Label Identifiant
        lblIdentifiant = new JLabel("Identifiant :");
        lblIdentifiant.setBounds(100, 80, 100, 30);
        frame.getContentPane().add(lblIdentifiant);

        // TextField Identifiant
        txtIdentifiant = new JTextField();
        txtIdentifiant.setBounds(200, 80, 200, 30);
        frame.getContentPane().add(txtIdentifiant);
        txtIdentifiant.setColumns(10);

        // Label Mot de Passe
        lblMotDePasse = new JLabel("Mot de Passe :");
        lblMotDePasse.setBounds(100, 130, 100, 30);
        frame.getContentPane().add(lblMotDePasse);

        // PasswordField Mot de Passe
        txtMotDePasse = new JPasswordField();
        txtMotDePasse.setBounds(200, 130, 200, 30);
        frame.getContentPane().add(txtMotDePasse);
        txtMotDePasse.setColumns(10);

        // Button Connexion
        btnConnexion = new JButton("Connexion");
        btnConnexion.setBounds(200, 180, 200, 30);
        frame.getContentPane().add(btnConnexion);

        // Label Erreur (initialement caché)
        lblErreur = new JLabel("");
        lblErreur.setBounds(200, 220, 300, 30);
        frame.getContentPane().add(lblErreur);

        btnConnexion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logique de vérification des identifiants (à compléter)
                String identifiant = txtIdentifiant.getText();
                String motDePasse = new String(txtMotDePasse.getPassword());

                if (identifiant.equals("admin") && motDePasse.equals("admin123")) {
                    // Afficher les boutons d'opérations
                    showAdminOperations();
                } else {
                    // Afficher un message d'erreur si les identifiants sont incorrects
                    lblErreur.setText("Identifiant ou mot de passe incorrect");
                    lblErreur.setVisible(true);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });

        // Bouton Retour
        btnRetour = new JButton("Retour");
        btnRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InterfaceHM window = new InterfaceHM();
                window.setVisible(true);
                frame.dispose();
            }
        });
        btnRetour.setBounds(10, 10, 85, 21);
        frame.getContentPane().add(btnRetour);
    }

    private void showAdminOperations() {
        // Masquer les champs d'identifiant et de mot de passe, et le bouton de connexion
        lblIdentifiant.setVisible(false);
        txtIdentifiant.setVisible(false);
        lblMotDePasse.setVisible(false);
        txtMotDePasse.setVisible(false);
        btnConnexion.setVisible(false);
        lblErreur.setVisible(false);

        // Afficher les boutons d'opérations
        btnManageUsers = new JButton("Créer un compte client");
        btnManageUsers.setBounds(140, 100, 160, 25);
        frame.getContentPane().add(btnManageUsers);

        btnViewReports = new JButton("Modifier un compte client");
        btnViewReports.setBounds(140, 140, 160, 25);
        frame.getContentPane().add(btnViewReports);

        btnOtherOperation = new JButton("Supprimer un compte client");
        btnOtherOperation.setBounds(140, 180, 160, 25);
        frame.getContentPane().add(btnOtherOperation);
        
        btnCreerAdminEnt=new JButton("Ajouter un Administrateur d'entreprise");
        btnCreerAdminEnt.setBounds(140, 220, 160, 25);
        frame.getContentPane().add(btnCreerAdminEnt);
        
        btnModifierAdminEnt=new JButton("Modifier un Administrateur d'entreprise");
        btnModifierAdminEnt.setBounds(140, 260, 160, 25);
        frame.getContentPane().add(btnModifierAdminEnt);
        
        btnSupprimerAdminEnt=new JButton("Supprimer un Administrateur d'entreprise");
        btnSupprimerAdminEnt.setBounds(140, 300, 160, 25);
        frame.getContentPane().add(btnSupprimerAdminEnt);
        
        
        frame.revalidate();
        frame.repaint();
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
