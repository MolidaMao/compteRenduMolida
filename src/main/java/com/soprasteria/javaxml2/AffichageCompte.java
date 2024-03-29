package com.soprasteria.javaxml2;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;


public class AffichageCompte {

	public static void main(String[] args) {
		final String fileName = "comptesBancaires.xml";
		try {
            // phase 1 : désérialisation qui consiste à la création du document
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(fileName);
            Document jdomDoc = builder.build(xmlFile);
            
            // phase 2 : récupération du root et de ses enfants (children)
            
            Element root = jdomDoc.getRootElement();
            // création d'une variable de type liste d'éléments 
            List < Element > listOfCompteBancaires = root.getChildren("Compte");
            
            // phase 3 reconstruction de l'objet 
            List < CompteBancaire > compteBancaires = new ArrayList<>();
            for(Element element : listOfCompteBancaires)
            {
            	CompteBancaire compte = new CompteBancaire();
            	compte.setNumCompte(Integer.parseInt(element.getChildText("numCompte")));
            	compte.setNomProprietaire(element.getChildText("nomProprietaire"));
            	compte.setSolde(Double.parseDouble(element.getChildText("solde")));
				compte.setTypeCompte(element.getChildText("typeCompte"));
				compte.setDate(LocalDate.parse(element.getChildText("date")));
				
				if (compte.getTypeCompte().equals("courant")) {
					compteBancaires.add(compte);
				}
            }
            
            System.out.println(compteBancaires);
            
		} catch (Exception e) {
            e.printStackTrace();
        }

	}
}
