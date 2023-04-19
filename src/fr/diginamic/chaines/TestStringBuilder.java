package fr.diginamic.chaines;

public class TestStringBuilder {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long debut = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long fin = System.currentTimeMillis();
        long tempsEcoule = fin - debut;
        System.out.println("Temps écoulé en millisecondes avec StringBuilder : " + tempsEcoule);
    }
//	public static void main(String[] args) {
//        String result = "";
//        long debut = System.currentTimeMillis();
//
//        for (int i = 1; i <= 100000; i++) {
//            result += i;
//        }
//
//        long fin = System.currentTimeMillis();
//        long tempsEcoule = fin - debut;
//        System.out.println("Temps écoulé en millisecondes sans StringBuilder : " + tempsEcoule);
//    }
}
