package com.proxibanque.service;

import com.proxibanque.dao.ClientDao;

import com.proxibanque.model.Client;

/**
 * @author BBW La class ServiceClient qui implément l'interface IServiceClient
 */
public class ServiceClient implements IServiceClient {

	/**
	 * Constructeurs
	 */
	public ServiceClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Méthode ajouter client qui permet d'ajouter des nouveau clients
	 *
	 */
	@Override
	public void ajouterClient(Client client) throws Exception {
		ClientDao clientDao = new ClientDao();
		clientDao.create(client);
	}

}
