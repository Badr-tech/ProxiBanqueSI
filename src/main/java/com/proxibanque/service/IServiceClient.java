package com.proxibanque.service;

import com.proxibanque.model.Client;

/**
 * L'interface IServiceClient
 * @author BBW 
 */
public interface IServiceClient {
	

	/**
	 * @param client
	 * @throws Exception
	 * M�thode ajouter client
	 */
	void ajouterClient(Client client) throws Exception;

}