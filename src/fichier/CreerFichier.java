package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
		public static void main (String[] args) throws IOException {
			
			Path pathFile = Paths.get("C:\\Users\\Serena Loury\\Desktop\\recensement.csv");
			Path pathCible = Paths.get("C:\\Users\\Serena Loury\\Desktop\\recensement100er.txt");
			boolean exists = Files.exists(pathFile);
			if(exists) {
				List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
				 // System.out.println(lines);
				ArrayList<String> listOfRes = new ArrayList<String>();
				String allLines = "0";
				for(int i = 0; i<100; i++) {
					allLines = lines.get(i);
					listOfRes.add(allLines);
					System.out.println(listOfRes);
					
				}
				Files.write(pathCible, listOfRes);
				
				
			}else {
				System.out.println("Erreur: Le fichier n'existe pas");
			}
			
		}
}
