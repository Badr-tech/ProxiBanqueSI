package com.proxibanque.dao;

import java.util.ArrayList;

import com.proxibanque.model.Client;

/**
 * Implementation DAO pour la classe Client
 * 
 * @author BBW
 * 
 * 
 *
 */
public class ClientDao implements IDao<Client> {

	ArrayList<Client> listeClient = new ArrayList<Client>();

	/**
	 * creer un clientDAO
	 * 
	 * @param id
	 * @return true
	 * 
	 * 
	 */

	@Override
	public boolean create(Client client) throws Exception {
		listeClient.add(client);
		System.out.println("Ajouter");
		for (Client clientcree : listeClient)
			System.out.println(clientcree);
		return true;
	}

	/**
	 *
	 * mettre a jour un clientDAO
	 */
	@Override
	public boolean update(Client client) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * supprimer un clientDAO
	 *
	 */
	@Override
	public boolean delete(Client client) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * lister un clientDAO par son id
	 *
	 */
	@Override
	public Client getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * lister tous les clientDAO
	 *
	 */
	@Override
	public ArrayList<Client> getAll() throws Exception {
		Client clt1 = new Client(1, "baatouti", "badr", 20300, 0634677455, "casa", "particulier");
		Client clt2 = new Client(2, "baaziz", "chaimaa", 20400, 063467455, "casa", "particulier");
		Client clt3 = new Client(3, "wahabi", "mohamed", 20500, 0634665455, "casa", "particulier");
		listeClient.add(clt1);
		listeClient.add(clt2);
		listeClient.add(clt3);
		return listeClient;
	}

}
