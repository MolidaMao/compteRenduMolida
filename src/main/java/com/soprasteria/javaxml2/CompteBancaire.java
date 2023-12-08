package com.soprasteria.javaxml2;

import java.time.LocalDate;

public class CompteBancaire {

	private int numCompte;
	private String nomProprietaire;
	private Double solde;
	private String typeCompte;
	private LocalDate date;
	
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public String getNomProprietaire() {
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public CompteBancaire() {
		
	}
	public CompteBancaire(int numCompte, String nomProprietaire, Double solde, String typeCompte, LocalDate date) {
		super();
		this.numCompte = numCompte;
		this.nomProprietaire = nomProprietaire;
		this.solde = solde;
		this.typeCompte = typeCompte;
		this.date = date;
	}
	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", nomProprietaire=" + nomProprietaire + ", solde=" + solde
				+ ", typeCompte=" + typeCompte + ", date=" + date.toString() + "]";
	}
	




}
