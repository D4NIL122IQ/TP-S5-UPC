package cc2024exo3;

public class ReductionFixe implements Reduction{
	private double pr;
	
	public ReductionFixe(double p) throws ReductionInvalideException {
		if (p<0)
			throw new ReductionInvalideException("Prix reduction negatif");
		pr = p;
	}
	
	public double appliquerReduction(double prix) throws ReductionInvalideException{
		if (pr<0 || pr > prix) {
			throw new ReductionInvalideException("Reduction impossible");
		}else {
			return prix - pr;
		}
	}
}
