package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Debit d1 = new Debit("35", 34);
		Credit c1 = new Credit("34", 44);
		Debit d2 = new Debit("35", 34);
		Credit c2 = new Credit("34", 44);
		
		Operation[] ope = {d1, c1, d2, c2};
		int Total = 0;
		for (int i = 0; i < ope.length; i++) {
			if(ope[i].getType().equals("DEBIT")) {
				System.out.println("Le solde est à "+Total);
				Total -= ope[i].getMontant();
				System.out.println("J'enleve "+ope[i].getMontant()+" ce qui nous fait "+Total);			
			}else {
				System.out.println("Le solde est à "+Total);
				Total += ope[i].getMontant();
				System.out.println("Je rajoute "+ope[i].getMontant()+" ce qui nous fait "+Total);
			}
		}
	}

}
