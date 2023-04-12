package entites2;

import entites.AdressePostale;

public class Personne {
	private String nom;
	private String prenom;
	private AdressePostale adresse ;
	
	public Personne(String leNom,String lePrenom ){
	nom = leNom;
	prenom = lePrenom;
	
	}

	public  Personne(String leNom,String lePrenom, AdressePostale ladressePostal ){
	nom = leNom;
	prenom = lePrenom;
	adresse = ladressePostal ;
	}
	
	public void uppercase() {
		System.out.println(nom.toUpperCase()+ " "+prenom);
	}
	
	public void changeNom(String leNom ) {
		 nom =  leNom;
	}
	public void changePrenom(String lePrenom ) {
		prenom = lePrenom;
	}
	public void changeAdresse(AdressePostale ladressePostal ) {
		adresse = ladressePostal;
	}
	
	public String returnNom() {
		 return  nom;
	}
	public String returnPrenom() {
		 return  prenom;
	}
	public AdressePostale returnAdresse() {
		 return  adresse;
	}

}
