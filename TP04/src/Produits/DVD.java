package Produits;

public class DVD extends Produit{
	private String titre;
	private String realisateur;
	
	public DVD(String t, String r, double prixHT) {
		super(prixHT, TVA.NORMAL);
		titre =t;
		realisateur = r;
	}
	
	public String toString() {
		return "DVD - titre : "+ titre + " realistauer: "+ realisateur + " prix HT : " + getHT() + " prix TTC : " + getTTC() + " taux : "+ getTaux();
	}
}
