package exo2;

public class UtilMath {
	public static int somme3(int a, int b, int c) {
		return a + b + c;
	}

	public static long factIt(int n) {
		int somme = 1;
		while (n != 1) {
			somme *= n;
			n--;
		}
		return somme;

	}

	public static long comb(int n, int p) {
		return factIt(n) / (factIt(p) * factIt(n - p));
	}

	public static long puissance(int n, int m) {
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			temp *= n;
		}
		return temp;
	}

	public static int max2(int a, int b) {

		return (a < b) ? b : a;
	}

	public static int max3v1(int a, int b, int c) {
		int temp;
		if ((a < b) && (c < b)) {
			temp = b;
		} else if ((b < a) && (c < a)) {
			temp = a;
		} else {
			temp = c;
		}

		return temp;
	}

	public static int max3v2(int a, int b, int c) {
		return max2(a, max2(b, c));
	}

	public static double moyenneTab(double tab[]) {
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme / tab.length;
	}

	public static double mediane() {
		return 0;
	}

}
