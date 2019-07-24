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
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return
	 */
	public String getVille() {
		return ville;
	}

	/**
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

	/**
	 * Methode toString
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", codePostal=" + codePostal
				+ ", telephone=" + telephone + ", ville=" + ville + "]";
	}

}
