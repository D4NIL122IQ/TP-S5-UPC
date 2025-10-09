package promoEtudiant;

import java.util.ArrayList;
import java.lang.StringBuffer;

public class Promotion {
	/*
	 * dans la promo on a une liste d'etudiant et une liste d'EU la liste d'etudiant est la meme pour tout les UE
	 */
	private ArrayList<Etudiant> lstEtd;
	private ArrayList<UniteEnseignement> UEs;
	
	public Promotion(ArrayList<UniteEnseignement> ues, ArrayList<Etudiant> le) {
		UEs = ues;
		lstEtd = le;
	}
	
	public void ajouterEtudiant(Etudiant e) {
		lstEtd.add(e);
	}
	
	public void ajouterNoteCCEtudiantUE(String nomUE, float cc) {
		for(UniteEnseignement ue : UEs) {
			if(ue.getNomUE().equals(nomUE)) {
				ue.ajouterNoteCCEEtudiant(nomUE, cc);
				return;
			}
		}
	}
	
	public void ajouterNoteEXEtudiantUE(String nomUE, float ex) {
		for(UniteEnseignement ue : UEs) {
			if(ue.getNomUE().equals(nomUE)) {
				ue.ajouterNoteEXEEtudiant(nomUE, ex);
				return;
			}
		}
	}
	
	public float moyenneGlobalPromo() {
		float mg = 0 ;
		for(UniteEnseignement ue : UEs) {
			mg += ue.getMoyenneUE();
		}
		
		return mg / UEs.size();
	}
	
	public String affichageMajorParUE() {
		StringBuffer temp = new StringBuffer("---- Major Promo/UE ----");
		for(UniteEnseignement ue : UEs) {
			temp.append(ue.getMajor());
		}
		
		return temp.toString();
	}
}
