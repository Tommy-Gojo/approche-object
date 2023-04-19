package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fichier.Ville;

public class MapVilles {
	public static void main (String[] args) {
		Ville ville1 = new Ville("Montpellier","34","Herault",457000);
		Ville ville2 = new Ville("Paris","78","Ile-de-France",1904930);
		Ville ville3 = new Ville("lens","30","Je ne sais pas",10);
		Ville ville4 = new Ville("Orléans","09","Mileu",180000);
		Ville ville5 = new Ville("Marseille","13","Aix-en-provance",1004930);
		
		Map<String, Integer> allVilles = new HashMap<>();
		int nbrPop =  ville1.getNbrPop();
		
		allVilles.put(ville1.getNom(), Integer.toString(nbrPop));
	}
}
