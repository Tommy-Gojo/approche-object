package fr.diginamic.testenumeration;

import java.util.ArrayList;
import fr.diginamic.testenumeration.Saison;
public class TestEnumeration {
	public static void main (String[] agrs) {
//		ArrayList<String> listSaison = new ArrayList<>();
		
		for(Saison ListSaison : Saison.values()) {
			System.out.println(ListSaison.getNom());
		}
		System.out.println(Saison.valueOf("ETE"));
	
		
		
		
	}
	
	
}
