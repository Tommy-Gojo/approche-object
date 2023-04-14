package fr.dginamic.essais;

import fr.diginamic.operations.CalculMoyenne;
public class TestMoyenne {
	public static void main(String[] args) {
		double[] tab1 = {34,34,32,89,9,45};
		CalculMoyenne Calc1 = new CalculMoyenne(tab1);
		
		Calc1.ajout(tab1);
		Calc1.calcul();
		
		double[] tab2 = {20,14,12.4,9,2,15};
		CalculMoyenne Calc2 = new CalculMoyenne(tab2);
		
		
		Calc2.ajout(tab2);
		Calc2.calcul();
	}
}
