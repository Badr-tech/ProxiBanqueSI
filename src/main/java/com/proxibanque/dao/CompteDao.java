package com.proxibanque.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.proxibanque.model.Client;
import com.proxibanque.model.Compte;

public class CompteDao {
	ArrayList<Compte> listeCompte = new ArrayList<Compte>();

	// Liste comptes
	public ArrayList<Compte> listeCompte() {
		Client client1 = new Client(1, "baatouti", "badr", 20300, 0634677455, "casa", "particulier");
		Client client2 = new Client(2, "baaziz", "chaimaa", 20400, 063467455, "casa", "particulier");
		Client client3 = new Client(3, "wahabi", "mohamed", 20500, 0634665455, "casa", "particulier");
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

	// Mthode trouver compte
	public int trouverCompte(Compte compte) {
		ArrayList<Compte> listComptes = listeCompte();
		int i = listComptes.indexOf(compte);
		return i;

	}

	// Methode retrait
	public void retraitDao(Compte compte1, double montant) {
		ArrayList<Compte> listeCompte = listeCompte();
		CompteDao cpt = new CompteDao();
		int i = cpt.trouverCompte(compte1);
		double solde = listeCompte.get(i).getSolde();
		solde = solde - montant;
		listeCompte.get(i).setSolde(solde);
		System.out.println(solde);
	}
	// Methode virement
	public void virementDao(Compte compte2, double montant) {
		ArrayList<Compte> listeCompte = listeCompte();
		CompteDao cpt = new CompteDao();
		int i = cpt.trouverCompte(compte2);
		double solde = listeCompte.get(i).getSolde();
		solde = solde + montant;
		listeCompte.get(i).setSolde(solde);
		System.out.println(solde);
		
	}
	//Methode lister compte
	public void listerCompte() {
		ArrayList<Compte>listeCompte= listeCompte();
		int i = 1;
		for(Compte c : listeCompte)
			System.out.println(i+" "+c);
			i++;
	}

	//Selectionner compte emetteur
	public Compte selectCompteEmetteur() {
		ArrayList<Compte> listeCompte= listeCompte();
		Scanner sc = new Scanner(System.in);
		System.out.println("Selectionner compte emetteur->");
		int i = sc.nextInt();
		Compte compteEmetteur = listeCompte.get(i -1);
		return compteEmetteur;
	}
	
	//Selectionner compte recepteur
		public Compte selectCompteRecepteur() {
			ArrayList<Compte> listeCompte= listeCompte();
			Scanner sc = new Scanner(System.in);
			System.out.println("Selectionner compte recepteur->");
			int i = sc.nextInt();
			Compte compteRecepteur = listeCompte.get(i -1);
			return compteRecepteur;
		}
}
