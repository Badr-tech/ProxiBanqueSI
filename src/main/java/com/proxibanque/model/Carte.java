package com.proxibanque.model;

/**
 * implementation de la classe carte
 * 
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
	 * @return
	 */
	public int getNumeroCarte() {
		return numeroCarte;
	}

	/**
	 * @param numeroCarte
	 */
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	/**
	 * @return
	 */
	public String getTypeCarte() {
		return typeCarte;
	}

	/**
	 * @param typeCarte
	 */
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	/**
	 * @return
	 */
	public boolean getActivation() {
		return activation;
	}

	/**
	 * @param activation
	 */
	public void setActivation(boolean activation) {
		this.activation = activation;
	}

	/**
	 * Méthode toString
	 *
	 */
	@Override
	public String toString() {
		return "Carte [numeroCarte=" + numeroCarte + ", typeCarte=" + typeCarte + ", activation=" + activation + "]";
	}

}
