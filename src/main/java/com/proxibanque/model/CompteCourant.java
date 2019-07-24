package com.proxibanque.model;

/**
 * implementation de la classe CompteCourant qui herite de la classe Compte
 * @author BBW
 *
 */
public class CompteCourant extends Compte {

	private Client Client;
	private double plafond;

	// Contructeurs

	/**
	 * constructeur avec 5 parametres
	 * @param numCompte
	 * @param solde
	 * @param client
	 * @param dateOverture
	 * @param plafond
	 */
	public CompteCourant(int numCompte, int solde,  Client client,String dateOverture,double plafond) {
		super(numCompte, solde, dateOverture);
		Client = client;
		this.plafond = plafond;
	}

	// Getters & setters
	/**
	 * getter de Client
	 * @return
	 */
	public Client getClient() {
		return Client;
	}

	/**
	 * setter de Client
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
	 * setter de Plafond
	 * @param plafond
	 */
	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	/**
	 * methode to String
	 *
	 */
	@Override
	public String toString() {
		return "CompteCourant [Client=" + Client + ", plafond=" + plafond + ", getNumCompte()=" + getNumCompte()
				+ ", getSolde()=" + getSolde() + ", getDateOverture()=" + getDateOverture() + "]";
	}

}
