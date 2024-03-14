package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					//TO DO 
					System.out.println("Bienvenue Villageaois "+nomVisiteur);
					int choixForce = Clavier.entrerEntier("Quelle est votre force ?");
					
					break;

				default:
					System.out.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		System.out.println("Bienvenue Druide " + nomVisiteur);
		StringBuilder questionForce = new StringBuilder ("Quelle est votre force ");
		int choixForce = Clavier.entrerEntier(questionForce.toString());
		int choixEffectPotionMin = Clavier.entrerEntier("Quelle est la force de la potion la plus faible que vous produisez ?");
		int choixEffectPotionMax = Clavier.entrerEntier("Quelle est la force de la potion la plus forte que vous produisez ?");
		
		while (choixEffectPotionMax<choixEffectPotionMin) {
			System.out.println("Attention Druide , vous vous etes trompé entre le minimum et le maximum ");
			choixEffectPotionMin = Clavier.entrerEntier("Quelle est la force de la potion la plus faible que vous produisez ?");
			choixEffectPotionMax = Clavier.entrerEntier("Quelle est la force de la potion la plus forte que vous produisez ?");
			this.controlEmmenager.ajouterDruide(nomVisiteur, choixForce, choixEffectPotionMin, choixEffectPotionMax);
		}
	}
}

