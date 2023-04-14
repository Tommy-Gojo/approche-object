package fr.diginamic.entites;

public class Theatre {
	String name;
	static int nbOfPersMax;
	static int ttlOfPersSub;
	int rctTotale;
	
	public static void sub(int nbClients, int price) {
		if(nbOfPersMax < 100 ) {
			int calc = (ttlOfPersSub+=nbClients) * price ;
			System.out.println(calc);
		}else {
			System.out.println("erreur, la capacité max a été atteinte");
		}
	} 
}
