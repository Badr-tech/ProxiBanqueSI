package com.proxibanque.model;

/**
 * implementation de la classe carte
 * @author BBW
 *
 */
public class Carte {

	private int numeroCarte;
	private String typeCarte;
	private boolean activation;

	// Constructeurs
	/**
	 * Constructeur avec 3 parametres
	 * 
	 * @param numeroCarte
	 * @param typeCarte
	 * @param activation
	 */
	public Carte(int numeroCarte, String typeCarte, boolean activation) {
		super();
		this.numeroCarte = numeroCarte;
		this.typeCarte = typeCarte;
		this.activation = activation;
	}

	// Getters & Setters
	/**
	 * 
	 * getter de Numero Carte
	 * @return
	 */
	public int getNumeroCarte() {
		return numeroCarte;
	}

	/**
	 * setter de Numero Carte
	 * @param numeroCarte
	 */
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	/**
	 * getter de Type Carte
	 * 
	 * @return
	 */
	public String getTypeCarte() {
		return typeCarte;
	}

	/**
	 * setter de Type Carte
	 * @param typeCarte
	 */
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	/**
	 * getter d' Activation
	 * @return
	 */
	public boolean isActivation() {
		return activation;
	}

	/**
	 * 
	 * setter d'Activation
	 * @param activation
	 */
	public void setActivation(boolean activation) {
		this.activation = activation;
	}

	/**
	 * methode toString
	 *
	 */
	@Override
	public String toString() {
		return "Carte [numeroCarte=" + numeroCarte + ", typeCarte=" + typeCarte + ", activation=" + activation + "]";
	}
	

}
