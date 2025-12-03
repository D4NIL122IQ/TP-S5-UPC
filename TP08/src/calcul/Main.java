package calcul;

public class Main {
	public static void main(String []args) {
		long N = 1000000000;
		int []k = {1, 2, 4, 8, 16, 32, 64, 128, 512, 1024, 2048};
		
		for(int i= 0 ; i<k.length ; i++) {
			long debut = System.currentTimeMillis();
			System.out.println("Somme de " + N + " k : " + k[i] + " == " + SommeParallele.calculer(N, k[i]));
			long fin = System.currentTimeMillis();
			System.out.println("Temps d'execution pour k = " + k[i] + " est de : " + (fin - debut) + "ms");
			
			
			//Temps d'execution pour k = 1 est de : 275ms FIRST
			//Temps d'execution pour k = 2 est de : 243ms
			//Temps d'execution pour k = 4 est de : 243ms
			//Temps d'execution pour k = 8 est de : 241ms  GOOOD
			//Temps d'execution pour k = 16 est de : 244ms
			//Temps d'execution pour k = 32 est de : 245ms STABILISE
			//Temps d'execution pour k = 64 est de : 245ms
			//Temps d'execution pour k = 128 est de : 249ms
			//Temps d'execution pour k = 512 est de : 264ms
			//Temps d'execution pour k = 1024 est de : 282ms WORST
			//Temps d'execution pour k = 2048 est de : 314ms
		}
		
	}
}
