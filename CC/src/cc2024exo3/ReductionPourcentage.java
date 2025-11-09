package cc2024exo3;

public class ReductionPourcentage implements Reduction{
	private float pourcentage;
	
	public ReductionPourcentage(float prc) throws ReductionInvalideException{
		if (pourcentage < 0 || pourcentage > 100)
			throw new ReductionInvalideException("Pourcentage reduction invalide");
		pourcentage = prc;
	}
	
	public double appliquerReduction(double prix) throws ReductionInvalideException{
		if (prix < 0) 
			throw new ReductionInvalideException("Reduction impossible");
		
		return prix - prix * pourcentage;
		
	}
	
}
