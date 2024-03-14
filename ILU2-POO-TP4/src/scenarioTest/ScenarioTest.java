package scenarioTest;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.Sanglier; 
import produit.Poisson; 

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Produit>[] marche = new IEtal[3];
		IEtal<Sanglier> etalSanglier = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		
		
		
	
	}
	
}
