package com.proxibanque.model;



/**
 * implementation de la classe Client qui herite de la classe Personne
 * @author BBW
 *
 */
public class Client extends Personne {

	private String typeClient;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	//Getters & setters
	/**
	 * getter de Type Client
	 * @return
	 */
	public String getTypeClient() {
		return typeClient;
	}
	/**
	 * setter de Type Client
	 * @param typeClient
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	/**
	 * getter de Compte Courant
	 * @return
	 */
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
	/**
	 * setter de Compte Courant
	 * @param compteCourant
	 */
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
	/**
	 * getter de Compte Epargne
	 * @return
	 */
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
	/**
	 * setter de Compte Epargne
	 * @param compteEpargne
	 */
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	// Constructeurs
	/**
	 * 
	 * constructeur avec 9 parametres
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 * @param typeClient
	 * @param compteCourant
	 * @param compteEpargne
	 */
	public Client(int id, String nom, String prenom, int codePostal, int telephone, String ville, String typeClient,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super(id, nom, prenom, codePostal, telephone, ville);
		this.typeClient = typeClient;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}
	
	/**
	 * 
	 * constructeur avec 7 parametres
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 * @param typeClient
	 */
	public Client(int id, String nom, String prenom, int codePostal, int telephone, String ville, String typeClient) {
		super(id, nom, prenom, codePostal, telephone, ville);
		// TODO Auto-generated constructor stub
	}
	/**
	 * methode to String
	 *
	 */
	@Override
	public String toString() {
		return super.getId()+" "+super.getNom()+" "+super.getPrenom()+" "+super.getCodePostal()+" "+super.getTelephone()+" "+super.getVille()+ " "+typeClient;
	}
	
	

	
	
}
