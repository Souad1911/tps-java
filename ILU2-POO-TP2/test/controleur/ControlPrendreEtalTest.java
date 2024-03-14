package controleur;

import static org.junit.jupiter.api.Assertions.*;
import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class ControlPrendreEtalTest {
	private Village village;
	private Chef abraracourcix;
	private Gaulois asterix;
	private ControlVerifierIdentite controlVerifierIdentite;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initialisation...");
		this.asterix = new Gaulois("asterix", 12);
		this.village = new Village("le village des irréductibles", 10, 5);
		this.abraracourcix = new Chef("abraracourcix", 10, this.village);
		this.village.setChef(this.abraracourcix);
		this.village.ajouterHabitant(this.asterix);
		this.controlVerifierIdentite = new ControlVerifierIdentite(this.village) ;
	}
	

	@Test
	void testControlPrendreEtal() {
		ControlPrendreEtal  controlPrendreEtal = new ControlPrendreEtal (this.controlVerifierIdentite , this.village);
		assertNotNull(controlPrendreEtal, "Constructeur ne renvoie pas null");
		//fail("Not yet implemented");
	}
	@Test 
	void testResteEtals() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(this.controlVerifierIdentite, this.village);
		assertTrue(controlPrendreEtal.resteEtals());
		Gaulois bonemine = new Gaulois("bonemine", 5);
		Gaulois obelix = new Gaulois("obelix", 5);
		Gaulois frank = new Gaulois("frank", 5);
		Gaulois barnabe = new Gaulois("barnabe", 5);
		this.village.installerVendeur(barnabe, "fraises", 10);
		this.village.installerVendeur(frank, "fraises", 10);
		this.village.installerVendeur(obelix, "fraises", 10);
		this.village.installerVendeur(bonemine, "fraises", 10);
		this.village.installerVendeur(this.asterix, "fraises", 10);
		assertFalse(controlPrendreEtal.resteEtals());
	}

	@Test
	void testPrendreEtal() {

	}

	@Test
	void testVerifierIdentite() {
		ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(this.village);
		assertTrue(controlVerifierIdentite.verifierIdentite("asterix"));
		assertFalse(controlVerifierIdentite.verifierIdentite("obelix"));
		//fail("Not yet implemented");
		
	}

}
