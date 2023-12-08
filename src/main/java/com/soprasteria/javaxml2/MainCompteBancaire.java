package com.soprasteria.javaxml2;

import java.util.Scanner;

import org.jdom2.Document;
import org.jdom2.Element;


public class MainCompteBancaire {

	public static void main(String[] args) {
		// Création de l'élément racine en mémoire de type Document
		Document doc = new Document();
					
		// Création de l'élément racine : Comptes
		doc.setRootElement(new Element("Comptes"));
		
		//Lire les infos du clavier
		Scanner clavier = new Scanner(System.in); 
		System.out.println("Saisir un numéro de compte :");
		int numCompte = clavier.nextInt();
		System.out.println("Saisir un nom :");
		int nomProprietaire = clavier.nextInt();
		System.out.println("Saisir un solde :");
		int solde = clavier.nextInt();
		System.out.println("Saisir le type du compte :");
		int typeCompte = clavier.nextInt();
		
		
	}
	
	//Methode pour créer un element 
		private static Element createCompteXMLElement(CompteBancaire compte) {
		        Element compteElement = new Element("Compte");
		        
		        compteElement.addContent(new Element("numCompte").setText(""+compte.getNumCompte()));
		        compteElement.addContent(new Element("nomProprietaire").setText(compte.getNomProprietaire()));
		        compteElement.addContent(new Element("solde").setText("" + compte.getSolde()));
		        compteElement.addContent(new Element("typeCompte").setText(compte.getTypeCompte()));
		        return compteElement;
		    }
}
