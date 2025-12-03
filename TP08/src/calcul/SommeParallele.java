package calcul;

public class SommeParallele {

	public static long calculer(long N, int k) {
		Resultat r = new Resultat();
		long debut = 0;
		long partie = N / k;
		long fin = partie ;
		for (int i = 0; i < k; i++) {

			CalculateurPartiel c = new CalculateurPartiel(debut, fin, r);

			c.start();
			try {
				c.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			debut = (fin + 1 > N) ? N : fin + 1;
			
			fin = (i+ 1 == k) ? N : fin + partie;

		}
		return r.getSomme();
	}
}
