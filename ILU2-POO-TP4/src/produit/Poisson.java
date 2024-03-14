package produit;

	public class Poisson extends Produit {
		private String dateDePeche;

		public Poisson(String dateDePeche) {
			super("poisson", "kg");
			this.dateDePeche = dateDePeche;
		}

		
		public String description() {
			return (super.getName() + " pêchés " + this.dateDePeche);
		}

	}


