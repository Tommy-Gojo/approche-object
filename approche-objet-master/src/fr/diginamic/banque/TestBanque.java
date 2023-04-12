package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
	public static void main(String[] args) {
		Compte compte1 = new Compte(7653, 345);
		System.out.println(compte1.getSldDuCompte());
		System.out.println(compte1.getNumDeCompte());
	}
}
