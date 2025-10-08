package jeuCombat;

import java.lang.StringBuffer;

public class Personnage {
	private String nom;
	private int pv;
	private Attaque attPerso[] = new Attaque[2];

	public Personnage(String n, int pv, Attaque att1, Attaque att2) {
		nom = n;
		this.pv = pv;
		attPerso[0] = att1;
		attPerso[1] = att2;
	}

	public void diminuerPV(int dimPV) {
		pv -= dimPV;
	}

	public void attaquer(int caseAtt, Personnage p) {
		p.diminuerPV(attPerso[caseAtt].getForce());
		attPerso[caseAtt].diminuerCoup();
	}

	public int getPV() {
		return pv;
	}
	
	public Attaque []getAttaque(){
		return attPerso;
	}
	
	public String toString() {
		StringBuffer temp = new StringBuffer();
		temp.append("nom du perso : " + nom + " - point de vie restant : "+pv + "\n") ;
		temp.append("Attaque du personnage : \n");
		temp.append(attPerso[0].toString() + "\n");
		temp.append(attPerso[1].toString() + "\n");
		
		return temp.toString();
		
	}
	
	public String info() {
		return "nom du perso : " + nom + " - point de vie restant : "+pv + "\n";
	}
}
