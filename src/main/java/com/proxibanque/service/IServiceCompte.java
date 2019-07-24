package com.proxibanque.service;

import java.util.ArrayList;

import com.proxibanque.model.Compte;

/**
 * @author BBW L'interface IServiceCompte
 */
public interface IServiceCompte {

	/**
	 * @param compteDebiteur
	 * @param compteCrediteur
	 * @param montant
	 * @return Methode effectuer virement
	 */
	boolean effectuerVirement(Compte compteDebiteur, Compte compteCrediteur, double montant);

	// Methode lister compte
	ArrayList<Compte> listerCompte() throws Exception;

}