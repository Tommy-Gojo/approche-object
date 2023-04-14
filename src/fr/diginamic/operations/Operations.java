package fr.diginamic.operations;

import entites.Cercle;

public class Operations {
	public static double calcul(double a, double b, char opp) {
	    if(opp == '+') {
	    	return a + b;
	    }else if(opp == '-'){
	    	return a - b;
	    }else if(opp == '*') {
	    	return a * b;
	    }else {
	    	return a / b;
	    }
	}
}
