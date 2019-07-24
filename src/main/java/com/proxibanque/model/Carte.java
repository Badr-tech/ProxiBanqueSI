package com.proxibanque.model;

/**
 * implementation de la classe carte
<<<<<<< HEAD
 * 
=======
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
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
<<<<<<< HEAD
=======
	 * 
	 * getter de Numero Carte
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public int getNumeroCarte() {
		return numeroCarte;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Numero Carte
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param numeroCarte
	 */
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	/**
<<<<<<< HEAD
=======
	 * getter de Type Carte
	 * 
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getTypeCarte() {
		return typeCarte;
	}

	/**
<<<<<<< HEAD
=======
	 * setter de Type Carte
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param typeCarte
	 */
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	/**
<<<<<<< HEAD
	 * @return
	 */
	public boolean getActivation() {
=======
	 * getter d' Activation
	 * @return
	 */
	public boolean isActivation() {
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
		return activation;
	}

	/**
<<<<<<< HEAD
=======
	 * 
	 * setter d'Activation
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param activation
	 */
	public void setActivation(boolean activation) {
		this.activation = activation;
	}

	/**
<<<<<<< HEAD
	 * Méthode toString
=======
	 * methode toString
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 *
	 */
	@Override
	public String toString() {
		return "Carte [numeroCarte=" + numeroCarte + ", typeCarte=" + typeCarte + ", activation=" + activation + "]";
	}

}
