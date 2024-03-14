package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		//TODO a completer
		if (this.controlPrendreEtal.verifierIdentite(nomVendeur)) {
			StringBuilder chaine1 = new StringBuilder("Je suis désolée ");
			chaine1.append(nomVendeur);
			chaine1.append(" mais uniquement les habitants peuvent y commercer");
			System.out.println(chaine1.toString());
		} else {
			if (!this.controlPrendreEtal.resteEtals()) {
				StringBuilder chaine2 = new StringBuilder("Je suis désolée ");
				chaine2.append(nomVendeur);
				chaine2.append(" mais je n'ai plus d'étals libres");
				System.out.println(chaine2.toString());
			} else {
				this.installerVendeur(nomVendeur);
			}
		}
	}
	
	

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		System.out.println(
				"C'est parfait, il me reste un étal pour vous ! \nIl me faudrait quelques renseignements : \nQuel produit souhaitez-vous vendre ?");
		String produit = this.scan.next();
		int nbProduit = Clavier.entrerEntier("Combien souhaitez-vous vendre");
		int numEtal = this.controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		StringBuilder chaine3 = new StringBuilder("Le vendeur ");
		chaine3.append(nomVendeur);
		chaine3.append(" s'est installé à l'étal n°");
		chaine3.append(numEtal + 1);
		System.out.println(chaine3.toString());
	
	}
	
}
