package maps;

import java.util.Map;
import java.util.HashMap;
public class CreationMap {
	public static void main(String[] args) {
		System.out.println("<----------Exo2----------->");
		
		
		Map<String, Integer> mapVilles = new HashMap<>();
		mapVilles.put("Lyon", 69);
		mapVilles.put("Bordeaux", 33);
		mapVilles.put("Lille", 59);
		for(String e : mapVilles.keySet()) {
			System.out.println(e);
		}
		for(int e : mapVilles.values()) {
			System.out.println(e);
		}
		System.out.println(mapVilles.size());
		
		
		
		
		System.out.println("<----------Exo3----------->");
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		Map<Integer, String> map3 =  new HashMap<>();
		map1.putAll(map2);
		map3.putAll(map1);
		System.out.println(map3);
		
		
		
		System.out.println("<----------Exo4----------->");
	}
	
}
