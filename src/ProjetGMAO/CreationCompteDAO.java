package ProjetGMAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CreationCompteDAO {
	
	
	/**
	 * Paramètres de connexion à la base de données oracle URL, LOGIN et PASS
	 * sont des constantes
	 */
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//final static String URL = "jdbc:mysql://localhost/stock";
	
	final static String LOGIN = "prof";  //exemple BDD1
	final static String PASS = "isgeic2019";   //exemple BDD1

	
	/**
	 * Constructeur de la classe
	 * 
	 */
	public CreationCompteDAO() {
		// chargement du pilote de bases de données
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err
					.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
		}

	}

	/**
	 * Permet d'ajouter un article dans la table article Le mode est auto-commit
	 * par défaut : chaque insertion est validée
	 * 
	 * @param article
	 *            l'article à ajouter
	 * @return retourne le nombre de lignes ajoutées dans la table
	 */
	public int ajouter(CreationCompte c) {
		Connection con = null;
		PreparedStatement ps = null;      
		int retour = 0;

		// connexion à la base de données
		try {

			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// préparation de l'instruction SQL, chaque ? représente une valeur
			// à communiquer dans l'insertion
			// les getters permettent de récupérer les valeurs des attributs
			// souhaités
			ps = con.prepareStatement("INSERT INTO Compte (matricule, password) VALUES (?, ?)");
			ps.setInt(1, c.getMatricule());
			ps.setString(2, c.getPassword());
			//ps.setInt(3, article.getPuHt());
		//	ps.setInt(4, article.getQteStock());

			// Exécution de la requête
			retour = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}

	private String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getMatricule() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Permet de récupérer un article à partir de sa référence
	 * 
	 * @param reference
	 *            la référence de l'article à récupérer
	 * @return 	l'article trouvé;
	 * 			null si aucun article ne correspond à cette référence
	 */
	public CreationCompteFenetre getMatricule(int matricule) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CreationCompteFenetre retour = null;

		// connexion à la base de données
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM compte WHERE matricule = ?");
			ps.setInt(1, matricule);

			// on exécute la requête
			// rs contient un pointeur situé juste avant la première ligne
			// retournée
			rs = ps.executeQuery();
			// passe à la première (et unique) ligne retournée
			if (rs.next())
				retour = new CreationCompteFenetre(rs.getInt("matricule"),rs.getString("password"));
					//	rs.getInt("art_pu_ht"), rs.getInt("art_qte_stock"));

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du ResultSet, du PreparedStatement et de la Connexion
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ignore) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}

	/**
	 * Permet de récupérer tous les articles stockés dans la table article
	 * 
	 * @return une ArrayList d'Articles
	 */
	public List<CreationCompteFenetre> getListeCompte() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CreationCompteFenetre> retour = new ArrayList<CreationCompteFenetre>();

		// connexion à la base de données
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM compte");

			// on exécute la requête
			rs = ps.executeQuery();
			// on parcourt les lignes du résultat
			while (rs.next())
				retour.add(new CreationCompteFenetre(rs.getInt("matricule"), rs
						.getString("password")));
					//	, rs
					//	.getInt("art_pu_ht"), rs.getInt("art_qte_stock")));

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du rs, du preparedStatement et de la connexion
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ignore) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}

	// main permettant de tester la classe
	/*public static void main(String[] args) throws SQLException {

		ArticleDAO articleDAO = new ArticleDAO();
		// test de la méthode ajouter
		Article a1 = new Article(2, "Set de 2 raquettes de ping-pong", 149.9,10);
		int retour = articleDAO.ajouter(a1);

		System.out.println(retour + " lignes ajoutées");

		// test de la méthode getArticle
		Article a2 = articleDAO.getArticle(1);
		System.out.println(a2);

		// test de la méthode getListeArticles
		List<Article> liste = articleDAO.getListeArticles();
		// affichage des articles
		for (Article art : liste) {
			System.out.println(art.toString());
		}

	}*/

}
