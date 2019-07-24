package com.proxibanque.model;
/**
 * implementation de la classe agence
 * @author BBW
 *
 */
public class Agence {

	private int numId;
	private int dateDeCreation;
	

	// Getters & setters

	/**
	 * @return
	 */
	public int getNumId() {
		return numId;
	}

	/**
	 * @param numId
	 */
	public void setNumId(int numId) {
		this.numId = numId;
	}

	/**
	 * @return
	 */
	public int getDateDeCreation() {
		return dateDeCreation;
	}

	/**
	 * @param dateDeCreation
	 */
	public void setDateDeCreation(int dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	// Constructeurs

	/**
	 * Constructeur avec deux paramètres
	 * @param numId
	 * @param dateDeCreation
	 */
	public Agence(int numId, int dateDeCreation) {
		super();
		this.numId = numId;
		this.dateDeCreation = dateDeCreation;
	}

	/**
	 * Constructeur snas paramètre
	 */
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *Méthode toString
	 */
	@Override
	public String toString() {
		return "Agence [numId=" + numId + ", dateDeCreation=" + dateDeCreation + "]";
	}

	

	
}
