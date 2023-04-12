package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte{
	

	private int TauxRemu;
	
	public CompteTaux(int idCompte, int sldCompte, int tdRemu) {
		super(idCompte, sldCompte);
		TauxRemu = tdRemu;
	}

	@Override
	public String toString() {
		
		return super.toString()+"CompteTaux [TauxRemu=" + TauxRemu + "]";
//		Compte compte1 = new Compte();
//		return compte1+TauxRemu;
	}

}
