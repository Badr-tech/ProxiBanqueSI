package com.proxibanque.dao;

import java.util.ArrayList;

import com.proxibanque.model.Compte;

/**
 * Implementation DAO pour la classe Compte
 * 
 * @author BBW
 * 
 * 
 *
 */
public class CompteDao implements IDao<Compte> {
	ArrayList<Compte> listeCompte = new ArrayList<Compte>();

	/**
	 * creer un compteDAO
	 *
	 */
	@Override
	public boolean create(Compte compte) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * mettre a jour un compteDAO
	 *
	 */
	@Override
	public boolean update(Compte compte) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 *
	 * supprimer un compteDAO
	 */
	@Override
	public boolean delete(Compte compte) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * lister un compteDAO par son id
	 */
	@Override
	public Compte getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *
	 * lister tous les compteDAO
	 */
	@Override
	public ArrayList<Compte> getAll() throws Exception {

		Compte compte1 = new Compte(1, 3000.00, "06-12-2019");
		Compte compte2 = new Compte(2, 4000.00, "16-03-2019");
		Compte compte3 = new Compte(3, 5000.00, "17-10-2019");
		Compte compte4 = new Compte(4, 6000.00, "07-12-2016");
		listeCompte.add(compte1);
		listeCompte.add(compte2);
		listeCompte.add(compte3);
		listeCompte.add(compte4);
		return listeCompte;
	}
}
