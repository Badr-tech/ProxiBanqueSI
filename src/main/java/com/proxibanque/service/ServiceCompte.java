package com.proxibanque.service;

import java.util.ArrayList;

import com.proxibanque.dao.CompteDao;
import com.proxibanque.model.Compte;

/**
 * La class ServiceCompte qui implément l'interface IServiceClient
 * @author BBW
 * 
 *
 */
public class ServiceCompte implements IServiceCompte {

	/**
	 * Methode effectuer virement pour éxecuter la fonctionnalité effectuer virement
	 *
	 */
	@Override
	public boolean effectuerVirement(Compte compteDebiteur, Compte compteCrediteur, double montant) {
		double soldeDebiteur = compteDebiteur.getSolde();
		if (soldeDebiteur < montant)
			return false;
		else {
			compteDebiteur.setSolde(soldeDebiteur - montant);
			compteCrediteur.setSolde(compteCrediteur.getSolde() + montant);

			System.out.println("virement avec succés");

			return true;
		}
	}

	// 
	/**Methode lister compte pour afficher touts les comptes 
	 *
	 */
	@Override
	public ArrayList<Compte> listerCompte() throws Exception {
		CompteDao compteDao = new CompteDao();

		int i = 1;
		ArrayList<Compte> listeCompte = compteDao.getAll();
		for (Compte c : listeCompte)
			System.out.println(i + " " + c);
		i++;
		return listeCompte;
	}

}
