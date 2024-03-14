package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;
	private ControlAfficherMarche controlAfficherMarche;
	

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	//ToDO
	public boolean verfierIdentite(String nomVendeur) {
		return this.controlVerifierIdentite.verifierIdentite(nomVendeur);
	}
	
	public Etal trouverEtal(String nomVendeur) {
		return this.controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		
	}
	public String[] infosMarche() {
		return this.controlAfficherMarche.donnerInfosMarche();
	}
	public String[] infoMarchants(String produit) {
		Gaulois[] infoVendeur = this.village.rechercherVendeursProduit(produit);
		String[] infoMarchand = new String[infoVendeur.length];
		for (int i = 0; i < infoVendeur.length; i++) {
			System.out.println("le prblm est ici");
		
			if (infoVendeur[i]!=null) {
			infoMarchand[i] = infoVendeur[i].getNom();
			}
		}
		return infoMarchand;
	}
	public int quantité_achetable(int quantité, String nomVendeur) {
		// TODO Auto-generated method stub
		
		return this.trouverEtal(nomVendeur).acheterProduit(quantité);
	}
	
	
	
}
