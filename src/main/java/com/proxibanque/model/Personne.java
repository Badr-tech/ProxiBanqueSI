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
<<<<<<< HEAD
=======
	 * getter de Id
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Id
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Nom
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Nom
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Prenom
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Prenom
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Code Postal
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Code Postal
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param codePostal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Telephone
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Telephone
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param telephone
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Ville
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getVille() {
		return ville;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Ville
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
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

<<<<<<< HEAD
=======
	// Methode toString
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	/**
	 * Methode toString
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", codePostal=" + codePostal
				+ ", telephone=" + telephone + ", ville=" + ville + "]";
	}

}
