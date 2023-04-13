package fr.diginamic.banque.entites;

public class Compte {
	
	private int NumDeCompte;
	private int SldDuCompte;
	
	public Compte(int idCompte, int sldCompte) {
		NumDeCompte = idCompte;
		SldDuCompte = sldCompte; 
	}
	
	
	public int getNumDeCompte() {
		return NumDeCompte;
	}

	public void setNumDeCompte(int numDeCompte) {
		NumDeCompte = numDeCompte;
	}

	public int getSldDuCompte() {
		return SldDuCompte;
	}

	public void setSldDuCompte(int sldDuCompte) {
		SldDuCompte = sldDuCompte;
	}
}
