package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		//TODO
		if (! this.controlLibererEtal.isvendeur(nomVendeur)) {
			System.out.println(" Mais vous n'etes pas inscrit sur notre marché aujourd'hui!");
			
		}else {
			String []donneesEtal = this.controlLibererEtal.libererEtal(nomVendeur);
			Boolean etalOccupe = Boolean.valueOf (donneesEtal[0]);
			if (etalOccupe) {
				StringBuilder chaine = new StringBuilder ("Vous avez vendu ");
				chaine.append(donneesEtal[2]);
				chaine.append("sur");
				chaine.append(donneesEtal[3]);
				chaine.append(" ");
				chaine.append(donneesEtal[4]);
				chaine.append(".\n");
				chaine.append("En revoir ");
				chaine.append( donneesEtal[1]);
				chaine.append(" , passez une bonne journée");
				System.out.println(chaine.toString());
				
				
				
				
			}
			
			
		}
		
	}

}
