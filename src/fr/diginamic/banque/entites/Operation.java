package fr.diginamic.banque.entites;

public abstract class Operation {
	String DateOfOp;
	int MontOfOp;
	
	
	public Operation(String dateOfOp, int montOfOp) {
		
		DateOfOp = dateOfOp;
		MontOfOp = montOfOp;
	}


	@Override
	public String toString() {
		return getType()+" [La date de l'operation est le " + DateOfOp + ", Le montant de l'operation est le " + MontOfOp + "]";
	}
	
	public abstract String getType();
	public int getMontant() {
		return MontOfOp;
	}
	
}
