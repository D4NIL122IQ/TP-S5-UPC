package Television;

public class Journal extends Programme{
	private String presentateur;
	
	public Journal(String p, int d, int f) {
		super(d,f);
		presentateur = p;
	}
	
	@Override
	public String toString() {
		return "Journal - presentateur : " + presentateur + " debut-fin : [ " + getHdebut() + " - " + getHfin() +"]";
	}
}
