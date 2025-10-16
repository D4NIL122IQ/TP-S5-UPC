package Television;

public class Reportage extends Programme{
	private String nom;
	private Themes theme;
	
	public Reportage(String n, Themes t, int d, int f) {
		super(d,f);
		nom = n;
		theme = t;
	}
	
	@Override
	public String toString() {
		return "Reportage - nom : " + nom + " Theme : " + theme + " debut-fin : [ " + getHdebut() + " - " + getHfin() +"]";
	}
}
