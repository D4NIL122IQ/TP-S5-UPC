package Produits;

public enum TVA {
	NORMAL(20), INTERMEDIAIRE(10), REDUIT(5.5), PARTICULIER(2.1);
	
	private final double taux;
	
	private TVA(double taux) {
		this.taux = taux;
	}
	
	public double getTaux() {
		return this.taux;
	}
	
}
