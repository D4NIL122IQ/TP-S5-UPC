package calcul;

public class Resultat {
	private long somme;
	
	public Resultat() {
		somme = 0;
	}
	
	public synchronized void ajouter(long x) {
		somme += x;
	}
	
	public long getSomme() {
		return somme;
	}
}
