package exo7;

import java.util.Scanner;

public class JeuNombre {
	public static void main(String[] args) {
		int bornsup = 100;
		int borninf = 1;
		int resultat = 0;
		boolean trouver = false;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Pensez a un nombre !!");

		while (!trouver) {
			System.out.println("Ma proposition est "+resultat);
			System.out.println("Est-ce que c'est +, - ou =");
			String caractere = clavier.nextLine();

			if ((caractere.equals("=")) || (borninf == bornsup)) {
				System.out.println("Victoire !");
				trouver = !trouver;
			} else if (caractere.equals("+")) {
				borninf = resultat;
				resultat = (borninf + bornsup) / 2;
			} else if (caractere.equals("-")) {
				bornsup = resultat;
				resultat = (borninf + bornsup) / 2;
			}
		}
		clavier.close();

	}
}
