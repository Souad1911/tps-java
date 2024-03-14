package controleur;

import static org.junit.jupiter.api.Assertions.*;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ControlVerifierIdentiteTest {
	private Village village;
	private Chef abraracourcix;
	private Gaulois asterix;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initialisation...");
		this.asterix = new Gaulois("asterix", 12);
		this.village = new Village("le village des irréductibles", 10, 5);
		this.abraracourcix = new Chef("abraracourcix", 10, this.village);
		this.village.setChef(this.abraracourcix);
		this.village.ajouterHabitant(this.asterix);
	}
	@Test
	void testControlVerifierIdentite() {
		ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(this.village);
		assertNotNull(controlVerifierIdentite, "Constructeur ne renvoie pas null");
		
		//fail("Not yet implemented");
		
	}

	@Test
	void testVerifierIdentite() {
		ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(this.village);
		assertTrue(controlVerifierIdentite.verifierIdentite("asterix"));
		assertFalse(controlVerifierIdentite.verifierIdentite("obelix"));
		
		//fail("Not yet implemented");
		
	}

}
