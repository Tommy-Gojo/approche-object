package fr.diginamic.operations;

public class CalculMoyenne {
	double[] tab1 = new double[0];
	
	public CalculMoyenne(double[] tab) {
		tab1=tab;
	}
	public void ajout(double[] tab1) {
		double[] Tab2 = new double[tab1.length +1];
		for (int i = 0; i < tab1.length; i++) {
			Tab2[i] = tab1[i];
//		Tabl[i].lenght -1;
		
		}
		tab1 = Tab2;
		
	}
	public  void calcul() {
		double Total = 0;
		for (int i = 0; i < tab1.length; i++) {
			Total += tab1[i];
			
		}
		double moyenne = Total / tab1.length;
		System.out.println(moyenne);
	}
}
