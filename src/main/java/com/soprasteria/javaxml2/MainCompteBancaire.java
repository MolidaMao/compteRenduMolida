package com.soprasteria.javaxml2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class MainCompteBancaire {

	public static void main(String[] args) {
		// Création de l'élément racine en mémoire de type Document
		Document doc = new Document();

		// Création de l'élément racine : Comptes
		doc.setRootElement(new Element("Comptes"));

		//Lire les infos du clavier

		try {

			// Creation des objets de type CompteBancaire
			CompteBancaire c1 = createCompteBancaire();
			CompteBancaire c2 = createCompteBancaire();
			
			//Attacher les deux élements à l'élement racine Compte
			doc.getRootElement().addContent(createCompteXMLElement(c1));
			doc.getRootElement().addContent(createCompteXMLElement(c2));

			// xml outputter : objet pour ecrire dans un fichier .xml
			XMLOutputter xmlOutput = new XMLOutputter();
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("comptesBancaires.xml"));
			System.out.println("File Saved!");

		} catch (IOException io) {
			System.out.println(io.getMessage());        
		}

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
	
	private static CompteBancaire createCompteBancaire() {
		Scanner clavier = new Scanner(System.in); 
		System.out.println("Saisir un numéro de compte :");
		int numCompte = clavier.nextInt();
		System.out.println("Saisir un nom :");
		String nomProprietaire = clavier.next();
		System.out.println("Saisir un solde :");
		Double solde = clavier.nextDouble();
		System.out.println("Saisir le type du compte :");
		String typeCompte = clavier.next();

		// Creation des objets de type CompteBancaire
		CompteBancaire c = new CompteBancaire(numCompte, nomProprietaire, solde, typeCompte);
		return c;
	}
}
