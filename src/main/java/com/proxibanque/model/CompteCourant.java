package com.proxibanque.model;

/**
 * implementation de la classe CompteCourant qui herite de la classe Compte
<<<<<<< HEAD
 * 
=======
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
 * @author BBW
 *
 */
public class CompteCourant extends Compte {

	private Client Client;
	private double plafond;

	// Contructeurs
	/**
	 * constructeur avec 5 parametres
	 * 
	 * @param numCompte
	 * @param solde
	 * @param client
	 * @param dateOverture
	 * @param plafond
	 */

<<<<<<< HEAD
	public CompteCourant(int numCompte, int solde, Client client, String dateOverture, double plafond) {
=======
	/**
	 * constructeur avec 5 parametres
	 * @param numCompte
	 * @param solde
	 * @param client
	 * @param dateOverture
	 * @param plafond
	 */
	public CompteCourant(int numCompte, int solde,  Client client,String dateOverture,double plafond) {
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
		super(numCompte, solde, dateOverture);
		Client = client;
		this.plafond = plafond;
	}

	// Getters & setters
	/**
<<<<<<< HEAD
=======
	 * getter de Client
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public Client getClient() {
		return Client;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Client
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param client
	 */
	public void setClient(Client client) {
		Client = client;
	}

	/**
	 * getter de Plafond
	 * @return
	 */
	public double getPlafond() {
		return plafond;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Plafond
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param plafond
	 */
	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	/**
<<<<<<< HEAD
	 * Méthode toSTring
=======
	 * methode to String
	 *
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 */
	@Override
	public String toString() {
		return "CompteCourant [Client=" + Client + ", plafond=" + plafond + ", getNumCompte()=" + getNumCompte()
				+ ", getSolde()=" + getSolde() + ", getDateOverture()=" + getDateOverture() + "]";
	}

}
