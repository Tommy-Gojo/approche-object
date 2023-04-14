package entites;

public class Cercle {
	double Rayon;

	public Cercle(double rayon) {
		Rayon = rayon;
	}
	
	public double PerOfCercle() {
		Double PI = 3.14;
		Double Perimetre = (Rayon * 2) * PI;
		return Perimetre;
	}
	
	public double SurfOfCercle() {
		Double PI = 3.14;
		Double Surface = PI * Rayon * Rayon;
		return Surface;
	}
}
