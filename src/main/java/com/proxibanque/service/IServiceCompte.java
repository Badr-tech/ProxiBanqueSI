package com.proxibanque.service;

import java.util.ArrayList;

import com.proxibanque.model.Compte;

/**
 * L'interface IServiceCompte
 * @author BBW 
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