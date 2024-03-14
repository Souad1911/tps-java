package produit;
import personnages.Gaulois; 

public class Sanglier extends Produit  {
	private Gaulois chasseur ;
	private int poids ;

	
	public Sanglier (int poids , Gaulois chasseur ) {
		super ("sanglier", "kg");
		this.chasseur = chasseur;
		this.poids = poids;
		
	}
	public String description() {
		return (super.getName() + " de " + this.poids + " kg chassé par " + this.chasseur);
	}
	

}
