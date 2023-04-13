package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne("test", "test");
		System.out.println(personne1);
		AdressePostale adresse2 = new AdressePostale(11,"test",34,"test");
		Personne personne2 = new Personne("test", "test", adresse2 );
		System.out.println(personne2);
	
		personne1.changeNom("testnom");
		System.out.println(personne1.returnNom());
		personne1.uppercase();
		System.out.println(personne2.returnAdresse());
	}
	

}
