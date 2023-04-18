package Listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CreationListe {
	public static void main (String[] args) {
		System.out.println("------------------ Exo 1 ------------------");
	
		ArrayList<Integer> liste = new ArrayList<>();
		for(int i = 1; i < 101; i++) {
			liste.add(i);
			System.out.println(liste.get(i-1));
		}	
			
			System.out.println("------------------ Exo 2 ------------------");
			
		
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		//TODO Développements à réaliser ci-dessous
		
		ArrayList<String> liste3 = new ArrayList<String>();
		liste1.addAll(liste2);
		liste3.addAll(liste1);
		System.out.println(liste3);
		
		System.out.println("------------------ Exo 3 ------------------");
		System.out.println("----------- Package TestListeInt -----------");
		
		ArrayList<Integer> liste4 = new ArrayList<>();
		
		liste4.add(-1);
		liste4.add(5);
		liste4.add(7);
		liste4.add(3);
		liste4.add(-2);
		liste4.add(4);
		liste4.add(8);
		liste4.add(5);
		
		
		System.out.println(liste4); // affiche tous les elements 
		
		System.out.println(liste4.size()); // affiche la taille
		
		Collections.sort(liste4); // je trie d'abbord la liste avec Collections.sort()
		System.out.println(liste4); // j'affiche que apres la liste et non le tie car collections.sort() ne retourne rien, il tie juste
		
		liste4.remove(Collections.min(liste4)); // je prends la liste4 et je remove ce qui à entre les (). Dans les (), il y a une methode qui retourne le plus petit element de la table que je mets dans les () de collections.min().
		System.out.println(liste4); // puis j'affiche le resultat
		
		
		for(int j = 0; j < liste4.size(); j++) { 
			if( liste4.get(j) < 0) { 			 // si a l'index j, le chiffre est inferieur à 0,
				liste4.set(j, -liste4.get(j));   // je change l'index j par sont opposés en le recuperant avec get(l'index) et en mettant - pour sont opposés
			}
		}
		System.out.println(liste4);
		
		
		System.out.println("------------------ Exo 4 ------------------");
		System.out.println("--------- Package TestListeString ---------");
		
		ArrayList<String> liste5 = new ArrayList<String>();
		
		
		liste5.add("Nice");
		liste5.add("Carcassonne");
		liste5.add("Narbonne");
		liste5.add("Lyon");
		liste5.add("Foix");
		liste5.add("Pau");
		liste5.add("Marseille");
		liste5.add("Tarbes");
		
		for(int k = 0; k < liste5.size() ; k++) {
			if(liste5.get(k) >= 2 ) {
				System.out.println(liste5.get(k));
			}
		}
	}
}
