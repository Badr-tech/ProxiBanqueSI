package com.proxibanque.model;

/**
 * implementation de la classe Compte
 * 
 * @author BBW
 *
 */

public class Compte {

	private int numCompte;
	private double solde;
	private String dateOverture;

	// Getters & setters

	/**
	 * @return
	 */
	public int getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @return
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return
	 */
	public String getDateOverture() {
		return dateOverture;
	}

	/**
	 * @param dateOverture
	 */
	public void setDateOverture(String dateOverture) {
		this.dateOverture = dateOverture;
	}

	// Constructeurs
	/**
	 * constructeur avec 3 parametres
	 * 
	 * @param numCompte
	 * @param solde
	 * @param dateOverture
	 */

	public Compte(int numCompte, double solde, String dateOverture) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOverture = dateOverture;
	}

	/**
	 * constructeur sans parametres
	 */

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Méthode toString
	 */
	@Override
	public String toString() {
		return "Num Compte = " + numCompte + ", Solde = " + solde + ", Date d'overture= " + dateOverture + "]";
	}

}
