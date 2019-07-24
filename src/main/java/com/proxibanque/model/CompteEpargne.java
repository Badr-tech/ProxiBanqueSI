package com.proxibanque.model;

/**
 * implementation de la classe CompteEpargne qui herite de la classe Compte
 * 
 * @author BBW
 *
 */

public class CompteEpargne extends Compte {

	private int tauxRemuneration;
	private Client client;

	// Constructeurs
	/**
	 * constructeur avec 5 parametres
	 * 
	 * @param numCompte
	 * @param solde
	 * @param dateOverture
	 * @param tauxRemuneration
	 * @param client
	 */
	public CompteEpargne(int numCompte, int solde, String dateOverture, int tauxRemuneration, Client client) {
		super(numCompte, solde, dateOverture);
		this.tauxRemuneration = tauxRemuneration;
		this.client = client;
	}

	// Getters & setters
	/**
	 * @return
	 */
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration
	 */
	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * @return
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Méthode to string
	 */
	@Override
	public String toString() {
		return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + ", client=" + client + "]";
	}

}
