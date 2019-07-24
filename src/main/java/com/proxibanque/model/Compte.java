package com.proxibanque.model;

<<<<<<< HEAD
/**
 * implementation de la classe Compte
 * 
 * @author BBW
 *
 */
=======

>>>>>>> 381976502141c618d110a1321416d09f6be0d339

/**
 * implementation de la classe Compte
 * @author BBW
 *
 */
public class Compte {

	private int numCompte;
	private double solde;
	private String dateOverture;
<<<<<<< HEAD

	// Getters & setters

	/**
=======
	
	//Getters & setters
	
	/**
	 * getter de Numero de Compte
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public int getNumCompte() {
		return numCompte;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * setter de Numero de Compte
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param numCompte
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * getter de Solde
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public double getSolde() {
		return solde;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * setter de Solde
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * getter de Date Ouverture
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getDateOverture() {
		return dateOverture;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * setter de Date Ouverture
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param dateOverture
	 */
	public void setDateOverture(String dateOverture) {
		this.dateOverture = dateOverture;
	}
<<<<<<< HEAD

	// Constructeurs
	/**
	 * constructeur avec 3 parametres
	 * 
=======
	
	//Constructeurs
	
	/**
	 * constructeur avec 3 parametres
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param numCompte
	 * @param solde
	 * @param dateOverture
	 */
<<<<<<< HEAD

=======
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	public Compte(int numCompte, double solde, String dateOverture) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOverture = dateOverture;
	}
<<<<<<< HEAD

	/**
	 * constructeur sans parametres
	 */

=======
	/**
	 *  constructeur sans parametres
	 */
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD

	/**
	 * Méthode toString
=======
	/**
	 *methode to String
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 */
	@Override
	public String toString() {
		return "Num Compte = " + numCompte + ", Solde = " + solde + ", Date d'overture= " + dateOverture + "]";
	}

}
