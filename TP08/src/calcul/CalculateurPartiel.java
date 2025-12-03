package calcul;



public class CalculateurPartiel extends Thread {
	private long debut;
	private long fin;
	private Resultat rs;
	public CalculateurPartiel(long debut, long fin, Resultat rs) {
		this.debut = debut;
		this.fin = fin;
		this.rs = rs;
	}
	

	public void run() {
		long temp = debut;
		//System.out.println("Thread = " + debut + " " + fin );
		for(long i = debut + 1 ; i<= fin; i++ ) {
			temp += i;
		}
		
		rs.ajouter(temp);
	}
}
