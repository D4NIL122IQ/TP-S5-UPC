package Produits;

public class Livre extends Produit{
	private String titre;
	private String auteur;
	private int isbn;
	private static int ISBN = 0;
	
	public Livre(String t, String a, double prixHT) {
		super(prixHT, TVA.REDUIT);
		titre = t;
		auteur = a;
		isbn = ISBN+1;
		ISBN++;		
	}
	
	public String toString() {
		return "Livre - titre : "+ titre + " auteur : "+ auteur + " prix HT : " + getHT() + " prix TTC : " + getTTC() + " taux : "+ getTaux();
	}
}
