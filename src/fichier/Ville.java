package fichier;

public class Ville {
	String nom;
	String cp;
	String nomR;
	int nbrPop;
	
	public Ville(String nom, String cp, String nomR, int nbrPop) {
		super();
		this.nom = nom;
		this.cp = cp;
		this.nomR = nomR;
		this.nbrPop = nbrPop;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getNomR() {
		return nomR;
	}

	public void setNomR(String nomR) {
		this.nomR = nomR;
	}

	public int getNbrPop() {
		return nbrPop;
	}

	public void setNbrPop(int nbrPop) {
		this.nbrPop = nbrPop;
	}
	
}
