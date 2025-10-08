package jeuCombat;

import java.util.Scanner;

public class Jeu {
	private Personnage persoH;
	private Personnage persoR;
	private Combat jeu;

	private void menuChoixJoueur(Personnage[] persoDispo) {
		Scanner clavier = new Scanner(System.in);
		int index = 0;
		System.out.println("---- Choix Joeur ----");
		for (int i = 0; i < persoDispo.length; i++) {
			System.out.println("Tapez " + i + " pour personnage : \n");
			System.out.println(persoDispo[i]);
		}
		System.out.println("\n votre choix : ");

		do {
			index = clavier.nextInt();
		} while (index > 2 || index < 0);

		persoH = persoDispo[index];
		jeu.choixHumain(index);
		
	}

	private void choixAttaque() {
		Attaque t[] = persoH.getAttaque();
		Scanner clavier = new Scanner(System.in);
		int index = 0; 
		for (int i = 0; i < 2; i++) {
			System.out.println("Tapez " + i + " pour l'attaque : \n");
			System.out.println(t[i]);
		}
		do {
			System.out.println("Votre attaque : ");
			index = clavier.nextInt();
			if((index>= 0 || index <=1 )&& (t[index].getNbrFoisRestant() == 0)) {
				System.out.println("CHanger d'attaque vous n'avez plus le droit d'utiliser cette attaque \n");
			}
		}while(index<0 || index >1);
		
		persoH.attaquer(index, persoR);
		System.out.println("Votre attaque : " + t[index]);
		

	}

	private void listerPerso() {
		System.out.println("Votre Personnage : " + persoH);
		System.out.println("\nPersonnage robot : " + persoR);
	}
	
	private void attaqueRando() {
		int index = (Math.random() < 0.5) ? 0 : 1;
		persoR.attaquer(index, persoH);
		System.out.println("L'attaque du robot : " + persoR.getAttaque()[index]);
		
	}
	
	private void afficherInfo() {
		System.out.println("Votre Personnage : " + persoH.info());
		System.out.println("\nPersonnage robot : " + persoR.info());
	}

	public void game() {
		int gg = 0;
		jeu = new Combat();
		menuChoixJoueur(jeu.getPersos());
		persoR = jeu.getRandomPerso();

		listerPerso();

		System.out.println("---- Debut -----");
		while (gg == 0) {
			afficherInfo();
			choixAttaque();
			gg = jeu.verifierGG(persoH, persoR);
			if(gg == 0) {
				attaqueRando();
				gg = jeu.verifierGG(persoH, persoR);
			}
			
		}

		System.out.println("---- Fin  -----");
		afficherInfo();
		if (gg == 2) {
			System.out.println("---- GGGGGG -----");
		} else {
			System.out.println("---- BOOOOOOOOOO 😂 -----");
		}
		
	}

}
