package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.ArrayList;
import fichier.Ville;
import java.nio.file.Files;

public class LectureFichier2 {
	

	public static void main (String[] args) throws IOException {
		ArrayList<String> listeVille = new ArrayList<>();
		Path pathFile = Paths.get("C:\\Users\\Utilisateur\\Desktop\\recensement.csv");
		Path pathCible = Paths.get("C:\\Users\\Utilisateur\\Desktop\\villes25.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		boolean exists = Files.exists(pathFile);
		
		if(exists) {
			
			for(int i  = 1; i < lines.size(); i++) {
				
				
				String[] tokens = lines.get(i).split(";");
				int nb = Integer.parseInt(tokens[9].replaceAll(" ",""));
				
				Ville ville = new Ville(tokens[6],tokens[2],tokens[1],nb);
				if(ville.getNbrPop() >= 25000) {
					listeVille.add(ville.getNom() + ";" + ville.getNbrPop() );
				}
				// listeVille.add(ville);
				
	

				
			}
			
			Files.write(pathCible, listeVille);
			
			
		}else {
			System.out.println("Erreur: Le fichier n'existe pas");
		}
	}

}
