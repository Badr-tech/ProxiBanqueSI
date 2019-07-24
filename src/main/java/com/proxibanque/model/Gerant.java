package com.proxibanque.model;

/**
 * implementation de la classe Gerant qui herite de la classe Personne
 * @author BBW
 *
 */
public class Gerant extends Personne {

	private String login;
	private String password;

	// Constructeurs
	/**
	 * constructeur avec 8 parametres
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
	 * getter de Login
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * setter de Login
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * getter de Password
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setter de Password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 *methode to String
	 */
	@Override
	public String toString() {
		return "Gerant [login=" + login + ", password=" + password + "]";
	}
	

}
