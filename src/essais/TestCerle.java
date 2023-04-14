package essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCerle {
	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5.345);
		Double calc1 = cercle1.PerOfCercle();
		System.out.println("Le perimetre du cercle est de "+calc1);
		Cercle cercle2 = new Cercle(9.345);
		Double calc2 = cercle2.SurfOfCercle();
		System.out.println("La surface du cercle est de "+calc2);
		Cercle cercle3 = CercleFactory.createCercle(3.45); 
	}
	
}
 