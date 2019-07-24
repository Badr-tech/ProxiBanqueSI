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
	 * getter de numero ID
	 * @return
	 */
	public int getNumId() {
		return numId;
	}

	/**
	 * setter de numero ID
	 * @param numId
	 */
	public void setNumId(int numId) {
		this.numId = numId;
	}

	/**
	 * getter de Date De Creation
	 * @return
	 */
	public int getDateDeCreation() {
		return dateDeCreation;
	}

	/**
	 * setter de Date De Creation
	 * @param dateDeCreation
	 */
	public void setDateDeCreation(int dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	// Constructeurs

	/**
	 * constructeur avec 2 parametres 
	 * @param numId
	 * @param dateDeCreation
	 */
	public Agence(int numId, int dateDeCreation) {
		super();
		this.numId = numId;
		this.dateDeCreation = dateDeCreation;
	}

	/**
	 * 
	 * constructeur sans parametres
	 * 
	 */
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * methode toString
	 *
	 */
	@Override
	public String toString() {
		return "Agence [numId=" + numId + ", dateDeCreation=" + dateDeCreation + "]";
	}

	

	
}
