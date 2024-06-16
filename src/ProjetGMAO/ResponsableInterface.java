package ProjetGMAO;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ResponsableInterface {
	private JFrame frame;
	private JTextField txtIdentifiant;
    private JPasswordField txtMotDePasse;
    private JLabel lblIdentifiant;
    private JLabel lblMotDePasse;
    private JButton btnConnexion;
    private JLabel lblAdmin;
    private JButton btnRetour;
    private JButton btnSaisirMaint;
    private JButton btnModifierMaint;
    private JButton btnSuppMaint;
    private JButton btnConsulte;
    private JButton btnCreerOp;
    private JButton btnModifierOp;
    private JButton btnSupprimerOp;
	
	
//	 public static void main(String[] args) {
	   //     EventQueue.invokeLater(new Runnable() {
	 //           public void run() {
	              //  try {
	            //        ResponsableInterface resp = new ResponsableInterface();
	          //          resp.frame.setVisible(true);
	        //        } catch (Exception e) {
	      //              e.printStackTrace();
	    //            }
	  //          }
	//        });
//	    }

	    /**
	     * Create the application.
	     */
	    public ResponsableInterface() {
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

	        JLabel lblAdmin = new JLabel("Bienvenue, Responsable Maintenance");
	        lblAdmin.setBounds(140, 50, 220, 15);
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
	        
	        
	        btnConnexion.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	showAdminEntOperations();
	            }
	        });

	            

	       // JButton btnManageUsers = new JButton("Gérer les utilisateurs");
	       // btnManageUsers.setBounds(140, 100, 160, 25);
	       // frame.getContentPane().add(btnManageUsers);

	//        JButton btnViewReports = new JButton("Voir les rapports");
	  //      btnViewReports.setBounds(140, 140, 160, 25);
	    //    frame.getContentPane().add(btnViewReports);
	        
	        JButton btnRetour = new JButton("Retour");
	        btnRetour.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	InterfaceHM window = new InterfaceHM();
	                window.main(null);
	                frame.dispose();
	            }
	        });
	        btnRetour.setBounds(10, 10, 85, 21);
	        frame.getContentPane().add(btnRetour);
	    }
	    
	    
	    private void showAdminEntOperations() {
	        // Masquer les champs d'identifiant et de mot de passe, et le bouton de connexion
	        lblIdentifiant.setVisible(false);
	        txtIdentifiant.setVisible(false);
	        lblMotDePasse.setVisible(false);
	        txtMotDePasse.setVisible(false);
	        btnConnexion.setVisible(false);
	       // lblErreur.setVisible(false);

	        // Afficher les boutons d'opérations
	        
	        
	        btnCreerOp=new JButton("Ajouter un Opérateur");
	        btnCreerOp.setBounds(140, 220, 190, 25);
	        frame.getContentPane().add(btnCreerOp);
	        
	        btnModifierOp=new JButton("Modifier un Opérateur");
	        btnModifierOp.setBounds(140, 260, 190, 25);
	        frame.getContentPane().add(btnModifierOp);
	        
	        btnSupprimerOp=new JButton("Supprimer un Opérateur");
	        btnSupprimerOp.setBounds(140, 300, 190, 25);
	        frame.getContentPane().add(btnSupprimerOp);
	        
	        
	        btnSaisirMaint=new JButton("Saisir Maintenance");
	        btnSaisirMaint.setBounds(140, 340, 190, 25);
	        frame.getContentPane().add(btnSaisirMaint);
	        
	        btnModifierMaint=new JButton("Modifier demande Maintenance");
	        btnModifierMaint.setBounds(140, 380, 190, 25);
	        frame.getContentPane().add(btnModifierMaint);
	        
	        
	        btnSuppMaint=new JButton("Supprimer Maintenance");
	        btnSuppMaint.setBounds(140, 420, 190, 25);
	        frame.getContentPane().add(btnSuppMaint);
	        
	        btnConsulte=new JButton("Consulter Demandes");
	        btnConsulte.setBounds(140, 460, 190, 25);
	        frame.getContentPane().add(btnConsulte);
	        
	        

	        frame.revalidate();
	        frame.repaint();
	    }

	    public void setVisible(boolean visible) {
	        frame.setVisible(visible);
	    }


}
