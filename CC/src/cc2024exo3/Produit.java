package cc2024exo3;

public class Produit {
	private String nom;
	private double prix;
	private Reduction r;
	public Produit(String nom, double p, Reduction r) throws PrixInvalideException{
		if(prix<0 ) 
			throw new PrixInvalideException("Prix du produit invalide");
		this.nom = nom;
		prix = p;
		this.r = r;
	}
	
	public double prixFinal() throws PrixInvalideException, ReductionInvalideException{
		
		return r.appliquerReduction(prix);
			
	}
	
}
