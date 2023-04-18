package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier2 {
	public static void main (String[] args) throws IOException {
		
		Path pathFile = Paths.get("C:\\Users\\Serena Loury\\Desktop\\recensement.csv");
		boolean exists = Files.exists(pathFile);
		if(exists) {
			List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			System.out.println(lines);
		}else {
			System.out.println("Erreur: Le fichier n'existe pas");
		}
		
	}

}
