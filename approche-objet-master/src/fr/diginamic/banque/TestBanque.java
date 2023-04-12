package fr.diginamic.banque;

import java.util.Iterator;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;


public class TestBanque {
	public static void main(String[] args) {
		Compte compte1 = new Compte(653, 345);
		System.out.println(compte1);
		
		TabOfCompt();
		
	}
	
	public static void TabOfCompt() {
		
		Compte[] compte = new Compte[2]; // j'instancie un nouveau compte qui va comprendre deux tab (new Compte[2]) qui attendent chaqun un compte (le deux veut dire que il y a 2 tableaux crée dans la variable compte mais elles sont pour l'instant null)
		compte[0] = new CompteTaux(133, 12, 5669); // à l'index un du tableau, je crée un compte avec les valeurs suivantes
		compte[1] = new CompteTaux(163, 22, 669); // idem pour celui-ci
		for (int i = 0; i < compte.length; i++) {
			System.out.println(compte[i].toString());
		}

	}
}
