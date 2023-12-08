package com.soprasteria.javaxml2;

import java.time.LocalDate;

public class CompteBancaire {

	private int numCompte;
	private String nomProprietaire;
	private Double solde;
	private LocalDate dateCreation;
	private String typeCompte;
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
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public CompteBancaire(int numCompte, String nomProprietaire, Double solde, LocalDate dateCreation,
			String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.nomProprietaire = nomProprietaire;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.typeCompte = typeCompte;
	}
	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", nomProprietaire=" + nomProprietaire + ", solde=" + solde
				+ ", dateCreation=" + dateCreation + ", typeCompte=" + typeCompte + "]";
	}
	

}
