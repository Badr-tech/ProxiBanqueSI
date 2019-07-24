package com.proxibanque.model;

/**
 * implementation de la classe ConseilleClient qui herite de la classe Personne
 * @author BBW
 *
 */
public class ConseilleClient extends Personne {

	private String login;
	private String password;

	// Constructeurs

	/**
	 * constructeur avec 6 parametres
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 */
	public ConseilleClient(int id, String nom, String prenom, int codePostal, int telephone, String ville) {
		super(id, nom, prenom, codePostal, telephone, ville);
		// TODO Auto-generated constructor stub
	}

	// Getters & Setters

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
		return "ConseilleClient [login=" + login + ", password=" + password + "]";
	}

}
