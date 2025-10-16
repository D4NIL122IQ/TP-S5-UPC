package Television;

public class Divertissement extends Programme{
	private String titre;
	private String presentateur;
	
	public Divertissement(String t, String p, int debut) {
		super(debut, debut+2);
		titre = t;
		presentateur = p;
	}
	
	@Override
	public String toString() {
		return "Divertissement - titre : " + titre + " presentateur : " + presentateur + " debut-fin : [ " + getHdebut() + " - " + getHfin() +"]";
	}
}
