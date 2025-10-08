package exo1;

import up.mi.jgm.maths.Rationnel;
import up.mi.jgm.maths.Complexe;
public class Utilitaire {
	public static Rationnel puissance(Rationnel r, int n) {
		Rationnel temp = new Rationnel(1);
		
		for(int i=1; i<= n; i++) {
			temp = temp.multiplication(r);
		}
		return temp;
	}
	
	public static Complexe somme(Complexe c1, Complexe c2) {
		
		double pr = c1.getPartieReelle() + c2.getPartieReelle();
		double pi = c1.getPartieImaginaire() + c2.getPartieImaginaire();
		
		return new Complexe(pr,pi);
	}
	
	public static Complexe multiplication(Complexe c1, Complexe c2) {
		double pr = c1.getPartieReelle() * c2.getPartieReelle();
		double pi = c1.getPartieImaginaire() * c2.getPartieImaginaire();
		
		return new Complexe(pr-pi, pr+pi);
	}
}
