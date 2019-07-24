package com.proxibanque.model;

/**
 * Implementation de la classe Personne
 * 
 * @author BBW
 *
 */
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int codePostal;
	private int telephone;
	private String ville;

	// Getters et setters

	/**
	 * getter de Id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * setter de Id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * getter de Nom
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter de Nom
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getter de Prenom
	 * 
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * setter de Prenom
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * getter de Code Postal
	 * 
	 * @return
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * setter de Code Postal
	 * 
	 * @param codePostal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * getter de Telephone
	 * 
	 * @return
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * setter de Telephone
	 * 
	 * @param telephone
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	/**
	 * getter de Ville
	 * 
	 * @return
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * setter de Ville
	 * 
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	// Constructeurs
	/**
	 * constructeur avec 6 parametres
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 */
	public Personne(int id, String nom, String prenom, int codePostal, int telephone, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.ville = ville;
	}

	// Methode toString
	/**
	 * Methode toString
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", codePostal=" + codePostal
				+ ", telephone=" + telephone + ", ville=" + ville + "]";
	}

}
