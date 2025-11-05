package ExceptionWUtilMath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathMenu1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		int choix = lireEntierClavier(sc,"");
		if ((choix < 1) || (choix > 4)) {
			System.err.println("Le choix " + choix + " n'est pas valide.");
			System.exit(1);
		}

		switch (choix) {
		case 1:
			somme(sc);
			break;
		case 2:
			factorielle(sc);
			break;
		case 3:
			combinaison(sc);
			break;
		case 4:
			puissance(sc);
		}

		sc.close();
	}

	private static void menu() {
		System.out.println("Quelle operation souhaitez-vous effectuer ?");
		System.out.println("1 Somme de trois entiers");
		System.out.println("2 Factorielle d'un entier");
		System.out.println("3 Combinaison de deux entiers");
		System.out.println("4 Puissance d'un entier");
	}

	private static void somme(Scanner sc) {
		System.out.println("Quels entiers souhaitez vous additionner ?");
		int n1 = lireEntierClavier(sc,"n1 = ");
		int n2 = lireEntierClavier(sc,"n2 = ");
		int n3 = lireEntierClavier(sc,"n3 = ");
		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + UtilMath.somme3(n1, n2, n3));
	}

	private static void factorielle(Scanner sc) {
		System.out.println("De quel nombre souhaitez vous calculer la factorielle ?");
		int n = lireEntierClavier(sc,"n = ");
		System.out.println(n + "! = " + UtilMath.factRec(n));
	}

	private static void combinaison(Scanner sc) {
		System.out.println("De quels nombres souhaitez vous calculer la combinaison ?");
		int p = lireEntierClavier(sc,"p = ");
		int n = lireEntierClavier(sc,"n = ");
		System.out.println("Le nombre de combinaisons de " + p + " parmi " + n + " est " + UtilMath.comb(n, p));
	}

	private static void puissance(Scanner sc) {
		System.out.println("Quel entier n souhaitez vous elever a la puissance m ?");
		int n = lireEntierClavier(sc, "n = ");
		int m = lireEntierClavier(sc, "m = ");
		System.out.println(n + " puissance " + m + " est egal a " + UtilMath.puissance(n, m));
	}

	private static int lireEntierClavier(Scanner sc, String msg) {
		boolean cb = false;
		int n = 0;
		do {
			try {
				System.out.print(msg);
				n = sc.nextInt();
				sc.nextLine();
				cb = true;
			} catch (InputMismatchException ime) {
				System.out.println("Erreur - Veuillez entrez un entier");
				sc.nextLine();

			}
		} while (!cb);
		return n;
	}

}
