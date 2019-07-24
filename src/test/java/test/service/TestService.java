package test.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.proxibanque.model.Compte;
import com.proxibanque.service.ServiceCompte;


class TestService {

	ArrayList<Compte> liste = new ArrayList<Compte>();
	ServiceCompte serviceCompte;
	Compte compte;
	@Test
	void testerLeRetour() {
		serviceCompte = new ServiceCompte();
		compte = new Compte();

		assertArrayEquals(liste, serviceCompte.listerCompte());
	}
}
