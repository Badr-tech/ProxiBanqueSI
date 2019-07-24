package com.proxibanque.presentation;

import java.util.Scanner;

import com.proxibanque.dao.ClientDao;

import com.proxibanque.dao.CompteDao;
import com.proxibanque.model.Agence;
import com.proxibanque.model.Client;
import com.proxibanque.model.Compte;
import com.proxibanque.service.IServiceClient;
import com.proxibanque.service.IServiceCompte;
import com.proxibanque.service.ServiceClient;
import com.proxibanque.service.ServiceCompte;

/**
 * @author BBW La classe MonApplication qui est le point d'entrée de mon
 *         application
 */
public class MonApplication {

	/**
	 * Méthode main
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Bonjour dans l'application ProxiBanqueSI.V1 ");

		// Affiche le menu de départ
		int choix = 11;
		do {
			System.out.println("+------------------- MENU ------------------+");
			System.out.println("| Taper 1 pour voir la liste des Agences    |");
			System.out.println("| Taper 3 pour quitter                      |"); // Toujours un soucis...sortie boucle
																					// grace à 3 et non 0...
			System.out.println("+-------------------------------------------+");
			// ENVOYER LA LISTE DES AGENCES AVEC POSSIBILITE DE CHOISIR AGENCE1 OU AGENCE2
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
			if (choix == 1) {
				System.out.println("Vous avez choisi l'Agence n° ");// +IEntite.get(Id)+"*/); ECRIRE LE N° DE L'AGENCE
				sc.nextLine();
				// AFFICHAGE MENU POUR CHOIX EN FONCTION DE L'ACTEUR
				System.out.println("+---------------- MENU CHOIX ---------------+");
				System.out.println("| Taper 1 si vous êtes un gérant d'agence   |");
				System.out.println("| Taper 2 si vous êtes un conseiller        |");
				System.out.println("| Taper 3 pour quitter                      |");
				System.out.println("+-------------------------------------------+");

				choix = sc.nextInt();

				if (choix == 1) {
					do {
						sc.nextLine();
						System.out.println("+------------------- MENU GERANT ------------------+");
						System.out.println("| Taper 1 pour auditer votre agence                |");
						System.out.println("| Taper 2 pour quitter                             |");
						System.out.println("+--------------------------------------------------+");
						choix = sc.nextInt();

						if (choix == 1) {
							sc.nextLine();
							System.out.println("+----------- GESTION DE VOTRE AGENCE -----------+");
							System.out.println("|                                               |");
							System.out.println("|******                                         |");
							System.out.println("|Voici la liste des particuliers de l'agence qui|\n"
									+ "|sont débiteurs de plus de 5000€ :              |");
							// Envoyer la liste des PARTICULIERS débiteurs de plus de 5000€
							System.out.println("|                                               |");
							System.out.println("|******                                         |");
							System.out.println("|Voici la liste des entreprises de l'agence qui |\n"
									+ "|sont débiteurs de plus de 50 000€ :            |");
							// Envoyer la liste des ENTREPRISES débiteurs de plus de 5000€
							System.out.println("|                                               |");
							System.out.println("+-----------------------------------------------+");
						}
					} while (choix != 2);

					System.out.println("A BIENTOT...");
					return;

				}
				if (choix == 2) {
					do {
						sc.nextLine();
						System.out.println("+--------------------- MENU CONSEILLER ------------------+");
						System.out.println("| Taper 1 pour créer un client                           |");
						System.out.println("| Taper 2 pour modifier un client                        |");
						System.out.println("| Taper 3 pour lire les informations d'un client         |");
						System.out.println("| Taper 4 pour supprimer un client                       |");
						System.out.println("| Taper 5 pour simuler un crédit                         |");
						System.out.println("| Taper 6 pour effectuer un virement de compte à compte  |");
						System.out.println("| Taper 7 pour quitter                                   |");
						System.out.println("+--------------------------------------------------------+");
						choix = sc.nextInt();

						if (choix == 1) {
							sc.nextLine();
							System.out.println("+------ CREATION D'UN CLIENT ------+");
						} else if (choix == 2) {
							sc.nextLine();
							System.out.println("+------ MODIFICATION D'UN CLIENT ------+");
						} else if (choix == 3) {
							sc.nextLine();
							System.out.println("+------ LECTURE DES INFOS D'UN CLIENT ------+");
						} else if (choix == 4) {
							sc.nextLine();
							System.out.println("+------ SUPPRIMER UN CLIENT ------+");
						} else if (choix == 5) {
							sc.nextLine();
							System.out.println("+------ EFFECTUER UN CREDIT ------+");
						} else if (choix == 6) {
							sc.nextLine();
							System.out.println("+------ EFFECTUER UN VIREMENT ------+");

							IServiceClient serviceClient = new ServiceClient();
							IServiceCompte serviceCompte = new ServiceCompte();
							CompteDao compteDao = new CompteDao();

							serviceCompte.listerCompte();
							System.out.println("Choisir le compte à débiter");
							int compte1 = sc.nextInt();
							System.out.println("Choisir le compte à créditer");
							int compte2 = sc.nextInt();

							Compte compteDebiteur = compteDao.getById(compte1);
							Compte compteCrediteur = compteDao.getById(compte2);
							System.out.println("Entrer le Montant a verser");
							double montant = sc.nextInt();
							serviceCompte.effectuerVirement(compteDebiteur, compteCrediteur, montant);
							double resultat = compteDebiteur.getSolde() + montant;
							System.out.println(resultat);

						}

					} while (choix != 7);
					System.out.println("A BIENTOT...");
					return;
				}
			}
			while (choix != 3)
				;
			System.out.println("A BIENTOT...");
			return;
		} while (choix != 3);

	}

}
