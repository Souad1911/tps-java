package controleur;

import villagegaulois.Village;

public class ControlAfficherMarche {
	private Village village;

	public ControlAfficherMarche(Village village) {
		this.village = village;
	}

	//TODO
	public String [] donnerInfosMarche() {
		return this.village.donnerEtatMarche();
		
	}
}
