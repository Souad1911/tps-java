package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		if( this.controlAfficherMarche.donnerInfosMarche().length ==0){
			System.out.println( " Le marché est vide , revenez plus tard .");
			
		}else {
			String [] infosMarche = this.controlAfficherMarche.donnerInfosMarche();
			StringBuilder chaine = new StringBuilder (nomAcheteur);	
			chaine.append( ", vous trouverez au marche :\n");
			for (int i=0 ; i <infosMarche.length; i++) {
				chaine.append("-");
				chaine.append(infosMarche[i]);
				chaine.append(" qui vend ");
				chaine.append(infosMarche[i]);
				chaine.append(" ");
				chaine.append(infosMarche[i]);
				chaine.append(" . \n ");
				
				
				
			}
			System.out.println(chaine.toString());
			
			
			
			
			
		}
		
		

	}
}
