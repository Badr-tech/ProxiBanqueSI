package com.proxibanque.model;

import java.text.DateFormat;

import com.proxibanque.dao.ClientDao;

public class Compte {

	
	private int numCompte;
	private double solde;
	private String dateOverture;
	
	//Getters & setters
	
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getDateOverture() {
		return dateOverture;
	}
	public void setDateOverture(String dateOverture) {
		this.dateOverture = dateOverture;
	}
	
	//Constructeurs
	
	public Compte(int numCompte, double solde, String dateOverture) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOverture = dateOverture;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Num Compte = " + numCompte + ", Solde = " + solde + ", Date d'overture= " + dateOverture + "]";
	}
	
	
	
	
	
	
}
