package Produits;

public abstract class Produit {
	
	private double PHT;
	private TVA tva;
	
	public Produit(double PHT, TVA taux) {
		this.PHT = PHT;
		tva = taux;
	}
	
	public double getHT() {
		return PHT;
	}
	
	public double getTaux() {
		return tva.getTaux();
	}
	public double getTTC() {
		return PHT + (PHT * (tva.getTaux() / 100));
	}
}
