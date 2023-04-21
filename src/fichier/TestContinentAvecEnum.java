package fichier;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
	public static void main(String[] args) {
        
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", "États-Unis", Continent.AMERIQUE));
        villes.add(new Ville("Paris", "France", Continent.EUROPE));
        villes.add(new Ville("Pékin", "Chine", Continent.ASIE));
        villes.add(new Ville("Moscou", "Russie", Continent.EUROPE));
        villes.add(new Ville("Berlin", "Allemagne", Continent.EUROPE));
        villes.add(new Ville("Sydney", "Australie", Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", "Brésil", Continent.AMERIQUE));
        villes.add(new Ville("Dakar", "Sénégal", Continent.AFRIQUE));


        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
