package entites;

public class AdressePostale {
	
	 private int numeroDeRue;
	 private String libelleDeLaRue;
	 private int codePostal;
	 private String ville;
	
	
	 AdressePostale(int numeroDeRue,String libelleDeLaRue,int codePostal,String ville){
		 this.numeroDeRue = numeroDeRue;
		 this.libelleDeLaRue = libelleDeLaRue;
		 this.codePostal = codePostal;
		 this.ville = ville;
		 
	 }


	@Override
	public String toString() {
		return "AdressePostale [numeroDeRue=" + numeroDeRue + ", libelleDeLaRue=" + libelleDeLaRue + ", codePostal="
				+ codePostal + ", ville=" + ville + "]";
	}
	 
	
	
	
	
	
	
	
	
/*   int numeroDeRue;
String libelleDeLaRue;
int codePostal;
String ville;

public AdressePostale(int numeroDeRue,String libelleDeLaRue,int codePostal,String ville){
	this.numeroDeRue = numeroDeRue;
	this.libelleDeLaRue = libelleDeLaRue;
	this.codePostal = codePostal;
	this.ville = ville;
}
}
*/



}
	