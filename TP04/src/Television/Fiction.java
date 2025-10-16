package Television;

public class Fiction extends Programme{
	private String titre;
	private String nRealisateur;
	private boolean redif;
	
	public Fiction(String t, String n, boolean r, int debut, int fin) {
		super(debut, fin);
		titre = t;
		nRealisateur = n;
		redif = r;
	}
	
	
	@Override
	public String toString() {
		return "Fiction - titre : " + titre + " realisateur : " + nRealisateur + " rediffusion : " + redif +" debut-fin : [ " + getHdebut() + " - " + getHfin() +"]";
	}
}
