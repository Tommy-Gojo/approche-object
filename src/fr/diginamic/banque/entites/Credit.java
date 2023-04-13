package fr.diginamic.banque.entites;

public class Credit extends Operation{
	
	
	public Credit(String dateOfOp, int montOfOp) {
		super(dateOfOp, montOfOp);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return "CREDIT";
	}

	
	
}
