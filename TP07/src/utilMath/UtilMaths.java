package utilMath;

/**
 * Classe utilitaire pour quelques operations mathematiques
 * 
 */
public class UtilMaths {
	/**
	 * Calcule la somme de trois nombres entiers.
	 * 
	 * @param a le premier terme
	 * @param b le deuxieme terme
	 * @param c le troisieme terme
	 * @return la somme a + b + c
	 */
	public static int somme3(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * Calcule la factorielle d'un nombre entier. On ne gere pas pour l'instant le
	 * cas d'erreur ou n est inferieur a 1.
	 * 
	 * @param n le nombre dont on retourne la factorielle
	 * @return la factorielle de l'entier n
	 * @throws IllegalArgumentException si n est negatif
	 */
	public static long fact(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException("On ne peut pas calculer la factorielle d'un nombre negatif : " + n);
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

	/**
	 * Calcule la combinaison p parmi n.
	 * 
	 * @param n cardinal de l'ensemble global
	 * @param p cardinal des parties
	 * @return le nombre de parties de taille p dans un ensemble de taille n
	 * @throws IllegalArgumentException si p est plus grand que n
	 */
	public static long comb(int n, int p) throws IllegalArgumentException {
		if (p > n)
			throw new IllegalArgumentException("On ne peut pas calculer la combinaison de " + p + " parmi " + n);
		return fact(n) / (fact(p) * fact(n - p));
	}

	/**
	 * Calcule la puissance m-ieme d'in entier n. On considere uniquement le cas ou
	 * m est positif ou nul.
	 * 
	 * @param n le nombre qu'on eleve a la puissance m-ieme
	 * @param m la puissance
	 * @return n puissance m
	 * @throws IllegalArgumentException si m est negatif
	 */
	public static long puissance(int n, int m) throws IllegalArgumentException {
		if (m < 0)
			throw new IllegalArgumentException("On ne peut pas elever un nombre a la puissance " + m);
		if (m == 0)
			return 1;
		return n * puissance(n, m - 1);
	}

}
