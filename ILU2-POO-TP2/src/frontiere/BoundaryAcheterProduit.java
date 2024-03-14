package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		//TODO
		System.out.println("Quel produit voulez-vous acheter ?");
		String choixProduit = this.scan.next();
		String[] marchands = this.controlAcheterProduit.infoMarchants(choixProduit);
		if (marchands.length == 0) {
			System.out.println("Désolé personne ne vends ce produit au marché");
		} else {
			StringBuilder listeMarchands = new StringBuilder("Chez quel commerçant voulez-vous acheter des fleurs ?\n");
			for (int i = 0; i < marchands.length; i++) {
				listeMarchands.append(i + 1);
				listeMarchands.append(" - ");
				listeMarchands.append(marchands[i]);
				listeMarchands.append("\n");
			}
			int choixUtilisateur;
			choixUtilisateur = Clavier.entrerEntier(listeMarchands.toString());
			while (choixUtilisateur > marchands.length || choixUtilisateur < 1) {
				System.out.println("Vous devez choisir le chiffre derière un des marchands !");
				choixUtilisateur = Clavier.entrerEntier(listeMarchands.toString());
			}
			String nomVendeur = marchands[choixUtilisateur - 1];
			StringBuilder chaine = new StringBuilder(nomAcheteur);
			chaine.append("se déplace jusqu'à l'étal de ");
			chaine.append(nomVendeur);
			chaine.append("\n Combien de ");
			chaine.append(choixProduit);
			chaine.append(" voules-vous acheter ?");
			choixUtilisateur = Clavier.entrerEntier(chaine.toString());
			int quantiteAchetable = this.controlAcheterProduit.quantité_achetable(choixUtilisateur, nomVendeur);
			if (quantiteAchetable == 0) {
				StringBuilder chaine2 = new StringBuilder(nomAcheteur);
				chaine2.append(" veut acheter ");
				chaine2.append(choixUtilisateur);
				chaine2.append(" ");
				chaine2.append(choixProduit);
				chaine2.append(", malheureusement il n'y en a plus !");
				System.out.println(chaine2.toString());
			} else if (quantiteAchetable < choixUtilisateur) {
				StringBuilder chaine2 = new StringBuilder(nomAcheteur);
				chaine2.append(" veut acheter ");
				chaine2.append(choixUtilisateur);
				chaine2.append(" ");
				chaine2.append(choixProduit);
				chaine2.append(", malheureusement ");
				chaine2.append(nomVendeur);
				chaine2.append(" n'en a plus que ");
				chaine2.append(quantiteAchetable);
				chaine2.append(". ");
				chaine2.append(nomAcheteur);
				chaine2.append(" achète tout le stock de ");
				chaine2.append(nomVendeur);
				System.out.println(chaine2.toString());
			} else {
				StringBuilder chaine2 = new StringBuilder(nomAcheteur);
				chaine2.append(" Achète ");
				chaine2.append(choixUtilisateur);
				chaine2.append(" ");
				chaine2.append(choixProduit);
				chaine2.append(" à ");
				chaine2.append(nomVendeur);
				System.out.println(chaine2.toString());
			}
		}
	}
}
