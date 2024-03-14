package controleur;

import villagegaulois.Etal;
import personnages.Gaulois;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		//TO DO 
		Gaulois gaulois = this.village.trouverHabitant(nomVendeur);
		return this.village.rechercherEtal(gaulois);

		//Etal etal = null;
		//return etal;
	}
}
