package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private static String nom;
	private int order;
	
	 
	
	private Saison(int order) {
		this.order = order;
	}



	public static String getNom() {
		return nom;
	}



	public static void setNom(String nom) {
		Saison.nom = nom;
	}



	public int getOrder() {
		return order;
	}



	public void setOrder(int order) {
		this.order = order;
	}



	public String returnS (String nom) {
		return Saison.nom;
	}
}
