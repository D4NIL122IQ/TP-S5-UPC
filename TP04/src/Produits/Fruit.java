package Produits;

public class Fruit extends Produit{
	private String nom;
	private String origine;
	
	public Fruit(String n, String o, double prixHT) {
		super(prixHT, TVA.REDUIT);
		nom = n;
		origine = o;
	}
	
	public String toString() {
		return "Fruit - nom : "+ nom + " origine: "+ origine + " prix HT : " + getHT() + " prix TTC : " + getTTC() + " taux : "+ getTaux();
	}
	
}
