package ProjetGMAO;

public class CreationCompte {
	
	
	/** 
	 * référence du matricule
	 */
	private int matricule;		
	/**
	 * Mot de passe
	 */
	private String password;	
	/**
	 * prix unitaire hors taxe
	 */
	//private int puHt;		
	/**
	 * quantité en stock
	 */
//	private int qteStock;


	/**
	 * Constructeur
	 * @param reference référence de l'article
	 * @param designation désignation
	 * @param puHt prix unitaire hors taxe
	 * @param qteStock quantité en stock
	 */
	public CreationCompte(int matricule, String password) {
		this.matricule=matricule;
		this.password = password;
	//	this.puHt = puHt;
		//this.qteStock = qteStock;
	}
	
	/**
	 * getter pour l'attribut reference
	 * @return valeur de la reference article
	 */
	public int getMatricule() {
		return matricule;
	}
	/**
	 * getter pour l'attribut désignation
	 * @return valeur de la désignation article
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * setter  pour l'attribut designation
	 * @param designation : nouvelle valeur de la désignation article
	 */
//	public void setDesignation(String designation) {
	//	this.designation = designation;
	//}
	/**
	 * getter  pour l'attribut puHt
	 * @return valeur de prix unitaire HT
	 */
	//public int getPuHt() {
		//return this.puHt;
	//}
	/**
	 * setter  pour l'attribut puHt
	 * @param puHt :  nouvelle valeur de prix unitaire HT
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	/**
	 * getter  pour l'attribut qteStock
	 * @return valeur de quantité en stock
	 */
	//public int getQteStock() {
		//return qteStock;
//	}
	/**
	 * setter  pour l'attribut qteStock
	 * @param qteStock : nouvelle valeur de prix unitaire HT
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Redéfinition de la méthode toString permettant de définir la traduction de l'objet en String
	 * pour l'affichage par exemple
	 */
	public String toString() {
		return "creationCompte [compte : " + matricule + " - " + password + " en stock]";
	}

}
