package Produits;

public class Medicament extends Produit{
	private String nom;
	private String labo;
	private int nbrComprimes;
	
	public Medicament(String n, String l, int nbr ,double prixHT) {
		super(prixHT, TVA.PARTICULIER);
		nom = n;
		labo = l;
		nbrComprimes = nbr;
	}
	
	public String toString() {
		return "Medicament - nom : "+ nom + " laboratoire : "+ labo + " nombre de comprimes :" + nbrComprimes 
				+ " prix HT : " + getHT() + " prix TTC : " + getTTC() + " taux : "+ getTaux();
	}
}
