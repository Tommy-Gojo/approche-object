package fr.diginamic.testenumeration;

import java.util.ArrayList;
import fr.diginamic.testenumeration.Saison;
public class TestEnumeration {
	public static void main (String[] agrs) {
//		ArrayList<String> listSaison = new ArrayList<>();
		
//		for(Saison ListSaison : Saison.values()) {
//			System.out.println(ListSaison.getNom());
//		}
//		System.out.println(Saison.valueOf("ETE"));
	
		String libelle = "Hiver";
        Saison saison = Saison.getSaisonByLibelle(libelle);
        if (saison != null) {
            System.out.println("La saison correspondant au libellé \"" + libelle + "\" est : " + saison);
        } else {
            System.out.println("Aucune saison ne correspond au libellé \"" + libelle + "\"");
        }
		
		
	}
	
	
}
