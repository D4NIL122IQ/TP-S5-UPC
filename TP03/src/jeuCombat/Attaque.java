package jeuCombat;

public class Attaque {
	private String nom;
	private int force;
	private int nbrFoisRestant;
	
	public Attaque(String n, int f, int nbr) {
		nom = n;
		force = f;
		nbrFoisRestant = nbr;
	}

	public int getForce() {
		return force;
	}

	public int getNbrFoisRestant() {
		return nbrFoisRestant;
	}

	
	public void diminuerCoup() {
		nbrFoisRestant--;
	}
	
	public String toString() {
		return "nom de l'attaque : "+nom + " - Force : " + force + " - attque restant : "+ nbrFoisRestant ;
	}
}
