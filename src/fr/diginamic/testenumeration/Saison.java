package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
//	private String nom;
	private String libelle;
	private int order;
	
	
	private Saison(String libelle, int order) {
		this.order = order;
		this.libelle = libelle;
	}
	
	

	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
//	public String getNom() {
//		return nom;
//	}
	public String getLibelle() {
		return libelle;
	}
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	public static Saison getSaisonByLibelle(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.libelle.equalsIgnoreCase(libelle)) {
                return saison;
            }
        }
        return null;
    }
	



	
}
