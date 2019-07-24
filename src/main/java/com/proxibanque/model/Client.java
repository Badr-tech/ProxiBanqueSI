package com.proxibanque.model;

/**
 * implementation de la classe Client qui herite de la classe Personne
 * 
 * @author BBW
 *
 */

/**
 * implementation de la classe Client qui herite de la classe Personne
 * @author BBW
 *
 */
public class Client extends Personne {

	private String typeClient;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
<<<<<<< HEAD

	// Getters & setters
	/**
=======
	
	//Getters & setters
	/**
	 * getter de Type Client
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public String getTypeClient() {
		return typeClient;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * setter de Type Client
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param typeClient
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * getter de Compte Courant
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * setter de Compte Courant
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param compteCourant
	 */
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * getter de Compte Epargne
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @return
	 */
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
<<<<<<< HEAD

	/**
=======
	/**
	 * setter de Compte Epargne
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param compteEpargne
	 */
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	// Constructeurs
	/**
<<<<<<< HEAD
	 * Constructeur avec 9 parametres
	 * 
=======
	 * 
	 * constructeur avec 9 parametres
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 * @param typeClient
	 * @param compteCourant
	 * @param compteEpargne
	 */
	public Client(int id, String nom, String prenom, int codePostal, int telephone, String ville, String typeClient,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super(id, nom, prenom, codePostal, telephone, ville);
		this.typeClient = typeClient;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}
<<<<<<< HEAD

	/**
	 * 
	 * constructeur avec 7 parametres
	 * 
=======
	
	/**
	 * 
	 * constructeur avec 7 parametres
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param codePostal
	 * @param telephone
	 * @param ville
	 * @param typeClient
	 */
<<<<<<< HEAD

=======
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	public Client(int id, String nom, String prenom, int codePostal, int telephone, String ville, String typeClient) {
		super(id, nom, prenom, codePostal, telephone, ville);
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD

	/**
	 * Méthode toString
=======
	/**
	 * methode to String
>>>>>>> 381976502141c618d110a1321416d09f6be0d339
	 *
	 */
	@Override
	public String toString() {
		return super.getId() + " " + super.getNom() + " " + super.getPrenom() + " " + super.getCodePostal() + " "
				+ super.getTelephone() + " " + super.getVille() + " " + typeClient;
	}

}
