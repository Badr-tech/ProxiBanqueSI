package com.proxibanque.model;

/**
 * implementation de la classe Gerant qui herite de la classe Personne
 * 
 * @author BBW
 *
 */
public class Gerant extends Personne {

	private String login;
	private String password;

	// Constructeurs
	/**
	 * constructeur avec 8 parametres
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 * @param login
	 * @param password
	 */
	public Gerant(int id, String nom, String prenom, int codePostal, int telephone, String ville, String login,
			String password) {
		super(id, nom, prenom, codePostal, telephone, ville);
		this.login = login;
		this.password = password;
	}

	// Gettesr & Setters
	/**
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Méthode to STring
	 */
	@Override
	public String toString() {
		return "Gerant [login=" + login + ", password=" + password + "]";
	}

}
