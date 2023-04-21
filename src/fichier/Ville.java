package fichier;

//import org.apache.commons.lang3.builder.EqualsBuilder;

public class Ville {
	private String nom;
	private String pays;
	private Continent continent;
	
	
	public Ville(String nom, String pays, Continent continent) {
        this.nom = nom;
        this.pays = pays;
        this.continent = continent;
    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public Continent getContinent() {
		return continent;
	}


	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	@Override
    public String toString() {
        return "La ville est : " + nom + ", Son pays : " + pays + ", sur le continent : " + continent.getLibelle();
    }
	
}
//	String cp;
//	String nomR;
//	int nbrPop;
	

//	public Ville(String nom, String cp, String nomR, int nbrPop) {
//		super();
//		this.nom = nom;
//		this.cp = cp;
//		this.nomR = nomR;
//		this.nbrPop = nbrPop;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	@Override
//	public String toString() {
//		return "Ville [nbrPop=" + nbrPop + "]";
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public String getCp() {
//		return cp;
//	}
//
//	public void setCp(String cp) {
//		this.cp = cp;
//	}
//
//	public String getNomR() {
//		return nomR;
//	}
//
//	public void setNomR(String nomR) {
//		this.nomR = nomR;
//	}
//
//	public int getNbrPop() {
//		return nbrPop;
//	}
//
//	public void setNbrPop(int nbrPop) {
//		this.nbrPop = nbrPop;
//	}
//
//	public boolean equals(Object object) {
//		if (!(object instanceof Ville)) {
//			return false;
//		}
//		Ville other = (Ville) object;
//		return new EqualsBuilder().append(nom, other.getNom()).append(nbrPop, other.getNbrPop()).isEquals();
//	}


