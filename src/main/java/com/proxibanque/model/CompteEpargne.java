package com.proxibanque.model;

/**
 * implementation de la classe CompteEpargne qui herite de la classe Compte
 * 
 * @author BBW
 *
 */

public class CompteEpargne extends Compte {

<<<<<<< HEAD
	private int tauxRemuneration;
	private Client client;

	// Constructeurs
	/**
	 * constructeur avec 5 parametres
	 * 
=======
/**
 * implementation de la classe CompteEpargne qui herite de la classe Compte
 * @author BBW
 *
 */
public class CompteEpargne extends Compte{
	
	private int tauxRemuneration;
	private Client client;
	
	//Constructeurs
	/**
	 * constructeur avec 5 parametres
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
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

<<<<<<< HEAD
	// Getters & setters
	/**
=======
	//Getters & setters
	/**
	 * Getter de Taux Remuneration
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Taux Remuneration
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param tauxRemuneration
	 */
	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Client
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public Client getClient() {
		return client;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Client
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
<<<<<<< HEAD
	 * Méthode to string
=======
	 * methode to String
	 *
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 */
	@Override
	public String toString() {
		return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + ", client=" + client + "]";
	}

}
