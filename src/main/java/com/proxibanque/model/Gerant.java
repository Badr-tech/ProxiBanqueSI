package com.proxibanque.model;

/**
 * implementation de la classe Gerant qui herite de la classe Personne
<<<<<<< HEAD
 * 
=======
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
 * @author BBW
 *
 */
public class Gerant extends Personne {

	private String login;
	private String password;

	// Constructeurs
	/**
	 * constructeur avec 8 parametres
<<<<<<< HEAD
	 * 
=======
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
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
<<<<<<< HEAD
=======
	 * getter de Login
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Login
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Password
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Password
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
<<<<<<< HEAD
	 * Méthode to STring
=======
	 *methode to String
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 */
	@Override
	public String toString() {
		return "Gerant [login=" + login + ", password=" + password + "]";
	}

}
