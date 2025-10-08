package exo1;

import up.mi.jgm.maths.Complexe;
import up.mi.jgm.maths.Rationnel;



public class TestRationnelComplexe {
	public static void main(String []args) {
		long ratio= 2;
		int n= 3;
		Rationnel r = new Rationnel(ratio);
		
		System.out.println(Utilitaire.puissance(r, n));
		
	}
}
