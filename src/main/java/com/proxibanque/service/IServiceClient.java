package com.proxibanque.service;

import com.proxibanque.model.Client;

/**
 * @author BBW L'interface IServiceClient
 */
public interface IServiceClient {
	

	/**
	 * @param client
	 * @throws Exception
	 * M�thode ajouter client
	 */
	void ajouterClient(Client client) throws Exception;

}