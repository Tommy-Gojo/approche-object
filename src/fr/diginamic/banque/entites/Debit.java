package fr.diginamic.banque.entites;

public class Debit extends Operation{

	public Debit(String dateOfOp, int montOfOp) {
		super(dateOfOp, montOfOp);
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return "DEBIT";
	}
	
}
